package com.tweetapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.tweetapp.handler.ConnectionHandler;
import com.tweetapp.model.User;

public class UserDaoSqlImpl  {
//	static Logger logger = Logger.getLogger(UserDaoSqlImpl.class);
	int flag=0;
	public void registerUser(User user) throws Exception {
	String INSERT_USERS_SQL = "INSERT INTO user" +
            "  (us_first_name, us_last_name, us_gender, us_dob, us_email, us_password) VALUES " +
            " (?, ?, ?, ?, ?,?);";
	

    Connection connection = ConnectionHandler.getConnection()
;
        // Step 2:Create a statement using connection object
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL) ;
       
        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getGender());
        preparedStatement.setDate(4, new Date(user.getDateOfBirth().getTime()));
        preparedStatement.setString(5, user.geteMail());
        preparedStatement.setString(6, user.getPassword());

        System.out.println(preparedStatement);
        // Step 3: Execute the query or update query
        preparedStatement.executeUpdate();

    } 

//    return result;
	}
	 
	 

