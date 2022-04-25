<%@ page language="java" contentType="text/html; charset=Cp1251"
    pageEncoding="Cp1251" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Cp1251">

<title>Проверка</title>
</head>
<body>
<div class="first">
        <div class="menu">
        <ul>
           <li><a href="Registration.jsp">Регистрация</a></li>     
             <li><a href="index.jsp">Главное меню</a></li>
        <li><a href="Login.jsp">Логин</a></li>
      
        </ul>
    </div>
<form action="LoginServlet" method="POST">
Введите ваш логин  <input type="text" name="Login"><br>
Введите пароль  <input type="password" name="Password"><br>
<button type="submit"> Отправить</button>	
</form>
</div>
</body>
</html>