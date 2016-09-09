package com.pit.dao.login;

import com.pit.model.LoginRegistartionModel;

public interface LoginRepository {

	public LoginRegistartionModel getLoginRepo(LoginRegistartionModel loginRegistartion);
	
	public boolean setRegistrationRepo(LoginRegistartionModel loginRegistartion);
}
