package com.pit.biz.login;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pit.bo.LoginRegistartion;
import com.pit.dao.login.LoginRepository;
import com.pit.model.LoginRegistartionModel;

@Component
public class LoginBusinessManagerImpl implements LoginBusinessManager{

	@Autowired
	public LoginRepository loginRepository;
	
	public static Logger logger = LoggerFactory.getLogger(LoginBusinessManagerImpl.class);

	@Override
	@Transactional
	public LoginRegistartion getLoginDetailsBusMng(LoginRegistartion loginRegistartion) {
		
		LoginRegistartionModel loginRegistartionModel = new LoginRegistartionModel();
		
			
			loginRegistartionModel.setUserId(loginRegistartion.getUserId());
			loginRegistartionModel.setPassword(loginRegistartion.getPassword());
			
			loginRegistartionModel = loginRepository.getLoginRepo(loginRegistartionModel);
			
			if (loginRegistartionModel != null) {
				if (loginRegistartionModel.getFirstName() != null && !loginRegistartionModel.getFirstName().isEmpty()) {
					loginRegistartion.setFirstName(loginRegistartionModel.getFirstName());
				}
			
			return loginRegistartion;
		} 			
		
		return null;
	}	

	@Override
	@Transactional
	public boolean setRegistration(LoginRegistartion loginRegistartion) {

		LoginRegistartionModel loginRegistartionModel = new LoginRegistartionModel();
		loginRegistartionModel.setUserId(loginRegistartion.getUserId());
		loginRegistartionModel.setLastName(loginRegistartion.getLastName());
		loginRegistartionModel.setFirstName(loginRegistartion.getFirstName());
		loginRegistartionModel.setEmailID(loginRegistartion.getEmailID());
		loginRegistartionModel.setPassword(loginRegistartion.getPassword());
		
		return loginRepository.setRegistrationRepo(loginRegistartionModel);
		
	}
}
