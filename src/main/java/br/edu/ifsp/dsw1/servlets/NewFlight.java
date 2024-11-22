package br.edu.ifsp.dsw1.servlets;

import br.edu.ifsp.dsw1.model.entity.FlightDataCollection;
import br.edu.ifsp.dsw1.model.entity.FlightData;
import br.edu.ifsp.dsw1.model.flightstates.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewFlight() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FlightDataCollection collection = (FlightDataCollection) request.getAttribute("collection");
		if (collection != null) {
		
			String number = request.getParameter("flight_number");
			String name = request.getParameter("company_name");
			String time = request.getParameter("arrival_time");
			
			State state = Arriving.getIntance();
			FlightData flight = new FlightData(Long.parseLong(number), name, time);
			
			collection.insertFlight(flight);
			request.setAttribute("collection", collection);
		}
		response.sendRedirect("index.jsp");
	}

}
