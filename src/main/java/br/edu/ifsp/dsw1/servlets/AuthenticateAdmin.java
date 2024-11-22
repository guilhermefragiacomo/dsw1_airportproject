package br.edu.ifsp.dsw1.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import br.edu.ifsp.dsw1.model.entity.FlightDataCollection;
import br.edu.ifsp.dsw1.model.entity.User;

public class AuthenticateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthenticateAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User usr = null;
		HttpSession session2 = request.getSession(false);
		if (session2 == null || session2.getAttribute("object_user") == null) {
			response.sendRedirect("index.jsp");
		} else {
			usr = (User) session2.getAttribute("object_user");
			if (usr.getUsername().equals("admin")) {
				if (usr.getPassword().equals("admin")) { 
					if (request.getParameter("option") == "") {
						response.sendRedirect("add_new_flight.jsp");
					} else {
						response.sendRedirect("change_status.jsp");
					}
				}
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

}
