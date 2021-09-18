package com.jtcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCart extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession httpSession = request.getSession(false);
		if (httpSession == null) {
			request.setAttribute("MSG", "Session is destroyed");
		} else {
			String bnm = request.getParameter("bname");
			httpSession.removeAttribute(bnm);
		}
		RequestDispatcher rd = request.getRequestDispatcher("showcart.jsp");
		rd.forward(request, response);
	}

}
