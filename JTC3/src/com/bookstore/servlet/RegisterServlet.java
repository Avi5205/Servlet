package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("RegisterServlet-init()");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("RegisterServlet-service()");
		String fn = req.getParameter("fname");
		String ln = req.getParameter("lname");
		String ph = req.getParameter("phone");
		String em = req.getParameter("email");

		System.out.println(fn);
		System.out.println(ln);
		System.out.println(ph);
		System.out.println(em);

		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>JTC BookStore</h1>");
		out.println("<h2>Hi " + fn + " " + ln + ", your login has been completed successfully</h2>");
		out.println("</body>");
		out.println("</html>");
	}

	public void destroy() {
		System.out.println("RegisterServlet-destroy()");
	}
}
