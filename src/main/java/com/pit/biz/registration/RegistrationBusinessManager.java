package com.pit.biz.registration;

import com.pit.bo.UserDetail;

public interface RegistrationBusinessManager {

	public UserDetail setUserDetails(UserDetail userDetail) ;
	
	public UserDetail getUserDetails(String userId) ;
	
}
