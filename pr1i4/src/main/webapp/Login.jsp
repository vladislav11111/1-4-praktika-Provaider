<%@ page language="java" contentType="text/html; charset=Cp1251"
    pageEncoding="Cp1251" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Cp1251">

<title>��������</title>
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
<form action="LoginServlet" method="POST">
������� ��� �����  <input type="text" name="Login"><br>
������� ������  <input type="password" name="Password"><br>
<button type="submit"> ���������</button>	
</form>
</div>
</body>
</html>