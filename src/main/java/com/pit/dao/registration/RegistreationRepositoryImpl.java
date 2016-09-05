package com.pit.dao.registration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pit.model.BusinessDetailModel;
import com.pit.model.CompanyDetailModel;
import com.pit.model.FinancialDetailModel;
import com.pit.model.RiskMngDetailModel;
import com.pit.model.TradeDetailModel;


@Component
public class RegistreationRepositoryImpl  implements RegistreationRepository{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean setCompanyDetailBusMng(CompanyDetailModel companyDetailModel) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(companyDetailModel);
		
		return false;
	}

	@Override
	public boolean setFinancialDetailsRepo(FinancialDetailModel financialDetailModel) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(financialDetailModel);
		
		return false;
	}

	@Override
	public boolean setBusinessDetailRepo(BusinessDetailModel businessDetailModel) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(businessDetailModel);
		
		return false;
	}

	@Override
	public boolean setTradeDetailRepo(TradeDetailModel tradeDetailModel) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(tradeDetailModel);
		
		return false;
	}

	@Override
	public boolean setRiskManagementRepo(RiskMngDetailModel riskMngDetailModel) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(riskMngDetailModel);
		
		return false;
	}

}
