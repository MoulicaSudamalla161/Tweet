package com.tweetapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tweetapp.dao.PostDaoSqlImpl;
import com.tweetapp.model.PostTweet;

/**
 * Servlet implementation class ViewAllServlet
 */
@WebServlet("/ViewAllTweets")
public class ViewAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAllServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		PostDaoSqlImpl postTweet = new PostDaoSqlImpl();
		List<PostTweet> tweetsList = postTweet.getAllTweets();
		for (PostTweet p : tweetsList)
			request.setAttribute("tweetsList", tweetsList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAll.jsp");
		dispatcher.forward(request, response);

	}

}
