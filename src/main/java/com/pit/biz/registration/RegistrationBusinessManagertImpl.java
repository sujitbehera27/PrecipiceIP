package com.pit.biz.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pit.bo.BusinessDetail;
import com.pit.bo.CompanyDetail;
import com.pit.bo.FinancialDetail;
import com.pit.bo.RiskMngDetail;
import com.pit.bo.TradeDetail;
import com.pit.bo.UserDetail;
import com.pit.dao.registration.RegistreationRepository;
import com.pit.model.BusinessDetailModel;
import com.pit.model.CompanyDetailModel;
import com.pit.model.FinancialDetailModel;
import com.pit.model.RiskMngDetailModel;
import com.pit.model.TradeDetailModel;
import com.pit.model.UserDetailModel;

@Component
public class RegistrationBusinessManagertImpl implements RegistrationBusinessManager {

	@Autowired
	RegistreationRepository registreationRepository;
	
	private static final int COMPANY_DETAIL = 1;
	private static final int FINANCE_DETAIL = 2;
	private static final int BUSINESS_DETAIL= 3;
	private static final int TRADE_DETAIL   = 4;
	private static final int RISK_MNG_DETAIL= 5;
	
	UserDetailModel userDetailModel ;//= new UserDetailModel();
	
	
	@Override
	@Transactional
	public boolean setUserDetails(UserDetail userDetail) {
		
		try {
			userDetailModel = new UserDetailModel();
			System.out.println("-------userDetail.getFormID()------->>>>"+userDetail.getFormID());
			//if (userDetail.getFormID() == COMPANY_DETAIL) 
				setuserDetail(userDetail);      // Company Detail
//			if (userDetail.getFormID() == FINANCE_DETAIL)
//				setuserDetail(userDetail);    // Finance Detail
//			if (userDetail.getFormID() == BUSINESS_DETAIL)
//				setuserDetail(userDetail);     // Business Detail
//			if (userDetail.getFormID() == TRADE_DETAIL)
//				setuserDetail(userDetail);        // Trade Detail
//			if (userDetail.getFormID() == RISK_MNG_DETAIL)
//				setRiskManagement(userDetail);     // Risk Management Details 
			
			//userDetailModel.setUserID("RegistrationBusinessManagertImpl::userid=="+userDetail.getUserID()+"-reguserid-"+userDetail.getRegUserID());
			registreationRepository.setUserDetails(userDetailModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	

	public void setuserDetail(UserDetail userDetail) {

		userDetailModel = new UserDetailModel();
		
		if (userDetail.getUserName() != null && !userDetail.getUserName().isEmpty()) 
			userDetailModel.setUserName(userDetail.getUserName());
		if (userDetail.getCompanyName() != null && !userDetail.getCompanyName().isEmpty()) 
			userDetailModel.setCompanyName(userDetail.getCompanyName());
		if (userDetail.getEmailID() != null && !userDetail.getEmailID().isEmpty()) 
			userDetailModel.setEmailID(userDetail.getEmailID());
		if (userDetail.getAddress1() != null && !userDetail.getAddress1().isEmpty()) 
			userDetailModel.setAddress1(userDetail.getAddress1());
		if (userDetail.getAddress2() != null && !userDetail.getAddress2().isEmpty()) 
			userDetailModel.setAddress2(userDetail.getAddress2());
		if (userDetail.getCity() != null && !userDetail.getCity().isEmpty()) 
			userDetailModel.setCity(userDetail.getCity());
		if (userDetail.getZip() != null && !userDetail.getZip().isEmpty()) 
			userDetailModel.setZip(userDetail.getZip());
		if (userDetail.getCountry() != null && !userDetail.getCountry().isEmpty()) 
			userDetailModel.setCountry(userDetail.getCountry());
		if (userDetail.getPhoneNo() != null && !userDetail.getPhoneNo().isEmpty()) 
			userDetailModel.setPhoneNo(userDetail.getPhoneNo());
		if (userDetail.getUserID() != null && !userDetail.getUserID().isEmpty()) 
			userDetailModel.setUserID(userDetail.getUserID());
		
		if (userDetail.getAnnualRev() != null && !userDetail.getAnnualRev().isEmpty()) 
			userDetailModel.setAnnualRev(userDetail.getAnnualRev());

		if (userDetail.getNoOfEmp() != null && !userDetail.getNoOfEmp().isEmpty()) 
			userDetailModel.setNoOfEmp(userDetail.getNoOfEmp());

		if (userDetail.getInvestInRnD() != null && !userDetail.getInvestInRnD().isEmpty()) 
			userDetailModel.setInvestInRnD(convertListToString(userDetail.getInvestInRnD()));

		if (userDetail.getBusInCountries() != null && !userDetail.getBusInCountries().isEmpty()) 
			userDetailModel.setBusInCountries(convertListToString(userDetail.getBusInCountries()));

		if (userDetail.getSellProd() != null && !userDetail.getSellProd().isEmpty()) 
			userDetailModel.setSellProd(convertListToString(userDetail.getSellProd()));
		
		// These all are int value
		userDetailModel.setThirdPartyProd(userDetail.getThirdPartyProd());
		userDetailModel.setCompBusType(userDetail.getCompBusType());
		userDetailModel.setSellService(userDetail.getSellService());
		userDetailModel.setSellProdAndSvc(userDetail.getSellProdAndSvc());
		userDetailModel.setLicProp(userDetail.getLicProp());
		if (userDetail.getUserID() != null && !userDetail.getUserID().isEmpty()) 
			userDetailModel.setUserID(userDetail.getUserID());
		if (userDetail.getCompOverall() != null && !userDetail.getCompOverall().isEmpty()) 
			userDetailModel.setCompOverall(userDetail.getCompOverall());
		if (userDetail.getCompByBu() != null && !userDetail.getCompByBu().isEmpty()) 
			userDetailModel.setCompByBu(userDetail.getCompByBu());
		if (userDetail.getCompMarketAct() != null && !userDetail.getCompMarketAct().isEmpty()) 
			userDetailModel.setCompMarketAct(convertListToString(userDetail.getCompMarketAct()));
		
		userDetailModel.setCompIpPolicy(userDetail.getCompIpPolicy());
		userDetailModel.setCompIpStrategy(userDetail.getCompIpStrategy());
		userDetailModel.setBusinesStrategy(userDetail.getBusinesStrategy());
		userDetailModel.setUserID(userDetail.getUserID());
		userDetailModel.setPreserveCopyRight(userDetail.getPreserveCopyRight());
		userDetailModel.setRegTradeMark(userDetail.getRegTradeMark());
		userDetailModel.setDomainRefBN(userDetail.getDomainRefBN());
		userDetailModel.setDomainRefPN(userDetail.getDomainRefPN());
		userDetailModel.setTradeSec(userDetail.getTradeSec());
		userDetailModel.setCategoriTradeSec(userDetail.getCategoriTradeSec());
		userDetailModel.setMngCyberSecRisk(userDetail.getMngCyberSecRisk());
		userDetailModel.setProtectTradeSec(userDetail.getProtectTradeSec());
		userDetailModel.setProtectConfInfo(userDetail.getProtectConfInfo());
		if (userDetail.getUserID() != null && !userDetail.getUserID().isEmpty()) 
			userDetailModel.setUserID(userDetail.getUserID());
		
		if (userDetail.getHasIpPolicyList() != null && !userDetail.getHasIpPolicyList().isEmpty()) 
			userDetailModel.setHasIpPolicyList(convertListToString(userDetail.getHasIpPolicyList()));
		
		if (userDetail.getAgreementMngProtList() != null && !userDetail.getAgreementMngProtList().isEmpty()) 
			userDetailModel.setAgreementMngProtList(convertListToString(userDetail.getAgreementMngProtList()));
			
		if (userDetail.getHasErmList() != null && !userDetail.getHasErmList().isEmpty())
			userDetailModel.setHasErmList(convertListToString(userDetail.getHasErmList()));
		
		if (userDetail.getThirdPartyLia() != null && !userDetail.getThirdPartyLia().isEmpty())
			userDetailModel.setThirdPartyLia(convertListToString(userDetail.getThirdPartyLia()));
		
		if (userDetail.getThirdPartyIns() != null && !userDetail.getThirdPartyIns().isEmpty())
			userDetailModel.setThirdPartyIns(convertListToString(userDetail.getThirdPartyIns()));
		
		if (userDetail.getHasOverIpGov() != null && !userDetail.getHasOverIpGov().isEmpty())
			userDetailModel.setHasOverIpGov(convertListToString(userDetail.getHasOverIpGov()));
		
		userDetailModel.setHasConfInfo(userDetail.getHasConfInfo());
		userDetailModel.setHasIpPolicy(userDetail.getHasIpPolicy());
		userDetailModel.setAgreementMngProt(userDetail.getAgreementMngProt());
		userDetailModel.setHasErm(userDetail.getHasErm());
		userDetailModel.setSelfInsIpLose(userDetail.getSelfInsIpLose());
		userDetailModel.setPurchedThirdPartyIns(userDetail.getPurchedThirdPartyIns());
	}

//	@Override
//	public UserDetail getUserDetails(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
		
	
	
	private String convertListToString(List<String> inputList){
		StringBuilder tempStrBuilder = new StringBuilder();
			for(String tempStr : inputList){
				if(tempStr != null && !tempStr.isEmpty()){
					tempStrBuilder.append(tempStr.trim());
					tempStrBuilder.append(",");
				}
			}
			tempStrBuilder.delete(tempStrBuilder.length()-1, tempStrBuilder.length());
		return tempStrBuilder.toString();
	}

	

}
