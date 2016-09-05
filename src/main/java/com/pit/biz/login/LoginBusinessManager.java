package com.pit.biz.login;

import com.pit.bo.LoginRegistartion;

public interface LoginBusinessManager {

	public LoginRegistartion getLoginDetailsBusMng(LoginRegistartion loginRegistartion);
	
	public LoginRegistartion setRegistration(LoginRegistartion loginRegistartion);
}
