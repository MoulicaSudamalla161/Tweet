package com.tweetapp.handler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionHandler {
//	static Logger logger = Logger.getLogger(ConnectionHandler.class);

	 

    public static Connection getConnection() {
//        BasicConfigurator.configure();
        Connection connection = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/tweetdb";
            String username = "root";
            String password = "root";
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException classNotFoundException) {
//            logger.debug("Class Not Found Exception caught " + classNotFoundException);
            throw new RuntimeException("Class Not Found Exception caught");
        } catch (SQLException sqlException) {
//            logger.debug("SQL Exception caught " + sqlException);
            throw new RuntimeException("SQL Exception caught");
        }
        return connection;
    }

}
