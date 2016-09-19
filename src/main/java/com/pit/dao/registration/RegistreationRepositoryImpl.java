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
			return true;
			
			//int res = query.executeUpdate(); // Will Return How many record got effected.
			//logger.info("Command successfully executed :: Record Effected : " + res);
		} catch (Exception e) {
			System.out.println("ERROR : DB :: ~~~~~~~~~~~~~~~~~");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserDetailModel getUserDetails(String userId) {
		
		try {
			Query query = sessionFactory.getCurrentSession().getNamedQuery("QUERY_USER_DETAIL_ID");
			query.setParameter("userID", userId);
			List<UserDetailModel>  userDetailModList = query.list();
			
			return (UserDetailModel)userDetailModList.get(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
