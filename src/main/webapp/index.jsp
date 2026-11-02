<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Aplikasi Login Hibernate - Kelompok 8</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; background-color: #f4f7f6; }
        .login-container { background: white; padding: 30px; border-radius: 8px; box-shadow: 0px 4px 10px rgba(0,0,0,0.1); display: inline-block; }
        input[type="text"], input[type="password"] { width: 100%; padding: 10px; margin: 8px 0; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }
        button { background-color: #007bff; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer; width: 100%; font-size: 16px; }
        button:hover { background-color: #0056b3; }
        .error { color: red; font-weight: bold; margin-bottom: 15px; }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login Hibernate MVC - Kelompok 8</h2>
        
        <% if(request.getParameter("error") != null) { %>
            <div class="error">Username atau Password salah!</div>
        <% } %>

        <form action="login" method="post">
            <div style="text-align: left;">
                <label>Username:</label>
                <input type="text" name="username" placeholder="Masukkan username..." required>
            </div>
            
            <div style="text-align: left; margin-top: 10px;">
                <label>Password:</label>
                <input type="password" name="password" placeholder="Masukkan password..." required>
            </div>
            
            <div style="margin-top: 20px;">
                <button type="submit">Login</button>
            </div>
        </form>
    </div>
</body>
</html>

