package br.edu.ifsp.dsw1.controller.command;

import java.io.IOException;
import br.edu.ifsp.dsw1.model.entity.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStatusCommand implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FlightDataCollection datasource = (FlightDataCollection) request.getAttribute("collection");
		
		datasource.updateFlight(Long.parseLong(request.getParameter("number")));
		return "Commander?action=list";
	}

}
