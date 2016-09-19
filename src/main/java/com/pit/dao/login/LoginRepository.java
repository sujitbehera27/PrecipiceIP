package com.pit.dao.login;

import com.pit.model.LoginRegistartionModel;
import com.pit.model.UserDetailModel;

public interface LoginRepository {

	public String getLoginRepo(LoginRegistartionModel loginRegistartion);
	
	public boolean setRegistrationRepo(LoginRegistartionModel loginRegistartion);
}
