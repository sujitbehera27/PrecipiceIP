package com.pit.biz.registration;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pit.bo.BusinessDetail;
import com.pit.bo.CompanyDetail;
import com.pit.bo.FinancialDetail;
import com.pit.bo.RiskMngDetail;
import com.pit.bo.TradeDetail;
import com.pit.dao.registration.RegistreationRepository;
import com.pit.model.BusinessDetailModel;
import com.pit.model.CompanyDetailModel;
import com.pit.model.FinancialDetailModel;
import com.pit.model.RiskMngDetailModel;
import com.pit.model.TradeDetailModel;

@Component
public class RegistrationBusinessManagertImpl implements RegistrationBusinessManager {

	@Autowired
	RegistreationRepository registreationRepository;

	@Override
	@Transactional
	public boolean setCompanyDetailBusMng(CompanyDetail companyDetail) {

		CompanyDetailModel companyDetailModel = new CompanyDetailModel();
		companyDetailModel.setUserName(companyDetail.getUserName());
		companyDetailModel.setCompanyName(companyDetail.getCompanyName());
		companyDetailModel.setEmailID(companyDetail.getEmailID());
		companyDetailModel.setAddress1(companyDetail.getAddress1());
		companyDetailModel.setAddress2(companyDetail.getAddress2());
		companyDetailModel.setCity(companyDetail.getCity());
		companyDetailModel.setZip(companyDetail.getZip());
		companyDetailModel.setCountry(companyDetail.getCountry());
		companyDetailModel.setPhoneNo(companyDetail.getPhoneNo());

		registreationRepository.setCompanyDetailBusMng(companyDetailModel);

		return false;
	}

	@Override
	@Transactional
	public boolean setFinancialDetailsBusMng(FinancialDetail financialDetail) {

		FinancialDetailModel financialDetailModel = new FinancialDetailModel();

		// These all r String Value 
		if (financialDetail.getAnnualRev() != null && financialDetail.getAnnualRev().isEmpty()) 
			financialDetailModel.setAnnualRev(financialDetail.getAnnualRev());

		if (financialDetail.getNoOfEmp() != null && financialDetail.getNoOfEmp().isEmpty()) 
			financialDetailModel.setNoOfEmp(financialDetail.getNoOfEmp());

		if (financialDetail.getInvestInRnD() != null && financialDetail.getInvestInRnD().isEmpty()) 
			financialDetailModel.setInvestInRnD(financialDetail.getInvestInRnD());

		if (financialDetail.getBusInCountries() != null && financialDetail.getBusInCountries().isEmpty()) 
			financialDetailModel.setBusInCountries(financialDetail.getBusInCountries());

		if (financialDetail.getSellProd() != null && financialDetail.getSellProd().isEmpty()) 
			financialDetailModel.setSellProd(financialDetail.getSellProd());
		

		// These all are int value
		financialDetailModel.setThirdPartyProd(financialDetail.getThirdPartyProd());
		financialDetailModel.setCompBusType(financialDetail.getCompBusType());
		financialDetailModel.setSellService(financialDetail.getSellService());
		financialDetailModel.setSellProdAndSvc(financialDetail.getSellProdAndSvc());
		financialDetailModel.setLicProp(financialDetail.getLicProp());

		registreationRepository.setFinancialDetailsRepo(financialDetailModel);

		return false;
	}

	@Override
	@Transactional
	public boolean setBusinessDetailBusMng(BusinessDetail businessDetail) {
		
		BusinessDetailModel businessDetailModel = new BusinessDetailModel();
		
		if (businessDetail.getCompOverall() != null && businessDetail.getCompOverall().isEmpty()) 
			businessDetailModel.setCompOverall(businessDetail.getCompOverall());
		if (businessDetail.getCompByBu() != null && businessDetail.getCompByBu().isEmpty()) 
			businessDetailModel.setCompByBu(businessDetail.getCompByBu());
		if (businessDetail.getCompMarketAct() != null && businessDetail.getCompMarketAct().isEmpty()) 
			businessDetailModel.setCompMarketAct(businessDetail.getCompMarketAct());
		
		businessDetailModel.setCompIpPolicy(businessDetail.getCompIpPolicy());
		businessDetailModel.setCompIpStrategy(businessDetail.getCompIpStrategy());
		businessDetailModel.setBusinesStrategy(businessDetail.getBusinesStrategy());
		
		
		registreationRepository.setBusinessDetailRepo(businessDetailModel);

		return false;
	}

