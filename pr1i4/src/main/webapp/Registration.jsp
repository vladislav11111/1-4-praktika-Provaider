<%@ page language="java" contentType="text/html; charset=Cp1251"
    pageEncoding="Cp1251" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Cp1251">
<style>

</style>

<title>�����������</title>
</head>
<body>
<div class="first">
        <div class="menu">
        <ul>
           <li><a href="Registration.jsp">�����������</a></li>     
           <li><a href="index.jsp">������� ����</a></li>
        <li><a href="Login.jsp">�����</a></li>
          
        </ul>
    </div>
<form action="RegistrationServlet" method="POST">
	������� ��� �����  <input type="text" name="LoginSite"><br>
	������� ��� ������  <input type="password" name="PasswordSite"><br>
	������� ���e �����  <input type="text" name="CitySite"><br>
	������� ���� ����� <input type="text" name="StreetSite"><br>	
	������� ��� ����� ��������  <input type="text" name="HomeSite"><br>
	������� ��� ����� ��������  <input type="number" name="PhoneSite"><br>
	������� ���� ���  <input type="text" name="NameSite"><br>
	������� ���� �������  <input type="text" name="SurnameSite"><br>
	������� ���� ��������  <input type="text" name="LastnameSite"><br>
	������� ��� �������  <input type="number" name="AgeSite"><br>
	<button type="submit"> ��������� �����������</button>	
</form>
</div>
</body>
</html>