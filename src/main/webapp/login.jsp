<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
     <%@ include file="css/login.css"%>
  </style>
</head>
<body>
    <div class="login-container">
        <h1>Login</h1>
        <form action="Command?action=login" method="POST">
            <div class="form-group">
                <label for="username">Nome</label>
                <input type="text" id="username" name="username" placeholder="Nome de usuário" required>
            </div>
            <div class="form-group">
                <label for="password">Senha</label>
                <input type="password" id="password" name="password" placeholder="Senha do usuário" required>
            </div>
            <button type="submit" class="btn">Login</button>
        </form>
    </div>
</body>
</html>