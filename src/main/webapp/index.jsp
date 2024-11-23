<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Portal</title>
  <style>
     <%@ include file="css/welcome.css"%>
  </style>
<body>
  <div class="welcome-container">
    <div class="left-column">
      <h1>Portal - Aeroporto DSW1</h1>
      <p>Através do horizonte.</p>
      <form action="Commander?action=logged" method="POST">
     	<input type="submit" class="login-button" value="Entrar">
      </form>
    </div>
    <div class="right-column">
      <img src="<%= request.getContextPath() %>/images/welcomepage.webp" alt="Airport Welcome" class="welcome-image">
    </div>
  </div>
</body>
</html>