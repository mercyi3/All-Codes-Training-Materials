package com.sumapp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.*;

public class AddNumbers extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws IOException
	{
		int a = Integer.parseInt(req.getParameter("number1"));
		int b = Integer.parseInt(req.getParameter("number2"));
		
		int sum = a+b;
		System.out.println("Sum ="+ sum);
		
		PrintWriter out = res.getWriter();
		out.println("The result is: "+ sum);	
	}
}
