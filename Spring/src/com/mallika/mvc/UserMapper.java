package com.mallika.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements  RowMapper<UserCrendentails> {

	 public UserCrendentails mapRow(ResultSet rs, int arg1) throws SQLException {
		 UserCrendentails user = new UserCrendentails();
		    user.setUserName(rs.getString("username"));
		    user.setPassword(rs.getString("password"));
		   
		    return user;
		  }

}





