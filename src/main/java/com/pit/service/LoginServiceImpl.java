package com.pit.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.pit.biz.login.LoginBusinessManager;
import com.pit.bo.LoginRegistartion;

@Component
@Path("/user")
public class LoginServiceImpl{
	
	
	@Autowired
	public LoginBusinessManager loginBusinessManager;
	
	private String jsonResponse = null;
	
	private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@POST
    @Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    //@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    //@Produces(MediaType.APPLICATION_FORM_URLENCODED)

	public Response getLoginDetails(LoginRegistartion loginRegistartion) {
		
		System.out.println("~~~~~UN~~~~~~> "+loginRegistartion.getEmailID() +"~~~~~PW~~~> "+ loginRegistartion.getPassword());
		
		logger.info("getLoginDetails : Email ID -> " + loginRegistartion.getEmailID());  
		
		try{
			if(loginRegistartion.getEmailID() != null && loginRegistartion.getPassword() != null){
				
			}
			loginRegistartion = loginBusinessManager.getLoginDetailsBusMng(loginRegistartion);
			if(loginRegistartion != null){
				Gson gson = new Gson();
				jsonResponse = gson.toJson(loginRegistartion);
			}
			
		}catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}

	@POST
	@Path("/registarion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response setRegistartion(LoginRegistartion registartion/*, @Context HttpServletRequest request*/) {
		logger.info("setRegistartion : Registaring new user.");
		int retVal = 0;
		try{
			if(registartion != null){
				retVal = loginBusinessManager.setRegistration(registartion);
				//HttpSession session = request.getSession();
				//session.setAttribute("regID", retVal);
			}
			
		}catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(retVal).build();
	}

	
	public Response forgotPassword(String emailID) {
		logger.info("forgotPassword : " + emailID);
		return null;
	}
	
	   // @Path("getbook/{id}")
	   // public LoginRegistartion getBookInfo(@PathParam("id") int bookId) 
}
