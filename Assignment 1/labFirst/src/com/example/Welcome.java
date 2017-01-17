package com.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Welcome() {
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
	
		
		//get input data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//creating session
		HttpSession session=request.getSession();
		
		//creating User object
		User user=new User(username,password);
		
		//authetication
		if(user.getUser_name().equals("admin")&& user.getPassword().equals("test123")){
			
			//add user object to Session object-used to hold on to values throughout life of session only
			session.setAttribute("user", user);
			
			
			//add user object to Request object-used to hold on to values throughout life of request only
			//	request.setAttribute("user", user);
			
			
			//go to welcome page		
			
			RequestDispatcher view=getServletContext().getRequestDispatcher("/welcome.jsp");
			view.forward(request, response);
		}
		else{
			//display message.
			request.setAttribute("msg", "Username and/or password incorrect.");
			RequestDispatcher view=getServletContext().getRequestDispatcher("/login.jsp");
			view.forward(request, response);
		}
		
	}

}
