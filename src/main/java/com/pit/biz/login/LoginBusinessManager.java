package com.pit.biz.login;

import com.pit.bo.LoginRegistartion;

public interface LoginBusinessManager {

	public LoginRegistartion getLoginDetailsBusMng(LoginRegistartion loginRegistartion);
	
	public boolean setRegistration(LoginRegistartion loginRegistartion);
}
