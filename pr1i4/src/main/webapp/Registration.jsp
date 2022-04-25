<%@ page language="java" contentType="text/html; charset=Cp1251"
    pageEncoding="Cp1251" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Cp1251">
<style>

</style>

<title>Регистрация</title>
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
<form action="RegistrationServlet" method="POST">
	Введите ваш логин  <input type="text" name="LoginSite"><br>
	Введите ваш пароль  <input type="password" name="PasswordSite"><br>
	Введите вашe город  <input type="text" name="CitySite"><br>
	Введите вашу улицу <input type="text" name="StreetSite"><br>	
	Введите ваш номер квартиры  <input type="text" name="HomeSite"><br>
	Введите ваш номер телефона  <input type="number" name="PhoneSite"><br>
	Введите ваше имя  <input type="text" name="NameSite"><br>
	Введите вашу фамилию  <input type="text" name="SurnameSite"><br>
	Введите ваше отчество  <input type="text" name="LastnameSite"><br>
	Введите ваш возраст  <input type="number" name="AgeSite"><br>
	<button type="submit"> Завершить регистрацию</button>	
</form>
</div>
</body>
</html>