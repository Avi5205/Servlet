package com.jtcindia.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("service of Test");
		String unm = req.getParameter("uname");
		String pw = req.getParameter("password");

		Writer out = res.getWriter();
		out.write("<h1>Hi, Welcome to JTC</h1>");
		String page = "";
		boolean check = true;
		if (unm == null || unm.trim().isEmpty()) {
			page = "required.html";
			check = false;
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		} else if (pw == null || pw.trim().isEmpty()) {
			page = "required.html";
			check = false;
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		if (check) {
			if (unm.equals(pw)) {
				page = "home.html";
				RequestDispatcher rd = req.getRequestDispatcher(page);
				rd.forward(req, res);
			} else {
				page = "home.html";
				RequestDispatcher rd = req.getRequestDispatcher(page);
				rd.forward(req, res);
			}
		}
		out.write("<h1>Again,Welcome to JTC</h1>");
		System.out.println("**Service Completed-LAST Statement");
	}

}
