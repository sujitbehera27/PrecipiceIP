package com.pit.dao.registration;

import com.pit.model.BusinessDetailModel;
import com.pit.model.CompanyDetailModel;
import com.pit.model.FinancialDetailModel;
import com.pit.model.RiskMngDetailModel;
import com.pit.model.TradeDetailModel;
import com.pit.model.UserDetailModel;

public interface RegistreationRepository {

	public boolean setUserDetails(UserDetailModel userDetailModel);
	
	public boolean setCompanyDetailBusMng(CompanyDetailModel companyDetail);
	
	public boolean setFinancialDetailsRepo(FinancialDetailModel financialDetails);
	
	public boolean setBusinessDetailRepo(BusinessDetailModel businessDetail);
	
	public boolean setTradeDetailRepo(TradeDetailModel tradeDetail);
	
	public boolean setRiskManagementRepo(RiskMngDetailModel riskMngDetail);
	
}
