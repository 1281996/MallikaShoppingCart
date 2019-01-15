package com.mallika.login;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("valid")
public class Validateuser {
	  @GET
	    @Produces(MediaType.TEXT_PLAIN)
	public String validUser(@PathParam("userName") String userName,@PathParam("password") String password) {
		if(userName.equals("mallika") && password.equals("ykunta")){
		return "valid";
		}
		return "invalid";
	}
	
}
