package com.jtcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet(name = "testServlet", urlPatterns = "/test.jtc")
public class TestServlet extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("LoginServlet-init()");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// verifying the html action
		String uri = req.getRequestURI();
		Writer out = res.getWriter();
		res.setContentType("text/html");
		out.write("<h1>Request processed with action:" + uri);
	}

	public void destroy() {
		System.out.println("LoginServletdestroy()");
	}
}
