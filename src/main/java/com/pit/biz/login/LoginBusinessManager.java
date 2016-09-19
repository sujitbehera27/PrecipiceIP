package com.pit.biz.login;

import com.pit.bo.LoginRegistartion;
import com.pit.bo.UserDetail;

public interface LoginBusinessManager {

	public String getLoginDetailsBusMng(LoginRegistartion loginRegistartion);
	
	public boolean setRegistration(LoginRegistartion loginRegistartion);
}