	@Override
	@Transactional
	public boolean setTradeDetailBusMng(TradeDetail tradeDetail) {
		TradeDetailModel tradeDetailModel = new TradeDetailModel();
		
		tradeDetailModel.setPreserveCopyRight(tradeDetail.getPreserveCopyRight());
		tradeDetailModel.setRegTradeMark(tradeDetail.getRegTradeMark());
		tradeDetailModel.setDomainRefBN(tradeDetail.getDomainRefBN());
		tradeDetailModel.setDomainRefPN(tradeDetail.getDomainRefPN());
		tradeDetailModel.setTradeSec(tradeDetail.getTradeSec());
		tradeDetailModel.setCategoriTradeSec(tradeDetail.getCategoriTradeSec());
		tradeDetailModel.setMngCyberSecRisk(tradeDetail.getMngCyberSecRisk());
		tradeDetailModel.setProtectTradeSec(tradeDetail.getProtectTradeSec());
		tradeDetailModel.setProtectConfInfo(tradeDetail.getProtectConfInfo());
		
		registreationRepository.setTradeDetailRepo(tradeDetailModel);

		return false;
	}

	@Override
	@Transactional
	public boolean setRiskManagementBusMng(RiskMngDetail riskMngDetail) {

		RiskMngDetailModel riskMngDetailModel = new RiskMngDetailModel();
		
		if (riskMngDetail.getHasIpPolicyList() != null && riskMngDetail.getHasIpPolicyList().isEmpty()) 
			riskMngDetailModel.setHasIpPolicyList(riskMngDetail.getHasIpPolicyList());
		if (riskMngDetail.getAgreementMngProtList() != null && riskMngDetail.getAgreementMngProtList().isEmpty())
			riskMngDetailModel.setAgreementMngProtList(riskMngDetail.getAgreementMngProtList());
		if (riskMngDetail.getHasErmList() != null && riskMngDetail.getHasErmList().isEmpty())
			riskMngDetailModel.setHasErmList(riskMngDetail.getHasErmList());
		if (riskMngDetail.getThirdPartyLia() != null && riskMngDetail.getThirdPartyLia().isEmpty())
			riskMngDetailModel.setThirdPartyLia(riskMngDetail.getThirdPartyLia());
		if (riskMngDetail.getThirdPartyIns() != null && riskMngDetail.getThirdPartyIns().isEmpty())
			riskMngDetailModel.setThirdPartyIns(riskMngDetail.getThirdPartyIns());
		if (riskMngDetail.getHasOverIpGov() != null && riskMngDetail.getHasOverIpGov().isEmpty())
			riskMngDetailModel.setHasOverIpGov(riskMngDetail.getHasOverIpGov());
		
		riskMngDetailModel.setHasConfInfo(riskMngDetail.getHasConfInfo());
		riskMngDetailModel.setHasIpPolicy(riskMngDetail.getHasIpPolicy());
		riskMngDetailModel.setAgreementMngProt(riskMngDetail.getAgreementMngProt());
		riskMngDetailModel.setHasErm(riskMngDetail.getHasErm());
		riskMngDetailModel.setSelfInsIpLose(riskMngDetail.getSelfInsIpLose());
		riskMngDetailModel.setPurchedThirdPartyIns(riskMngDetail.getPurchedThirdPartyIns());
		
		registreationRepository.setRiskManagementRepo(riskMngDetailModel);

		return false;
	}

}
