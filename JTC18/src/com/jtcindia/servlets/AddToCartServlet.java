package com.jtcindia.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Accessing the existing session object
		HttpSession sess = req.getSession(false);
		// validating session is available or not
		if (sess == null) {
			req.setAttribute("MSG", "Session is destroyed");
		} else {
			String bnm = req.getParameter("bname");
			// Adding the client selected book to session
			sess.setAttribute(bnm, bnm);
			req.setAttribute("ADDED", bnm + "is added to cart");
		}
		RequestDispatcher rd = req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
	}
}
