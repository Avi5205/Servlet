package com.jtcindia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String page = req.getParameter("page");
		if (page == null || page.trim().length() == 0) {
			RequestDispatcher rd = null;
			rd = req.getRequestDispatcher("error.html");
			rd.forward(req, res);
			return;
		}
		if (page.startsWith("www")) {
			page = "http://" + page;
		}
		res.sendRedirect(page);
	}
}
