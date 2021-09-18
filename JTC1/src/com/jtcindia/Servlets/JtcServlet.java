package com.jtcindia.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JtcServlet extends HttpServlet {

	String phone;
	String email;
	String state;
	String country;

	public void init(ServletConfig sc) {
		System.out.println("TestServlet -init()");

		// 1. config parameters

		phone = sc.getInitParameter("phone");
		email = sc.getInitParameter("email");

		// 2. context parameter

		ServletContext ctx = sc.getServletContext();
		state = ctx.getInitParameter("state");
		country = ctx.getInitParameter("country");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("TestServlet-service()");

		// 3. Request Parameters
		String un = req.getParameter("uname");

		// 4. Display Parameters

		PrintWriter out = res.getWriter();
		out.println("<h1>Username:" + un + "</h1>");
		out.println("<h1>Phone:" + phone + "</h1>");
		out.println("<h1>Email:" + email + "</h1>");
		out.println("<h1>State:" + state + "</h1>");
		out.println("<h1>Country:" + country + "</h1>");
	}

	public void destroy() {
		System.out.println("TestServlet-destroy()");
	}

}
