package com.tweetapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tweetapp.exception.UserNotFoundException;
import com.tweetapp.handler.ConnectionHandler;
import com.tweetapp.model.Login;
import com.tweetapp.model.User;

public class LoginDaoSqlImpl {
	

	public User getUser(String Username) throws ClassNotFoundException, SQLException, UserNotFoundException {
		String SELECT_USER = "select us_email,us_password from user where us_email =?";
//		String SELECT_USER = "select * from user";

		
		User user = new User();
		 
		 try {
			 Connection connection =  ConnectionHandler.getConnection();
//				 Statement statement = connection.createStatement())
				 PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER);
		            preparedStatement.setString(1, Username);
		            
		            ResultSet resultSet = preparedStatement.executeQuery();
		            System.out.println("before result ");
		          
		            System.out.println("*********"+resultSet.toString());
		            while(resultSet.next()) {
		            	
		            	System.out.println("before result set email");
		            System.out.println(resultSet.getString("us_email"));
		            user.seteMail(resultSet.getString("us_email"));
		            
		      
		            user.setPassword(resultSet.getString("us_password"));
		            }
			
		 }catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
//			 System.out.println("Caught an error");
		}
		return user;
	
	}

	
			
		   
		
		
		


}
