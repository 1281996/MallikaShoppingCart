package com.mallika.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired
	DAOClass dao;
	public boolean loginUser(String user, String password) {
		// TODO Auto-generated method stub
		return dao.loginUser(user, password);
	}

	
}
