package br.edu.ifsp.dsw1.controller.command;

import java.io.IOException;

import br.edu.ifsp.dsw1.model.entity.FlightData;
import br.edu.ifsp.dsw1.model.entity.FlightDataCollection;
import br.edu.ifsp.dsw1.model.flightstates.Arriving;
import br.edu.ifsp.dsw1.model.flightstates.State;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewFlightCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FlightDataCollection collection = (FlightDataCollection) request.getAttribute("collection");
		if (collection != null) {
		
			String number = request.getParameter("flight_number");
			String name = request.getParameter("company_name");
			String time = request.getParameter("arrival_time");
			
			State state = Arriving.getIntance();
			FlightData flight = new FlightData(Long.parseLong(number), name, time);
			flight.setState(state);
			
			collection.insertFlight(flight);
		}
		return "Commander?action=logged";
	}

}
