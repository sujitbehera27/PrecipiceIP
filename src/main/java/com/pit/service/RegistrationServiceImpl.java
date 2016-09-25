package com.pit.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.pit.biz.registration.RegistrationBusinessManager;
import com.pit.bo.BusinessDetail;
import com.pit.bo.CompanyDetail;
import com.pit.bo.FinancialDetail;
import com.pit.bo.RiskMngDetail;
import com.pit.bo.TradeDetail;
import com.pit.bo.UserDetail;

@Component
@Path("/reg")
public class RegistrationServiceImpl {
	
	@Autowired
	public RegistrationBusinessManager regBusinesMng;
	
	
	private String jsonResponse = null;
	
	private static Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("user")
	public Response setUserDetails(UserDetail userDetail) {
		
		System.out.println("RegistrationServiceImpl~~~User Name~~~~~~~>" + userDetail.getUserName());
		System.out.println("RegistrationServiceImpl~~~User ID~~~~~~~>" + userDetail.getUserID());
		System.out.println("RegistrationServiceImpl~~~User ID~~~~~~~>" + userDetail.getFormID()+"--"+userDetail.getCompanyName());
		logger.info("setCompanyDetails : Company Details Submited..");
		try {
			if (userDetail != null) {
				userDetail = regBusinesMng.setUserDetails(userDetail);
				
				if(userDetail != null){
					Gson gson = new Gson();
					jsonResponse = gson.toJson(userDetail);
				}
			}
			
			System.out.println("  <~~~~~~~~~~~~~Completed ~~~~~~~~~~~");
		} catch (Exception e) {
			e.printStackTrace();
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("userDetails/{userID}")
	public Response getUserDetails(@PathParam("userID") String userId) {
		
		try {
			if (userId != null) {
				UserDetail userDetail = regBusinesMng.getUserDetails(userId);
				if(userDetail != null){
					Gson gson = new Gson();
					System.out.println("================================setRegistartion==========================");
					jsonResponse = gson.toJson(userDetail);
				}
			}
			System.out.println("  <~~~~~~~~~~~~~Completed ~~~~~~~~~~~");
		} catch (Exception e) {
			e.printStackTrace();
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}
	
	/*@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("companyDet")
	public Response setCompanyDetails(CompanyDetail companyDetail, @Context HttpServletRequest request) {
		
		System.out.println("~~~~~~~User Name~~~~~~~>" + companyDetail.getUserName());
		logger.info("setCompanyDetails : Company Details Submited..");
		
		//HttpSession session= request.getSession(true);
    	//int id = (int) session.getAttribute("regID");
		
		try {
			
			boolean retVal = regBusinesMng.setCompanyDetailBusMng(companyDetail);
			System.out.println(retVal+"  <~~~~~~~~~~~~~companyDet ~~~~~~~~~~~");
			
		} catch (Exception e) {
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		
		//TODO : Check Return Type
		return Response.status(Response.Status.OK).entity("").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("financialDet")
	public Response setFinancialDetails(FinancialDetail financialDetail) {
		
		logger.info("setFinancialDetails : Financial Details Submited..");
		System.out.println("------" + financialDetail);
		try {
			regBusinesMng.setFinancialDetailsBusMng(financialDetail);
			
		} catch (Exception e) {
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		
		//TODO : Check Return Type
		return Response.status(Response.Status.OK).entity("").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("businessDet")
	public Response setBusinessDetails(BusinessDetail businessDetail) {
		
		logger.info("setBusinessDetails : Business Details Submited..");
		
		try {
			regBusinesMng.setBusinessDetailBusMng(businessDetail);
			
		} catch (Exception e) {
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		
		//TODO : Check Return Type
		return Response.status(Response.Status.OK).entity("").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("tradeDet")
	public Response setTradeDetails(TradeDetail tradeDetail) {
		
		logger.info("setTradeDetails : Trade Details Submited..");
		System.out.println("```````Trade Detail`````"+tradeDetail.getPreserveCopyRight() + " `` Preserve Copy Right <==> Register Trade MArk``" + tradeDetail.getRegTradeMark());
		try {
			regBusinesMng.setTradeDetailBusMng(tradeDetail);
			
		} catch (Exception e) {
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		//TODO : Check Return Type
		return Response.status(Response.Status.OK).entity("").build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("riskMng")
	public Response setRiskManagement(RiskMngDetail riskMngDetail) {
		
		logger.info("setRiskManagement : Risk Management Details Submited..");
		
		try {
			regBusinesMng.setRiskManagementBusMng(riskMngDetail);
			
		} catch (Exception e) {
			Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		//TODO : Check Return Type
		return Response.status(Response.Status.OK).entity("").build();
	}*/

}
