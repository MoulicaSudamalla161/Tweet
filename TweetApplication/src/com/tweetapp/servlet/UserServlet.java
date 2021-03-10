package com.tweetapp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.tweetapp.dao.UserDaoSqlImpl;
import com.tweetapp.model.User;
import com.tweetapp.util.DateUtil;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoSqlImpl userDaoSqlImpl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() {
		userDaoSqlImpl = new UserDaoSqlImpl();
	}
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		int c=0;
		String fName=request.getParameter("firstname");
		String lName=request.getParameter("lastname");
//		boolean active = request.getParameter("inStock").equals("yes") ? TruYumConstant.ACTIVE : TruYumConstant.INACTIVE;
		String gender = request.getParameter("gender").equals("Male") ? "Male":"Female";
//		System.out.println(gender);
//		String gender="Male";
		Date dateOfBirth = DateUtil.convertToDate(request.getParameter("date"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user = new User();
		user.setFirstName(fName);
		user.setLastName(lName);
		user.setGender(gender);
		user.setDateOfBirth(dateOfBirth);
        user.seteMail(email);
        user.setPassword(password);
//        System.out.println(user.toString());
		
		try {
			userDaoSqlImpl.registerUser(user);
		}catch(Exception e) {
			 c=1;
			 System.out.println("value of c:"+c);
			e.printStackTrace();
		   	
		}
		finally {
			System.out.println(c);
		if(c>=1) {
			request.setAttribute("error", "User already exists with the user id" );
			request.getRequestDispatcher("/Registration.jsp").forward(request, response);
		}
		else {
		response.sendRedirect("Login.jsp");
		}
		}
		
	}

}
