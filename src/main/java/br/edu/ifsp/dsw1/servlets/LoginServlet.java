package br.edu.ifsp.dsw1.servlets;

import jakarta.servlet.ServletException;
import br.edu.ifsp.dsw1.model.entity.User;
import br.edu.ifsp.dsw1.model.entity.FlightDataCollection;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		FlightDataCollection db = new FlightDataCollection();
		
		request.setAttribute("lista", dados.getAll());*/

		User usr = null;
		HttpSession session = request.getSession(false);
		
		if (request.getParameter("logout") == "") {
			session.setAttribute("object_user", null);
		} else {
			if (session == null || session.getAttribute("object_user") == null) {
				usr = new User();
				usr.setUsername(request.getParameter("username"));
				usr.setPassword(request.getParameter("password"));
				session = request.getSession();
				session.setAttribute("object_user", usr);
				session.setMaxInactiveInterval(5 * 60);
			}
		}
		
		response.sendRedirect("index.jsp");
	}
}
