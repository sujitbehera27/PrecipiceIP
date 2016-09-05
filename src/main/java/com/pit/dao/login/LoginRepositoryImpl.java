package com.pit.dao.login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pit.model.LoginRegistartionModel;
import com.pit.model.UserDetailModel;


@Component
public class LoginRepositoryImpl implements LoginRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	public static Logger logger = LoggerFactory.getLogger(LoginRepositoryImpl.class);
	
	
	@Override
	public LoginRegistartionModel getLoginRepo(LoginRegistartionModel loginRegistartionModel) {
		
		Query query = sessionFactory.getCurrentSession().getNamedQuery("QUERY_LOGIN_AUTH");
		query.setParameter("emailID", loginRegistartionModel.getEmailID()); 
		query.setParameter("password", loginRegistartionModel.getPassword()); 
		
		try {
			List<LoginRegistartionModel>  listLoginRegMod = query.list();
			if(!listLoginRegMod.isEmpty() && null != listLoginRegMod){
				logger.info("User trying to login : " + listLoginRegMod.get(0));
				return (LoginRegistartionModel)listLoginRegMod.get(0);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public LoginRegistartionModel setRegistrationRepo(LoginRegistartionModel loginRegistartion) {
		
		try {
			sessionFactory.getCurrentSession().save(loginRegistartion); //Will return newly inserted record
			
			int newRegUserID = 0;

			UserDetailModel userDetailMod = new UserDetailModel();
			userDetailMod.setRegUserID(newRegUserID);
			sessionFactory.getCurrentSession().save(userDetailMod);
			
			// TODO : What should I return.
			
			//int res = query.executeUpdate(); // Will Return How many record got effected.
			//logger.info("Command successfully executed :: Record Effected : " + res);
			
		}catch (Exception e) {
		}
		
		return null;
	}
	
}
