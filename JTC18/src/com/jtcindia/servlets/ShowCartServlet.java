package com.jtcindia.servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowCartServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession httpSession = req.getSession(false);
		if (httpSession == null) {
			req.setAttribute("MSG", "Session is destroyed");
			RequestDispatcher rd = req.getRequestDispatcher("showbooks.jsp");
			rd.forward(req, res);
		} else {
			Enumeration<String> enms = httpSession.getAttributeNames();
			List<String> selectlist = Collections.list(enms);
			selectlist.remove("BOOKS");
			if (selectlist.size() == 0) {
				req.setAttribute("MSG", "No Books Selected");
			} else {
				req.setAttribute("CART", selectlist);
			}
			RequestDispatcher rd = req.getRequestDispatcher("ShowCart.jsp");
			rd.forward(req, res);
		}
	}
}