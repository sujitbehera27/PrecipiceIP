package com.pit.dao.login;

import com.pit.model.LoginRegistartionModel;

public interface LoginRepository {

	public LoginRegistartionModel getLoginRepo(LoginRegistartionModel loginRegistartion);
	
	public int setRegistrationRepo(LoginRegistartionModel loginRegistartion);
}
