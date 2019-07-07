package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.service.LoginService;

public class LoginController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginService loginService;
	private HttpSession session;
	
	@Override
	public void init() throws ServletException {
		loginService = new LoginService();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request,response);
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String page = request.getParameter("page");
		String action = request.getParameter("action");
		String nextPage = "/login.jsp";
		if(page != null) 
		{
			if(page.equalsIgnoreCase("login")) 
			{
				if(action.equalsIgnoreCase("login")) {
					String userName = request.getParameter("username");
					String password = request.getParameter("password");
					Boolean isValidUser = loginService.authenticate(userName, password);
					if(isValidUser) 
					{
						
						nextPage = "/items.jsp";
					}
				
				
			}}
			else if(page.equalsIgnoreCase("items")) 
			{
				
			}
			
		
		
		
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);

	

	
	
	
	
	}}
