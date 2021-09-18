package com.jtcindia.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet",urlPatterns= {"/hello.jtc"},initParams= {@WebInitParam(name="email",value="helloavi@jtc.com")})
public class HelloServlet {
	ServletConfig cfg = null;

	public void init(ServletConfig config) throws ServletException {
		this.cfg = cfg;
		System.out.println("init() method of HelloServlet");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service() method of HelloServlet");
		String fname = req.getParameter("fname");
		String phone = req.getParameter("phone");
		Writer out = res.getWriter();
		res.setContentType("text/html");
		out.write("<h1>Response from HelloServlet</h1>");
		out.write("<hr/>Request Parameters");
		out.write("<br/>Fname: " + fname);
		out.write("<br/>Phone: " + phone);
		out.write("<hr/>Servlet Config Parameters");
		String eml = cfg.getInitParameter("email");
		out.write("<br/>" + cfg);
		out.write("<br/>Email:" + eml);
		out.write("<hr/>Servlet Context Parameters");
		ServletContext ctx = cfg.getServletContext();
		String web = ctx.getInitParameter("website");
		out.write("<br/>" + ctx);
		out.write("<br/>Web:" + web);
	}

}
