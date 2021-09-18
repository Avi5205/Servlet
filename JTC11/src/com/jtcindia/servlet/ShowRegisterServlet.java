package com.jtcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ShowRegisterServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("service()... of ShowRegisterServlet started***");
		RequestDispatcher rd1 = req.getRequestDispatcher("header.html");
		rd1.forward(req, res);
		RequestDispatcher rd2 = req.getRequestDispatcher("menu.html");
		rd2.forward(req, res);
		RequestDispatcher rd3 = req.getRequestDispatcher("home.html");
		rd3.forward(req, res);
		RequestDispatcher rd4 = req.getRequestDispatcher("footer.html");
		rd4.forward(req, res);
		System.out.println("service() of ShowRegisterServlet Completed...");
	}
}
