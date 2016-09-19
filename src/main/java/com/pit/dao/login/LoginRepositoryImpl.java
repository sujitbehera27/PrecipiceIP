package com.pit.dao.login;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
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
	public String getLoginRepo(LoginRegistartionModel loginRegistartionModel) {
		
		Query query = sessionFactory.getCurrentSession().getNamedQuery("QUERY_LOGIN_AUTH");
		query.setParameter("userId", loginRegistartionModel.getUserId()); 
		query.setParameter("password", loginRegistartionModel.getPassword()); 
		
		try {
			List<LoginRegistartionModel>  listLoginRegMod = query.list();
			if(!listLoginRegMod.isEmpty() && null != listLoginRegMod){
				logger.info("User trying to login : " + listLoginRegMod.get(0));
				
				/*query = sessionFactory.getCurrentSession().getNamedQuery("QUERY_USER_DETAIL_ID");
				query.setParameter("userID", listLoginRegMod.get(0).getUserId());
				List<UserDetailModel>  userDetailModList = query.list();*/
				
				return listLoginRegMod.get(0).getUserId();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean setRegistrationRepo(LoginRegistartionModel loginRegistartion) {
		
		try {
			System.out.println("====="+loginRegistartion.getUserId());
			
			sessionFactory.getCurrentSession().save(loginRegistartion); //Will return newly inserted record
			
			UserDetailModel userDetailMod = new UserDetailModel();
			userDetailMod.setUserID(loginRegistartion.getUserId());
			sessionFactory.getCurrentSession().save(userDetailMod);  
			
			return true;
			
		}
		
		catch (ConstraintViolationException e) {
			System.out.println("ERROR : User Already Exist");
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();
			sessionFactory.getCurrentSession().flush();
		}
		
		return false;
	}
	
}
