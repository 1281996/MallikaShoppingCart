package com.mallika.valid;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class ValidateUser {
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	
	public String validUser(@FormParam("userName") String userName, @FormParam("password") String password) {
		System.out.println("helo");
		if (userName.equals("mallika") && password.equals("ykunta")) {
			return "valid";
		}
		return "invalid";
	}

}
