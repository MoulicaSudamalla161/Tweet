package com.tweetapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tweetapp.dao.PostDaoSqlImpl;
import com.tweetapp.model.PostTweet;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/Post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PostDaoSqlImpl postDaoSqlImpl = new PostDaoSqlImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		HttpSession session = request.getSession();
        String user = (String)session.getAttribute("user");
//		String uName=request.getParameter("email");
		String tweet=request.getParameter("post");
		PostTweet pTweet = new PostTweet();
		pTweet.setUserName(user);
		pTweet.setTweet(tweet);
//		System.out.println(pTweet.toString());
		try {
			postDaoSqlImpl.postTweet(pTweet);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		response.sendRedirect("Home.jsp");
	}

}
