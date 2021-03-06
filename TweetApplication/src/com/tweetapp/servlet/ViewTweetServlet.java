package com.tweetapp.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tweetapp.dao.PostDaoSqlImpl;
import com.tweetapp.model.PostTweet;

/**
 * Servlet implementation class ViewTweetServlet
 */
@WebServlet("/ViewTweet")
public class ViewTweetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PostDaoSqlImpl daoSqlImpl = new PostDaoSqlImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTweetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		HttpSession session = request.getSession();
        String user = (String)session.getAttribute("user");
        List<PostTweet> tweetsList= daoSqlImpl.getTweetById(user);
//        System.out.println("************");
//        System.out.println(tweetsList);
        for(PostTweet p:tweetsList)
   		 request.setAttribute("tweetsList", tweetsList);
   		 RequestDispatcher dispatcher = request.getRequestDispatcher("ViewTweet.jsp");
   		 dispatcher.forward(request, response);
        
	}

}
