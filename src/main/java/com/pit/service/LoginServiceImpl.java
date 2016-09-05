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
import com.pit.biz.login.LoginBusinessManager;
import com.pit.bo.LoginRegistartion;
import java.util.Random;

@Component
@Path("/user")
public class LoginServiceImpl /*implements LoginService*/{
	
	
	@Autowired
	public LoginBusinessManager loginBusinessManager;
	
	private String jsonResponse = null;
	
	private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@POST
    @Path("login")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    //@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLoginDetails(LoginRegistartion loginRegistartion) {
		
		System.out.println("~~~~~UN~~~~~~> "+loginRegistartion.getEmailID() +"~~~~~PW~~~> "+ loginRegistartion.getPassword());
		
		logger.info("getLoginDetails : Email ID -> " + loginRegistartion.getEmailID());  
		
		try{
			loginRegistartion = loginBusinessManager.getLoginDetailsBusMng(loginRegistartion);
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			if(loginRegistartion != null){
				Gson gson = new Gson();
				jsonResponse = gson.toJson(loginRegistartion);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}

	@POST
	@Path("/registarion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response setRegistartion(LoginRegistartion registartion) {
		logger.info("setRegistartion : Registaring new user.");
		
		try{
			// TODO : What need to return 
			Random randomGenerator = new Random();
			
		    registartion.setUserId(System.currentTimeMillis());
			loginBusinessManager.setRegistration(registartion);
			Gson gson = new Gson();
			
			jsonResponse = gson.toJson(registartion);
			
		}catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
		return Response.status(Response.Status.OK).entity(jsonResponse).build();
	}

	//@Override
	public Response forgotPassword(String emailID) {
		logger.info("forgotPassword : " + emailID);
		
		return null;
	}
	
	 @GET
	    @Path("getbook/{id}")
	    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public LoginRegistartion getBookInfo(@PathParam("id") int bookId) {
	 
		 System.out.println("------------------------------------");
	        // retrieve book information based on the id supplied in the formal argument
		 LoginRegistartion getBook = loginBusinessManager.getLoginDetailsBusMng(null);
	 
		 LoginRegistartion bookType = new LoginRegistartion();
	        return bookType;
	    }


}
