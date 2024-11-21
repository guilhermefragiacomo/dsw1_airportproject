package br.edu.ifsp.dsw1.servlets;

import jakarta.servlet.ServletException;
import br.edu.ifsp.dsw1.model.entity.User;
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
		User usr = new User();
		usr.setUsername(request.getParameter("username"));
		usr.setPassword(request.getParameter("password"));
		
		HttpSession session = request.getSession(false);
		session.setAttribute("object_user", usr);
		
		
		doGet(request, response);
	}
}
