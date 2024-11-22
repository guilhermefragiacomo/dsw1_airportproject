<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Adicionar novo Voo</title>
  <link rel="stylesheet" href="css/add_new_flight.css">
</head>
<body>
  <div class="form-container">
    <h1>Adicionar novo Voo</h1>
    <form action="/submit-flight" method="POST">
      <div class="form-group">
        <label for="flight-number">Numero do Voo</label>
        <input type="text" id="flight-number" name="flight_number" required placeholder="Enter flight number">
      </div>
      <div class="form-group">
        <label for="company-name">Nome da Companhia</label>
        <input type="text" id="company-name" name="company_name" required placeholder="Enter company name">
      </div>
      <div class="form-group">
        <label for="arrival-time">Hora de Chegada</label>
        <input type="time" id="arrival-time" name="arrival_time" required>
      </div>
      <button type="submit" class="submit-button">Adicionar Voo</button>
    </form>
  </div>
</body>
</html>
