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
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int setRegistrationRepo(LoginRegistartionModel loginRegistartion) {
		
		//int newRegUserID = 0;
		String newRegUserID="";
		try {
			System.out.println("====="+loginRegistartion.getUserId());
			newRegUserID = (String) sessionFactory.getCurrentSession().save(loginRegistartion); //Will return newly inserted record
			
			UserDetailModel userDetailMod = new UserDetailModel();
			userDetailMod.setUserID(newRegUserID);
			sessionFactory.getCurrentSession().save(userDetailMod);
			return 1;
			//int res = query.executeUpdate(); // Will Return How many record got effected.
			//logger.info("Command successfully executed :: Record Effected : " + res);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : User Already Exist");
			sessionFactory.getCurrentSession().flush();
		}
		
		return 1;
	}
	
}
