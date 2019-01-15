package com.mallika.resource;

import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mallika.dao.DAOClass;
import com.mallika.pojo.UserInformation;
@Path("/zip")
public class Resource {

	DAOClass dao=new DAOClass();
	@Path("{zip}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public UserInformation getInformation(@PathParam("zip") int zip1){
		
		for(Map.Entry<Integer,UserInformation> map1: dao.getAllInformation().entrySet()) {
		if(zip1==map1.getKey()) {
			UserInformation information=map1.getValue();
			return information;
		}
	
		
		}
		return  null;
		
		
	}
	
}
