package br.edu.ifsp.dsw1.controller.command;

import java.io.IOException;

import br.edu.ifsp.dsw1.model.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User usr = null;
		HttpSession session = request.getSession(false);
		
		if (session == null || session.getAttribute("object_user") == null) {
			usr = new User();
			usr.setUsername(request.getParameter("username"));
			usr.setPassword(request.getParameter("password"));
			session = request.getSession();
			session.setAttribute("object_user", usr);
			session.setMaxInactiveInterval(5 * 60);
		}
		
		return "Commander?action=logged";
	}

}
