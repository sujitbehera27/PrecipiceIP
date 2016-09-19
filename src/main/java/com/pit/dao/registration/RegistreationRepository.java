package com.pit.dao.registration;

import com.pit.model.UserDetailModel;

public interface RegistreationRepository {

	public boolean setUserDetails(UserDetailModel userDetailModel);
	
	public UserDetailModel getUserDetails(String userId);
	
}
