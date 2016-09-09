package com.pit.dao.registration;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pit.model.BusinessDetailModel;
import com.pit.model.CompanyDetailModel;
import com.pit.model.FinancialDetailModel;
import com.pit.model.LoginRegistartionModel;
import com.pit.model.RiskMngDetailModel;
import com.pit.model.TradeDetailModel;
import com.pit.model.UserDetailModel;


@Component
public class RegistreationRepositoryImpl  implements RegistreationRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean setUserDetails(UserDetailModel userDetailModel) {
		
		UserDetailModel userDetailModelForID = null;
		try {
			
			/*Query query = sessionFactory.getCurrentSession().getNamedQuery("QUERY_USER_DETAIL_ID");
			query.setParameter("userID", userDetailModel.getUserID()); 
			
				List<UserDetailModel>  listUserDeatils = query.list();
				if(!listUserDeatils.isEmpty() && null != listUserDeatils){
					userDetailModelForID = (UserDetailModel)listUserDeatils.get(0);
				}
			
				userDetailModel.setUserDetId(userDetailModelForID.getUserDetId());*/
				
			sessionFactory.getCurrentSession().update(userDetailModel);
			System.out.println("SUCCESS : DB :: ~~~~~~~~~~~~~~~~~");
			
			//int res = query.executeUpdate(); // Will Return How many record got effected.
			//logger.info("Command successfully executed :: Record Effected : " + res);
		} catch (Exception e) {
			
			System.out.println("ERROR : DB :: ~~~~~~~~~~~~~~~~~");
			e.printStackTrace();
		}
		
		return false;
	}

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
