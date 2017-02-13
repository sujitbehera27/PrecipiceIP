package com.pit.biz.registration;

import java.util.Arrays;
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
	UserDetail userDetailRet ;
	
	@Override
	@Transactional
	public UserDetail setUserDetails(UserDetail userDetail) {
		
		
		try {
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
				
				boolean updateSuccess = registreationRepository.setUserDetails(userDetailModel);
				
				if (updateSuccess == true) {
					userDetailRet = getUserDetails(userDetail.getUserID());
					return userDetailRet;
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	@Transactional
	public UserDetail getUserDetails(String userId) {
		
		userDetailModel = registreationRepository.getUserDetails(userId);
		if (userDetailModel != null) {
			userDetailRet = setuserDetail(userDetailModel);
			return userDetailRet;
		}
		return null;
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
		
		
		if (userDetail.getPrimaryIndus() != null && !userDetail.getPrimaryIndus().isEmpty()) 
			userDetailModel.setPrimaryIndus(userDetail.getPrimaryIndus());	
		
		userDetailModel.setGrossRevenue(userDetail.getGrossRevenue());	
		userDetailModel.setProjectedSale(userDetail.getProjectedSale());	
		
		if (userDetail.getRevToRandD() != null && !userDetail.getRevToRandD().isEmpty()) 
			userDetailModel.setRevToRandD(userDetail.getRevToRandD());	
		
		userDetailModel.setAmtSpend(userDetail.getAmtSpend());	
		userDetailModel.setSpendBizUnit(userDetail.getSpendBizUnit());	
		
		if (userDetail.getProtectTradeSce() != null && !userDetail.getProtectTradeSce().isEmpty()) 
			userDetailModel.setProtectTradeSce(userDetail.getProtectTradeSce());	
		
		userDetailModel.setDoesCompHasOverIpGov(userDetail.getDoesCompHasOverIpGov());	
		
		if (userDetail.getEmpAgreeUtil() != null && !userDetail.getEmpAgreeUtil().isEmpty()) 
			userDetailModel.setEmpAgreeUtil(convertListToString(userDetail.getEmpAgreeUtil()));	
		
		if (userDetail.getLastNDAAgree() != null && !userDetail.getLastNDAAgree().isEmpty()) 
			userDetailModel.setLastNDAAgree(userDetail.getLastNDAAgree());	
		
		if (userDetail.getIprDocketing() != null && !userDetail.getIprDocketing().isEmpty()) 
			userDetailModel.setIprDocketing(userDetail.getIprDocketing());	
		
		userDetailModel.setAmtFound(userDetail.getAmtFound());	
		
		if (userDetail.getCompBenchmark() != null && !userDetail.getCompBenchmark().isEmpty()) 
			userDetailModel.setCompBenchmark(userDetail.getCompBenchmark());	
		
		
		if (userDetail.getHowPreserveCopyRight() != null && !userDetail.getHowPreserveCopyRight().isEmpty()) 
			userDetailModel.setHowPreserveCopyRight(convertListToString(userDetail.getHowPreserveCopyRight()));
		if (userDetail.getWherRegTradeMark() != null && !userDetail.getWherRegTradeMark().isEmpty()) 
			userDetailModel.setWherRegTradeMark(convertListToString(userDetail.getWherRegTradeMark()));
		if (userDetail.getFrameMngCyberSecRisk() != null && !userDetail.getFrameMngCyberSecRisk().isEmpty()) 
			userDetailModel.setFrameMngCyberSecRisk(userDetail.getFrameMngCyberSecRisk());
		if (userDetail.getMeasureProtectTradeSec() != null && !userDetail.getMeasureProtectTradeSec().isEmpty()) 
			userDetailModel.setMeasureProtectTradeSec(convertListToString(userDetail.getMeasureProtectTradeSec()));
		userDetailModel.setPatentableInnov(userDetail.getPatentableInnov());
		if (userDetail.getPatentableInnovFile() != null && !userDetail.getPatentableInnovFile().isEmpty()) 
			userDetailModel.setPatentableInnovFile(convertListToString(userDetail.getPatentableInnovFile()));
		userDetailModel.setPerOngTradeSec(userDetail.getPerOngTradeSec());
		
		userDetailModel.setCompCondIpPolicy(userDetail.getCompCondIpPolicy());	
		
		userDetailModel.setIntelliMonitor(userDetail.getIntelliMonitor());	
		userDetailModel.setSpaceAnaly(userDetail.getSpaceAnaly());	
		userDetailModel.setRandDInCentOrg(userDetail.getRandDInCentOrg());	
		userDetailModel.setInnovFromIntEmp(userDetail.getInnovFromIntEmp());	
		
		if (userDetail.getBizUnitConduct() != null && !userDetail.getBizUnitConduct().isEmpty()) 
			userDetailModel.setBizUnitConduct(userDetail.getBizUnitConduct());	
		
		userDetailModel.setEmpSignNDA(userDetail.getEmpSignNDA());	
		userDetailModel.setOpenInnovPortal(userDetail.getOpenInnovPortal());	
		userDetailModel.setOpenInnovThirdParty(userDetail.getOpenInnovThirdParty());	
		
		if (userDetail.getExtractValue() != null && !userDetail.getExtractValue().isEmpty()) 
			userDetailModel.setExtractValue(userDetail.getExtractValue());
		
		if (userDetail.getCompExtValue() != null && !userDetail.getCompExtValue().isEmpty()) 
			userDetailModel.setCompExtValue(convertListToString(userDetail.getCompExtValue()));
		
		if (userDetail.getCompExtThrough() != null && !userDetail.getCompExtThrough().isEmpty()) 
			userDetailModel.setCompExtThrough(convertListToString(userDetail.getCompExtThrough()));
		
		userDetailModel.setInterCompIpAgree(userDetail.getInterCompIpAgree());
		userDetailModel.setTrainForSecure(userDetail.getTrainForSecure());
		userDetailModel.setEmpHandbook(userDetail.getEmpHandbook());
		userDetailModel.setIpAsFinReport(userDetail.getIpAsFinReport());
		userDetailModel.setReviewAggr(userDetail.getReviewAggr());
		userDetailModel.setDefIpStratg(userDetail.getDefIpStratg());
		userDetailModel.setIpAudits(userDetail.getIpAudits());
		userDetailModel.setIpRightsAtEmptTime(userDetail.getIpRightsAtEmptTime());
		userDetailModel.setEmpRecvAddIncent(userDetail.getEmpRecvAddIncent());
		
		userDetailModel.setCompForInvest(userDetail.getCompForInvest());
		userDetailModel.setAcqProcMandA(userDetail.getAcqProcMandA());
		userDetailModel.setEngJointDev(userDetail.getEngJointDev());
		userDetailModel.setContractResOrg(userDetail.getContractResOrg());
		userDetailModel.setOrgCompInt(userDetail.getOrgCompInt());
		userDetailModel.setPastIpRights(userDetail.getPastIpRights());
		userDetailModel.setDedicatStafRes(userDetail.getDedicatStafRes());
		userDetailModel.setCoPromoAgree(userDetail.getCoPromoAgree());
		userDetailModel.setIndSubmitIdea(userDetail.getIndSubmitIdea());
		userDetailModel.setGatherIdeas(userDetail.getGatherIdeas());
		
		
		//SAMBIT....
		/*userDetailModel.getPrimaryIndus();
		
		
		userDetailModel.getGrossRevenue();
		userDetailModel.getProjectedSale();
		userDetailModel.getRevToRandD();
		userDetailModel.getAmtSpend();
		userDetailModel.getSpendBizUnit();
		
		userDetailModel.getProtectTradeSce();
		userDetailModel.getDoesCompHasOverIpGov();
		userDetailModel.getEmpAgreeUtil(); //List
		userDetailModel.getLastNDAAgree();
		userDetailModel.getIprDocketing();
		userDetailModel.getAmtFound();
		userDetailModel.getCompBenchmark();
		
		userDetailModel.getHowPreserveCopyRight();//List
		userDetailModel.getWherRegTradeMark();//List
		userDetailModel.getFrameMngCyberSecRisk();
		userDetailModel.getMeasureProtectTradeSec();//List
		userDetailModel.getPatentableInnov();
		userDetailModel.getPatentableInnovFile();//List
		userDetailModel.getPerOngTradeSec(); 
		
		userDetailModel.getCompCondIpPolicy();
		userDetailModel.getIntelliMonitor();
		userDetailModel.getSpaceAnaly();
		userDetailModel.getRandDInCentOrg();
		userDetailModel.getInnovFromIntEmp();
		userDetailModel.getBizUnitConduct();
		userDetailModel.getEmpSignNDA();
		userDetailModel.getOpenInnovPortal();
		userDetailModel.getOpenInnovThirdParty();  
		
		
		userDetailModel.getExtractValue();
		userDetailModel.getCompExtValue();//List
		userDetailModel.getCompExtThrough();//LIST
		userDetailModel.getInterCompIpAgree();
		userDetailModel.getTrainForSecure();
		userDetailModel.getEmpHandbook();
		userDetailModel.getIpAsFinReport();
		userDetailModel.getReviewAggr();
		userDetailModel.getDefIpStratg();
		userDetailModel.getIpAudits();
		userDetailModel.getIpRightsAtEmptTime();
		userDetailModel.getEmpRecvAddIncent();     
		

		userDetailModel.getCompForInvest();
		userDetailModel.getAcqProcMandA();
		userDetailModel.getEngJointDev();
		userDetailModel.getContractResOrg();
		userDetailModel.getOrgCompInt();
		userDetailModel.getPastIpRights();
		userDetailModel.getDedicatStafRes();
		userDetailModel.getCoPromoAgree();
		userDetailModel.getIndSubmitIdea();
		userDetailModel.getGatherIdeas();*/
	}

	public UserDetail setuserDetail(UserDetailModel userDetailModel) {

		userDetailRet = new UserDetail();
		
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetailRet.setUserID(userDetailModel.getUserID());
		if (userDetailModel.getUserName() != null && !userDetailModel.getUserName().isEmpty()) 
			userDetailRet.setUserName(userDetailModel.getUserName());
		if (userDetailModel.getCompanyName() != null && !userDetailModel.getCompanyName().isEmpty()) 
			userDetailRet.setCompanyName(userDetailModel.getCompanyName());
		if (userDetailModel.getEmailID() != null && !userDetailModel.getEmailID().isEmpty()) 
			userDetailRet.setEmailID(userDetailModel.getEmailID());
		if (userDetailModel.getAddress1() != null && !userDetailModel.getAddress1().isEmpty()) 
			userDetailRet.setAddress1(userDetailModel.getAddress1());
		if (userDetailModel.getAddress2() != null && !userDetailModel.getAddress2().isEmpty()) 
			userDetailRet.setAddress2(userDetailModel.getAddress2());
		if (userDetailModel.getCity() != null && !userDetailModel.getCity().isEmpty()) 
			userDetailRet.setCity(userDetailModel.getCity());
		if (userDetailModel.getZip() != null && !userDetailModel.getZip().isEmpty()) 
			userDetailRet.setZip(userDetailModel.getZip());
		if (userDetailModel.getCountry() != null && !userDetailModel.getCountry().isEmpty()) 
			userDetailRet.setCountry(userDetailModel.getCountry());
		if (userDetailModel.getPhoneNo() != null && !userDetailModel.getPhoneNo().isEmpty()) 
			userDetailRet.setPhoneNo(userDetailModel.getPhoneNo());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetailRet.setUserID(userDetailModel.getUserID());
		
		if (userDetailModel.getAnnualRev() != null && !userDetailModel.getAnnualRev().isEmpty()) 
			userDetailRet.setAnnualRev(userDetailModel.getAnnualRev());

		if (userDetailModel.getNoOfEmp() != null && !userDetailModel.getNoOfEmp().isEmpty()) 
			userDetailRet.setNoOfEmp(userDetailModel.getNoOfEmp());

		if (userDetailModel.getInvestInRnD() != null && !userDetailModel.getInvestInRnD().isEmpty()) 
			userDetailRet.setInvestInRnD(Arrays.asList(userDetailModel.getInvestInRnD().split(",")));

		if (userDetailModel.getBusInCountries() != null && !userDetailModel.getBusInCountries().isEmpty()) 
			userDetailRet.setBusInCountries(Arrays.asList(userDetailModel.getBusInCountries().split(",")));

		if (userDetailModel.getSellProd() != null && !userDetailModel.getSellProd().isEmpty()) 
			userDetailRet.setSellProd(Arrays.asList(userDetailModel.getSellProd().split(",")));
		
		// These all are int value
		userDetailRet.setThirdPartyProd(userDetailModel.getThirdPartyProd());
		userDetailRet.setCompBusType(userDetailModel.getCompBusType());
		userDetailRet.setSellService(userDetailModel.getSellService());
		userDetailRet.setSellProdAndSvc(userDetailModel.getSellProdAndSvc());
		userDetailRet.setLicProp(userDetailModel.getLicProp());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetailRet.setUserID(userDetailModel.getUserID());
		if (userDetailModel.getCompOverall() != null && !userDetailModel.getCompOverall().isEmpty()) 
			userDetailRet.setCompOverall(userDetailModel.getCompOverall());
		if (userDetailModel.getCompByBu() != null && !userDetailModel.getCompByBu().isEmpty()) 
			userDetailRet.setCompByBu(userDetailModel.getCompByBu());
		if (userDetailModel.getCompMarketAct() != null && !userDetailModel.getCompMarketAct().isEmpty()) 
			userDetailRet.setCompMarketAct(Arrays.asList(userDetailModel.getCompMarketAct().split(",")));
		
		userDetailRet.setCompIpPolicy(userDetailModel.getCompIpPolicy());
		userDetailRet.setCompIpStrategy(userDetailModel.getCompIpStrategy());
		userDetailRet.setBusinesStrategy(userDetailModel.getBusinesStrategy());
		userDetailRet.setUserID(userDetailModel.getUserID());
		userDetailRet.setPreserveCopyRight(userDetailModel.getPreserveCopyRight());
		userDetailRet.setRegTradeMark(userDetailModel.getRegTradeMark());
		userDetailRet.setDomainRefBN(userDetailModel.getDomainRefBN());
		userDetailRet.setDomainRefPN(userDetailModel.getDomainRefPN());
		userDetailRet.setTradeSec(userDetailModel.getTradeSec());
		userDetailRet.setCategoriTradeSec(userDetailModel.getCategoriTradeSec());
		userDetailRet.setMngCyberSecRisk(userDetailModel.getMngCyberSecRisk());
		userDetailRet.setProtectTradeSec(userDetailModel.getProtectTradeSec());
		userDetailRet.setProtectConfInfo(userDetailModel.getProtectConfInfo());
		if (userDetailModel.getUserID() != null && !userDetailModel.getUserID().isEmpty()) 
			userDetailRet.setUserID(userDetailModel.getUserID());
		
		if (userDetailModel.getHasIpPolicyList() != null && !userDetailModel.getHasIpPolicyList().isEmpty()) 
			userDetailRet.setHasIpPolicyList(Arrays.asList(userDetailModel.getHasIpPolicyList().split(",")));
		
		if (userDetailModel.getAgreementMngProtList() != null && !userDetailModel.getAgreementMngProtList().isEmpty()) 
			userDetailRet.setAgreementMngProtList(Arrays.asList(userDetailModel.getAgreementMngProtList().split(",")));
			
		if (userDetailModel.getHasErmList() != null && !userDetailModel.getHasErmList().isEmpty())
			userDetailRet.setHasErmList(Arrays.asList(userDetailModel.getHasErmList().split(",")));
		
		if (userDetailModel.getThirdPartyLia() != null && !userDetailModel.getThirdPartyLia().isEmpty())
			userDetailRet.setThirdPartyLia(Arrays.asList(userDetailModel.getThirdPartyLia().split(",")));
		
		if (userDetailModel.getThirdPartyIns() != null && !userDetailModel.getThirdPartyIns().isEmpty())
			userDetailRet.setThirdPartyIns(Arrays.asList(userDetailModel.getThirdPartyIns().split(",")));
		
		if (userDetailModel.getHasOverIpGov() != null && !userDetailModel.getHasOverIpGov().isEmpty())
			userDetailRet.setHasOverIpGov(Arrays.asList(userDetailModel.getHasOverIpGov().split(",")));
		
		userDetailRet.setHasConfInfo(userDetailModel.getHasConfInfo());
		userDetailRet.setHasIpPolicy(userDetailModel.getHasIpPolicy());
		userDetailRet.setAgreementMngProt(userDetailModel.getAgreementMngProt());
		userDetailRet.setHasErm(userDetailModel.getHasErm());
		userDetailRet.setSelfInsIpLose(userDetailModel.getSelfInsIpLose());
		userDetailRet.setPurchedThirdPartyIns(userDetailModel.getPurchedThirdPartyIns());
		
		if (userDetailModel.getPrimaryIndus() != null && !userDetailModel.getPrimaryIndus().isEmpty()) 
			userDetailRet.setPrimaryIndus(userDetailModel.getPrimaryIndus());	
		
		userDetailRet.setGrossRevenue(userDetailModel.getGrossRevenue());	
		userDetailRet.setProjectedSale(userDetailModel.getProjectedSale());	
		
		if (userDetailModel.getRevToRandD() != null && !userDetailModel.getRevToRandD().isEmpty()) 
			userDetailRet.setRevToRandD(userDetailModel.getRevToRandD());	

		userDetailRet.setAmtSpend(userDetailModel.getAmtSpend());	
		userDetailRet.setSpendBizUnit(userDetailModel.getSpendBizUnit());	
		
		if (userDetailModel.getProtectTradeSce() != null && !userDetailModel.getProtectTradeSce().isEmpty()) 
			userDetailRet.setProtectTradeSce(userDetailModel.getProtectTradeSce());	
		
		userDetailRet.setDoesCompHasOverIpGov(userDetailModel.getDoesCompHasOverIpGov());	
		
		if (userDetailModel.getEmpAgreeUtil() != null && !userDetailModel.getEmpAgreeUtil().isEmpty()) 
			userDetailRet.setEmpAgreeUtil(Arrays.asList(userDetailModel.getEmpAgreeUtil().split(",")));	
		if (userDetailModel.getLastNDAAgree() != null && !userDetailModel.getLastNDAAgree().isEmpty()) 
			userDetailRet.setLastNDAAgree(userDetailModel.getLastNDAAgree());	
		
		if (userDetailModel.getIprDocketing() != null && !userDetailModel.getIprDocketing().isEmpty()) 
			userDetailRet.setIprDocketing(userDetailModel.getIprDocketing());	
		
		userDetailRet.setAmtFound(userDetailModel.getAmtFound());	
		
		if (userDetailModel.getCompBenchmark() != null && !userDetailModel.getCompBenchmark().isEmpty()) 
			userDetailModel.setCompBenchmark(userDetailModel.getCompBenchmark());	
		
		
		if (userDetailModel.getHowPreserveCopyRight() != null && !userDetailModel.getHowPreserveCopyRight().isEmpty()) 
			userDetailRet.setHowPreserveCopyRight(Arrays.asList(userDetailModel.getHowPreserveCopyRight().split(",")));
		if (userDetailModel.getWherRegTradeMark() != null && !userDetailModel.getWherRegTradeMark().isEmpty()) 
			userDetailRet.setWherRegTradeMark(Arrays.asList(userDetailModel.getWherRegTradeMark().split(",")));
		if (userDetailModel.getFrameMngCyberSecRisk() != null && !userDetailModel.getFrameMngCyberSecRisk().isEmpty()) 
			userDetailRet.setFrameMngCyberSecRisk(userDetailModel.getFrameMngCyberSecRisk());
		if (userDetailModel.getMeasureProtectTradeSec() != null && !userDetailModel.getMeasureProtectTradeSec().isEmpty()) 
			userDetailRet.setMeasureProtectTradeSec(Arrays.asList(userDetailModel.getMeasureProtectTradeSec().split(",")));
		userDetailRet.setPatentableInnov(userDetailModel.getPatentableInnov());
		if (userDetailModel.getPatentableInnovFile() != null && !userDetailModel.getPatentableInnovFile().isEmpty()) 
			userDetailRet.setPatentableInnovFile(Arrays.asList(userDetailModel.getPatentableInnovFile().split(",")));
		userDetailRet.setPerOngTradeSec(userDetailModel.getPerOngTradeSec());
		
		userDetailRet.setCompCondIpPolicy(userDetailModel.getCompCondIpPolicy());	
		
		userDetailRet.setIntelliMonitor(userDetailModel.getIntelliMonitor());	
		userDetailRet.setSpaceAnaly(userDetailModel.getSpaceAnaly());	
		userDetailRet.setRandDInCentOrg(userDetailModel.getRandDInCentOrg());	
		userDetailRet.setInnovFromIntEmp(userDetailModel.getInnovFromIntEmp());	
		
		if (userDetailModel.getBizUnitConduct() != null && !userDetailModel.getBizUnitConduct().isEmpty()) 
			userDetailRet.setBizUnitConduct(userDetailModel.getBizUnitConduct());	
		
		userDetailRet.setEmpSignNDA(userDetailModel.getEmpSignNDA());	
		userDetailRet.setOpenInnovPortal(userDetailModel.getOpenInnovPortal());	
		userDetailRet.setOpenInnovThirdParty(userDetailModel.getOpenInnovThirdParty());	
		
		if (userDetailModel.getExtractValue() != null && !userDetailModel.getExtractValue().isEmpty()) 
			userDetailRet.setExtractValue(userDetailModel.getExtractValue());
		
		if (userDetailModel.getCompExtValue() != null && !userDetailModel.getCompExtValue().isEmpty()) 
			userDetailRet.setCompExtValue(Arrays.asList(userDetailModel.getCompExtValue().split(",")));
		
		if (userDetailModel.getCompExtThrough() != null && !userDetailModel.getCompExtThrough().isEmpty()) 
			userDetailRet.setCompExtThrough(Arrays.asList(userDetailModel.getCompExtThrough().split(",")));
		
		userDetailRet.setInterCompIpAgree(userDetailModel.getInterCompIpAgree());
		userDetailRet.setTrainForSecure(userDetailModel.getTrainForSecure());
		userDetailRet.setEmpHandbook(userDetailModel.getEmpHandbook());
		userDetailRet.setIpAsFinReport(userDetailModel.getIpAsFinReport());
		userDetailRet.setReviewAggr(userDetailModel.getReviewAggr());
		userDetailRet.setDefIpStratg(userDetailModel.getDefIpStratg());
		userDetailRet.setIpAudits(userDetailModel.getIpAudits());
		userDetailRet.setIpRightsAtEmptTime(userDetailModel.getIpRightsAtEmptTime());
		userDetailRet.setEmpRecvAddIncent(userDetailModel.getEmpRecvAddIncent());
		
		userDetailRet.setCompForInvest(userDetailModel.getCompForInvest());
		userDetailRet.setAcqProcMandA(userDetailModel.getAcqProcMandA());
		userDetailRet.setEngJointDev(userDetailModel.getEngJointDev());
		userDetailRet.setContractResOrg(userDetailModel.getContractResOrg());
		userDetailRet.setOrgCompInt(userDetailModel.getOrgCompInt());
		userDetailRet.setPastIpRights(userDetailModel.getPastIpRights());
		userDetailRet.setDedicatStafRes(userDetailModel.getDedicatStafRes());
		userDetailRet.setCoPromoAgree(userDetailModel.getCoPromoAgree());
		userDetailRet.setIndSubmitIdea(userDetailModel.getIndSubmitIdea());
		userDetailRet.setGatherIdeas(userDetailModel.getGatherIdeas());
		
		return userDetailRet;
	}
	
	private String convertListToString(List<String> inputList){
		StringBuilder tempStrBuilder = new StringBuilder();
			for(String tempStr : inputList){
				if(tempStr != null && !tempStr.isEmpty()){
					tempStrBuilder.append(tempStr.trim());
					tempStrBuilder.append(",");
				}
			}
			if (tempStrBuilder != null && !tempStrBuilder.toString().isEmpty()) 
				tempStrBuilder.delete(tempStrBuilder.length()-1, tempStrBuilder.length());
			
		return tempStrBuilder.toString();
	}

}
