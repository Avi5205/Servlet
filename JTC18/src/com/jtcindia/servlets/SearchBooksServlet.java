package com.jtcindia.servlets;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBooksServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cat = req.getParameter("category");
		if (cat != null && cat.equals("java")) {
			ArrayList<String> blist = new ArrayList<String>();
			blist.add("java");
			blist.add("Servlets");
			blist.add("EJB");
			blist.add("JDBC");
			blist.add("JSP");
			blist.add("RMI");
			HttpSession sess = req.getSession();
			sess.setAttribute("BOOKS", blist);
		} else {
			req.setAttribute("MSG", "No books found with category " + cat);
		}
		RequestDispatcher rd = req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
	}

}
