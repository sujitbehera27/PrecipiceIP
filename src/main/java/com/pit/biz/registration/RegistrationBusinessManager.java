package com.pit.biz.registration;

import com.pit.bo.BusinessDetail;
import com.pit.bo.CompanyDetail;
import com.pit.bo.FinancialDetail;
import com.pit.bo.RiskMngDetail;
import com.pit.bo.TradeDetail;
import com.pit.bo.UserDetail;
import com.pit.model.UserDetailModel;

public interface RegistrationBusinessManager {

	public boolean setUserDetails(UserDetail userDetail) ;
	
//	public UserDetail getUserDetails(String userId) ;
	
	/*public boolean setCompanyDetailBusMng(CompanyDetail companyDetail);
	
	public boolean setFinancialDetailsBusMng(FinancialDetail financialDetail);
	
	public boolean setBusinessDetailBusMng(BusinessDetail businessDetail);
	
	public boolean setTradeDetailBusMng(TradeDetail tradeDetail);
	
	public boolean setRiskManagementBusMng(RiskMngDetail riskMngDetail);*/
	
}
