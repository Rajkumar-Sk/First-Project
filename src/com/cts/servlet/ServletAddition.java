package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletAddition")
public class ServletAddition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletAddition() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		int number1=Integer.parseInt(num1.trim());
		int number2=Integer.parseInt(num2.trim());
		int res=number1+number2;
		request.setAttribute("resultData", res);
		RequestDispatcher rd=request.getRequestDispatcher("/ServletAddition2");
		
		rd.forward(request, response);
	}
	
}
