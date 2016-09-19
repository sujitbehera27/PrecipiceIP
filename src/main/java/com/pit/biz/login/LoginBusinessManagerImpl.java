package com.pit.biz.login;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pit.bo.LoginRegistartion;
import com.pit.bo.UserDetail;
import com.pit.dao.login.LoginRepository;
import com.pit.model.LoginRegistartionModel;
import com.pit.model.UserDetailModel;

@Component
public class LoginBusinessManagerImpl implements LoginBusinessManager{

	@Autowired
	public LoginRepository loginRepository;
	
	private UserDetail userDetail;
	
	public static Logger logger = LoggerFactory.getLogger(LoginBusinessManagerImpl.class);

	@Override
	@Transactional
	public String getLoginDetailsBusMng(LoginRegistartion loginRegistartion) {
		
		LoginRegistartionModel loginRegistartionModel = new LoginRegistartionModel();
		
			
			loginRegistartionModel.setUserId(loginRegistartion.getUserId());
			loginRegistartionModel.setPassword(loginRegistartion.getPassword());
			
			return loginRepository.getLoginRepo(loginRegistartionModel);
	} 			
		
	@Override
	@Transactional
	public boolean setRegistration(LoginRegistartion loginRegistartion) {

		LoginRegistartionModel loginRegistartionModel = new LoginRegistartionModel();
		loginRegistartionModel.setUserId(loginRegistartion.getUserId());
		loginRegistartionModel.setLastName(loginRegistartion.getLastName());
		loginRegistartionModel.setFirstName(loginRegistartion.getFirstName());
		loginRegistartionModel.setEmailID(loginRegistartion.getEmailID());
		loginRegistartionModel.setPassword(loginRegistartion.getPassword());
		
		return loginRepository.setRegistrationRepo(loginRegistartionModel);
		
	}
	
