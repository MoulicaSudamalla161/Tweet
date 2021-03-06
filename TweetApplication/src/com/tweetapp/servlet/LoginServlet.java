package com.tweetapp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tweetapp.dao.UserDaoSqlImpl;
import com.tweetapp.exception.UserNotFoundException;
import com.tweetapp.dao.LoginDaoSqlImpl;
import com.tweetapp.model.Login;
import com.tweetapp.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDaoSqlImpl loginDaoSqlImpl;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() {
		loginDaoSqlImpl = new LoginDaoSqlImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String userName =request.getParameter("email");
		String password = request.getParameter("password");
		Login login = new Login();
		login.setUserName(userName);
		login.setPassword(password);
		
		User value = null;
		System.out.println(login.toString());
		try {
			System.out.println("Calling SqlDao");
			 value = loginDaoSqlImpl.getUser(userName);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(value.toString());
		System.out.println("*********"+userName);
		System.out.println(value.geteMail());
		
		if(value.geteMail().equals(userName) && value.getPassword().equals(password)) {
			HttpSession session = request.getSession();
	        session.setAttribute("user", userName);
         request.setAttribute("userValue",userName );
         request.getRequestDispatcher("/Home.jsp").forward(request, response);
//		 response.sendRedirect("Hello.jsp");
		}
		else 
		{
		request.setAttribute("errorMessage", "Invalid username / password ");	
		request.getRequestDispatcher("/Login.jsp").forward(request, response);
//		response.sendRedirect("Login.jsp");
		}
		
	}

}
