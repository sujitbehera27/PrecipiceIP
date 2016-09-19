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
import com.pit.bo.UserDetail;

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
	public Response getLoginDetails(LoginRegistartion loginRegistartion) {
		
		String userID = null;
		try{
			if(loginRegistartion.getUserId() != null && loginRegistartion.getPassword() != null){
				
				userID  = loginBusinessManager.getLoginDetailsBusMng(loginRegistartion);
			}
		}catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(userID).build();
	}

	@POST
	@Path("/registarion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response setRegistartion(LoginRegistartion registartion) {
		logger.info("setRegistartion : Registaring new user.");
		String retUserID = null;
		try{
			if(registartion != null){
				boolean hasSuccessReg = loginBusinessManager.setRegistration(registartion);
				
				if (hasSuccessReg) {
					retUserID = registartion.getUserId();
					Gson gson = new Gson();
					jsonResponse = gson.toJson(retUserID);
				} 
			}
		}catch (Exception e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}

	
	public Response forgotPassword(String emailID) {
		logger.info("forgotPassword : " + emailID);
		return null;
	}
	
	   // @Path("getbook/{id}")
	   // public LoginRegistartion getBookInfo(@PathParam("id") int bookId) 
}
