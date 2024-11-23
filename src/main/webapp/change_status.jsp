<%@page import="br.edu.ifsp.dsw1.model.entity.*"%>
<%@page import="br.edu.ifsp.dsw1.model.flightstates.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Gerenciamento de Voos</title>
  <style>
     <%@ include file="css/change_status.css"%>
  </style>
</head>
<body>
  <div class="admin-container">
    <h1>Gerenciamento de Voos</h1>
    <table class="flights-table">
      <thead>
        <tr>
          <th>Numero do Voo</th>
          <th>Nome da Companhia</th>
          <th>Hora de Chegada</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
      	<%
      		FlightDataCollection collection = (FlightDataCollection) request.getAttribute("collection");
      		if (collection != null) {
      			for (FlightData f : collection.getAllFligthts()) {
      				%>
      				<tr>
			          <td><%= f.getFlightNumber()%></td>
			          <td><%= f.getCompany()%></td>
			          <td><%= f.getTime()%></td>
			          <td><%= f.getState().getClass().getSimpleName()%>
			          <form action="Commander?action=update&number=<%= f.getFlightNumber()%>" method="POST">
			          	<input type="submit" value="Atualizar">
			          </form>
			          </td>
			        </tr>
      			<%}
      		}
      	%>
      </tbody>
    </table>
  </div>
</body>
</html>
