package br.edu.ifsp.dsw1.controller.command;

import br.edu.ifsp.dsw1.model.entity.FlightDataCollection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Commander
 */
public class Commander extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final FlightDataCollection datasource = new FlightDataCollection();
       

    public Commander() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");
		 Command command;
		 	
		 request.setAttribute("collection", datasource);
		 
		 if ("login".equals(action)) {
			 command = new LoginCommand();
		 } else if ("logged".equals(action)) {
			 command = new LoggedCommand();
		 } else if ("logout".equals(action)) {
			 command = new LogoutCommand();
		 }else if ("insert".equals(action)) {
			 command = new NewFlightCommand();
		 } else if ("toInsert".equals(action)) {
			 command = new ToInsertCommand();
		 } else if ("list".equals(action)) {
			 command = new ListFlightsCommand();
		 } else if ("update".equals(action)) {
			 command = new UpdateStatusCommand();
		 } else {
			 command = new LoggedCommand();
		 }
		 
		 String view = command.execute(request, response);
		 var dispatcher = request.getRequestDispatcher(view);
		 dispatcher.forward(request, response);
	}

}
