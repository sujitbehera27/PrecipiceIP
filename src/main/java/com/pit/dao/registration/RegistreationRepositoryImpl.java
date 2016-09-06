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
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(companyDetailModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(tradeDetailModel);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean setRiskManagementRepo(RiskMngDetailModel riskMngDetailModel) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(riskMngDetailModel);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
