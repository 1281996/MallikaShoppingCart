package com.mallika.mvc;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
	
	
	@Autowired
	Service service;
	

	@RequestMapping(value="/login", method=RequestMethod.GET)
	  public String showUser() {
		 // System.out.println("hello");
		return "login";
		  
	  }
	  
	 
	  @RequestMapping(value="/loginp", method=RequestMethod.POST)
	 
	 public ModelAndView validUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  
		   PrintWriter pw=response.getWriter();
		  /*pw.println(request.getParameter("name1"));
		  pw.println(request.getParameter("password"));*/
	      String user=request.getParameter("name1");
	     String password=request.getParameter("password");
	
	    
    if(service.loginUser(user, password)) {
	      pw.println("hello "+user);
           } 
		 return null; 
	  }
	
}
