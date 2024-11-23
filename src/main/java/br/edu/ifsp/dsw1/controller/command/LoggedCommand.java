package br.edu.ifsp.dsw1.controller.command;

import java.io.IOException;

import br.edu.ifsp.dsw1.model.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoggedCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User usr = null;
		HttpSession session = request.getSession(false);
		
		if (session == null || session.getAttribute("object_user") == null) {
			return "login.jsp";
		} else {
			usr = (User) session.getAttribute("object_user");
			
			if (usr.getUsername().equals("admin")) {
				if (usr.getPassword().equals("admin")) {
					return "admin.jsp";
				}
			}
			return "home.jsp";
		}
	}

}