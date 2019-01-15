package com.mallika.mvc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class DAOClass {

	


		//private DataSource dataSource;
		   private JdbcTemplate jdbcTemplate;
		   // BankDemo bankDemo;
		   
		   public JdbcTemplate getJdbcTemplate() {
				return jdbcTemplate;
			}
			public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
				this.jdbcTemplate = jdbcTemplate;
			}
		
		
		/*public void setDataSource(DataSource dataSource) 
		   {
		      this.dataSource = dataSource;
		      this.jdbcTemplate = new JdbcTemplate(dataSource);
		   }*/
		
	/*public void createTable(){
		
		jdbcTemplate.execute("create table employeeps(userName number(10),password varchar2(10))");
	}*/
	public boolean loginUser(String user, String password) {
		System.out.println("user"+user);
		
		

	    String sql = "select * from users where username='" + user + "' and password='" + password
	    + "'";
	    List<UserCrendentails> users = jdbcTemplate.query(sql, new UserMapper());

		
		
		
		
		
				return true;
	}


	
		
	}		// TODO Auto-generated method stub
		
	

