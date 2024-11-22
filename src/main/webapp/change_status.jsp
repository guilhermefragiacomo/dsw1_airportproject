<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Gerenciamento de Voos</title>
  <link rel="stylesheet" href="css/change_status.css">
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
        <tr>
          <td>FL123</td>
          <td>Airline A</td>
          <td>14:30</td>
          <td id="status-fl123">Chegando
          <button onclick="updateStatus('FL123')">Atualizar</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</body>
</html>
