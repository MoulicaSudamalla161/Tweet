package com.tweetapp.exception;

public class UserNotFoundException extends Exception {

	String message;
	public UserNotFoundException(String m) {
		// TODO Auto-generated constructor stub
		this.message=m;
	}
	 

}