	public void setuserDetail(UserDetailModel userDetailModel) {

		userDetail = new UserDetail();
		
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetail.setUserID(userDetailModel.getUserID());
		if (userDetailModel.getUserName() != null && !userDetailModel.getUserName().isEmpty()) 
			userDetail.setUserName(userDetailModel.getUserName());
		if (userDetailModel.getCompanyName() != null && !userDetailModel.getCompanyName().isEmpty()) 
			userDetail.setCompanyName(userDetailModel.getCompanyName());
		if (userDetailModel.getEmailID() != null && !userDetailModel.getEmailID().isEmpty()) 
			userDetail.setEmailID(userDetailModel.getEmailID());
		if (userDetailModel.getAddress1() != null && !userDetailModel.getAddress1().isEmpty()) 
			userDetail.setAddress1(userDetailModel.getAddress1());
		if (userDetailModel.getAddress2() != null && !userDetailModel.getAddress2().isEmpty()) 
			userDetail.setAddress2(userDetailModel.getAddress2());
		if (userDetailModel.getCity() != null && !userDetailModel.getCity().isEmpty()) 
			userDetail.setCity(userDetailModel.getCity());
		if (userDetailModel.getZip() != null && !userDetailModel.getZip().isEmpty()) 
			userDetail.setZip(userDetailModel.getZip());
		if (userDetailModel.getCountry() != null && !userDetailModel.getCountry().isEmpty()) 
			userDetail.setCountry(userDetailModel.getCountry());
		if (userDetailModel.getPhoneNo() != null && !userDetailModel.getPhoneNo().isEmpty()) 
			userDetail.setPhoneNo(userDetailModel.getPhoneNo());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetail.setUserID(userDetailModel.getUserID());
		
		if (userDetailModel.getAnnualRev() != null && !userDetailModel.getAnnualRev().isEmpty()) 
			userDetail.setAnnualRev(userDetailModel.getAnnualRev());

		if (userDetailModel.getNoOfEmp() != null && !userDetailModel.getNoOfEmp().isEmpty()) 
			userDetail.setNoOfEmp(userDetailModel.getNoOfEmp());

		if (userDetailModel.getInvestInRnD() != null && !userDetailModel.getInvestInRnD().isEmpty()) 
			userDetail.setInvestInRnD(Arrays.asList(userDetailModel.getInvestInRnD().split(",")));

		if (userDetailModel.getBusInCountries() != null && !userDetailModel.getBusInCountries().isEmpty()) 
			userDetail.setBusInCountries(Arrays.asList(userDetailModel.getBusInCountries().split(",")));

		if (userDetailModel.getSellProd() != null && !userDetailModel.getSellProd().isEmpty()) 
			userDetail.setSellProd(Arrays.asList(userDetailModel.getSellProd().split(",")));
		
		// These all are int value
		userDetail.setThirdPartyProd(userDetailModel.getThirdPartyProd());
		userDetail.setCompBusType(userDetailModel.getCompBusType());
		userDetail.setSellService(userDetailModel.getSellService());
		userDetail.setSellProdAndSvc(userDetailModel.getSellProdAndSvc());
		userDetail.setLicProp(userDetailModel.getLicProp());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetail.setUserID(userDetailModel.getUserID());
		if (userDetailModel.getCompOverall() != null && !userDetailModel.getCompOverall().isEmpty()) 
			userDetail.setCompOverall(userDetailModel.getCompOverall());
		if (userDetailModel.getCompByBu() != null && !userDetailModel.getCompByBu().isEmpty()) 
			userDetail.setCompByBu(userDetailModel.getCompByBu());
		if (userDetailModel.getCompMarketAct() != null && !userDetailModel.getCompMarketAct().isEmpty()) 
			userDetail.setCompMarketAct(Arrays.asList(userDetailModel.getCompMarketAct().split(",")));
		
		userDetail.setCompIpPolicy(userDetailModel.getCompIpPolicy());
		userDetail.setCompIpStrategy(userDetailModel.getCompIpStrategy());
		userDetail.setBusinesStrategy(userDetailModel.getBusinesStrategy());
		userDetail.setUserID(userDetailModel.getUserID());
		userDetail.setPreserveCopyRight(userDetailModel.getPreserveCopyRight());
		userDetail.setRegTradeMark(userDetailModel.getRegTradeMark());
		userDetail.setDomainRefBN(userDetailModel.getDomainRefBN());
		userDetail.setDomainRefPN(userDetailModel.getDomainRefPN());
		userDetail.setTradeSec(userDetailModel.getTradeSec());
		userDetail.setCategoriTradeSec(userDetailModel.getCategoriTradeSec());
		userDetail.setMngCyberSecRisk(userDetailModel.getMngCyberSecRisk());
		userDetail.setProtectTradeSec(userDetailModel.getProtectTradeSec());
		userDetail.setProtectConfInfo(userDetailModel.getProtectConfInfo());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetail.setUserID(userDetailModel.getUserID());
		
		if (userDetailModel.getHasIpPolicyList() != null && !userDetailModel.getHasIpPolicyList().isEmpty()) 
			userDetail.setHasIpPolicyList(Arrays.asList(userDetailModel.getHasIpPolicyList().split(",")));
		
		if (userDetailModel.getAgreementMngProtList() != null && !userDetailModel.getAgreementMngProtList().isEmpty()) 
			userDetail.setAgreementMngProtList(Arrays.asList(userDetailModel.getAgreementMngProtList().split(",")));
			
		if (userDetailModel.getHasErmList() != null && !userDetailModel.getHasErmList().isEmpty())
			userDetail.setHasErmList(Arrays.asList(userDetailModel.getHasErmList().split(",")));
		
		if (userDetailModel.getThirdPartyLia() != null && !userDetailModel.getThirdPartyLia().isEmpty())
			userDetail.setThirdPartyLia(Arrays.asList(userDetailModel.getThirdPartyLia().split(",")));
		
		if (userDetailModel.getThirdPartyIns() != null && !userDetailModel.getThirdPartyIns().isEmpty())
			userDetail.setThirdPartyIns(Arrays.asList(userDetailModel.getThirdPartyIns().split(",")));
		
		if (userDetailModel.getHasOverIpGov() != null && !userDetailModel.getHasOverIpGov().isEmpty())
			userDetail.setHasOverIpGov(Arrays.asList(userDetailModel.getHasOverIpGov().split(",")));
		
		userDetail.setHasConfInfo(userDetailModel.getHasConfInfo());
		userDetail.setHasIpPolicy(userDetailModel.getHasIpPolicy());
		userDetail.setAgreementMngProt(userDetailModel.getAgreementMngProt());
		userDetail.setHasErm(userDetailModel.getHasErm());
		userDetail.setSelfInsIpLose(userDetailModel.getSelfInsIpLose());
		userDetail.setPurchedThirdPartyIns(userDetailModel.getPurchedThirdPartyIns());
	}
	
}
