package com.mallika.validation;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/valid")
public class Validateuser {
	  @POST
	    @Produces(MediaType.TEXT_PLAIN)
	public String validUser(@FormParam("userName") String userName,@FormParam("password") String password) {
		if(userName.equals("mallika") && password.equals("ykunta")){
		return "valid";
		}
		return "invalid";
	}
	
}
