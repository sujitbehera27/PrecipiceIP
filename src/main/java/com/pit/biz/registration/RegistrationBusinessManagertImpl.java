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
			if (userDetail.getFormID() == COMPANY_DETAIL) 
				setCompanyDetail(userDetail);      // Company Detail
			if (userDetail.getFormID() == FINANCE_DETAIL)
				setFinancialDetail(userDetail);    // Finance Detail
			if (userDetail.getFormID() == BUSINESS_DETAIL)
				setBusinessDetail(userDetail);     // Business Detail
			if (userDetail.getFormID() == TRADE_DETAIL)
				setTradeDetail(userDetail);        // Trade Detail
			if (userDetail.getFormID() == RISK_MNG_DETAIL)
				setRiskManagement(userDetail);     // Risk Management Details 
			
			//userDetailModel.setUserID("RegistrationBusinessManagertImpl::userid=="+userDetail.getUserID()+"-reguserid-"+userDetail.getRegUserID());
			registreationRepository.setUserDetails(userDetailModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}

	public void setCompanyDetail(UserDetail companyDetail) {

		userDetailModel = new UserDetailModel();
		
		if (companyDetail.getUserName() != null && !companyDetail.getUserName().isEmpty()) 
			userDetailModel.setUserName(companyDetail.getUserName());
		if (companyDetail.getCompanyName() != null && !companyDetail.getCompanyName().isEmpty()) 
			userDetailModel.setCompanyName(companyDetail.getCompanyName());
		if (companyDetail.getEmailID() != null && !companyDetail.getEmailID().isEmpty()) 
			userDetailModel.setEmailID(companyDetail.getEmailID());
		if (companyDetail.getAddress1() != null && !companyDetail.getAddress1().isEmpty()) 
			userDetailModel.setAddress1(companyDetail.getAddress1());
		if (companyDetail.getAddress2() != null && !companyDetail.getAddress2().isEmpty()) 
			userDetailModel.setAddress2(companyDetail.getAddress2());
		if (companyDetail.getCity() != null && !companyDetail.getCity().isEmpty()) 
			userDetailModel.setCity(companyDetail.getCity());
		if (companyDetail.getZip() != null && !companyDetail.getZip().isEmpty()) 
			userDetailModel.setZip(companyDetail.getZip());
		if (companyDetail.getCountry() != null && !companyDetail.getCountry().isEmpty()) 
			userDetailModel.setCountry(companyDetail.getCountry());
		if (companyDetail.getPhoneNo() != null && !companyDetail.getPhoneNo().isEmpty()) 
			userDetailModel.setPhoneNo(companyDetail.getPhoneNo());

	}

	public void setFinancialDetail(UserDetail financialDetail) {

		userDetailModel = new UserDetailModel();
		
		if (financialDetail.getAnnualRev() != null && !financialDetail.getAnnualRev().isEmpty()) 
			userDetailModel.setAnnualRev(financialDetail.getAnnualRev());

		if (financialDetail.getNoOfEmp() != null && !financialDetail.getNoOfEmp().isEmpty()) 
			userDetailModel.setNoOfEmp(financialDetail.getNoOfEmp());

		if (financialDetail.getInvestInRnD() != null && !financialDetail.getInvestInRnD().isEmpty()) 
			userDetailModel.setInvestInRnD(convertListToString(financialDetail.getInvestInRnD()));

		if (financialDetail.getBusInCountries() != null && !financialDetail.getBusInCountries().isEmpty()) 
			userDetailModel.setBusInCountries(convertListToString(financialDetail.getBusInCountries()));

		if (financialDetail.getSellProd() != null && !financialDetail.getSellProd().isEmpty()) 
			userDetailModel.setSellProd(convertListToString(financialDetail.getSellProd()));
		
		// These all are int value
		userDetailModel.setThirdPartyProd(financialDetail.getThirdPartyProd());
		userDetailModel.setCompBusType(financialDetail.getCompBusType());
		userDetailModel.setSellService(financialDetail.getSellService());
		userDetailModel.setSellProdAndSvc(financialDetail.getSellProdAndSvc());
		userDetailModel.setLicProp(financialDetail.getLicProp());

	}

	public void setBusinessDetail(UserDetail businessDetail) {
		
		userDetailModel = new UserDetailModel();
		
		if (businessDetail.getCompOverall() != null && !businessDetail.getCompOverall().isEmpty()) 
			userDetailModel.setCompOverall(businessDetail.getCompOverall());
		if (businessDetail.getCompByBu() != null && !businessDetail.getCompByBu().isEmpty()) 
			userDetailModel.setCompByBu(businessDetail.getCompByBu());
		if (businessDetail.getCompMarketAct() != null && !businessDetail.getCompMarketAct().isEmpty()) 
			userDetailModel.setCompMarketAct(convertListToString(businessDetail.getCompMarketAct()));
		
		userDetailModel.setCompIpPolicy(businessDetail.getCompIpPolicy());
		userDetailModel.setCompIpStrategy(businessDetail.getCompIpStrategy());
		userDetailModel.setBusinesStrategy(businessDetail.getBusinesStrategy());
		
	}

	public void setTradeDetail(UserDetail tradeDetail) {
		
		userDetailModel = new UserDetailModel();
		
		userDetailModel.setPreserveCopyRight(tradeDetail.getPreserveCopyRight());
		userDetailModel.setRegTradeMark(tradeDetail.getRegTradeMark());
		userDetailModel.setDomainRefBN(tradeDetail.getDomainRefBN());
		userDetailModel.setDomainRefPN(tradeDetail.getDomainRefPN());
		userDetailModel.setTradeSec(tradeDetail.getTradeSec());
		userDetailModel.setCategoriTradeSec(tradeDetail.getCategoriTradeSec());
		userDetailModel.setMngCyberSecRisk(tradeDetail.getMngCyberSecRisk());
		userDetailModel.setProtectTradeSec(tradeDetail.getProtectTradeSec());
		userDetailModel.setProtectConfInfo(tradeDetail.getProtectConfInfo());
		
	}

	public void setRiskManagement(UserDetail riskMngDetail) {

		userDetailModel = new UserDetailModel();
		
		if (riskMngDetail.getHasIpPolicyList() != null && !riskMngDetail.getHasIpPolicyList().isEmpty()) 
			userDetailModel.setHasIpPolicyList(convertListToString(riskMngDetail.getHasIpPolicyList()));
		
		if (riskMngDetail.getAgreementMngProtList() != null && !riskMngDetail.getAgreementMngProtList().isEmpty()) 
			userDetailModel.setAgreementMngProtList(convertListToString(riskMngDetail.getAgreementMngProtList()));
			
		if (riskMngDetail.getHasErmList() != null && !riskMngDetail.getHasErmList().isEmpty())
			userDetailModel.setHasErmList(convertListToString(riskMngDetail.getHasErmList()));
		
		if (riskMngDetail.getThirdPartyLia() != null && !riskMngDetail.getThirdPartyLia().isEmpty())
			userDetailModel.setThirdPartyLia(convertListToString(riskMngDetail.getThirdPartyLia()));
		
		if (riskMngDetail.getThirdPartyIns() != null && !riskMngDetail.getThirdPartyIns().isEmpty())
			userDetailModel.setThirdPartyIns(convertListToString(riskMngDetail.getThirdPartyIns()));
		
		if (riskMngDetail.getHasOverIpGov() != null && !riskMngDetail.getHasOverIpGov().isEmpty())
			userDetailModel.setHasOverIpGov(convertListToString(riskMngDetail.getHasOverIpGov()));
		
		userDetailModel.setHasConfInfo(riskMngDetail.getHasConfInfo());
		userDetailModel.setHasIpPolicy(riskMngDetail.getHasIpPolicy());
		userDetailModel.setAgreementMngProt(riskMngDetail.getAgreementMngProt());
		userDetailModel.setHasErm(riskMngDetail.getHasErm());
		userDetailModel.setSelfInsIpLose(riskMngDetail.getSelfInsIpLose());
		userDetailModel.setPurchedThirdPartyIns(riskMngDetail.getPurchedThirdPartyIns());
		
	}
	
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
