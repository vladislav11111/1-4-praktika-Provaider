

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connectionBD.sqliteConnection;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("Cp1251");
		request.setCharacterEncoding("Cp1251");
		response.setCharacterEncoding("Cp1251");
		
		String login = request.getParameter("Login");
        String password = request.getParameter("Password");
        
        
        sqliteConnection connect =new sqliteConnection();  
        String query = "SELECT * FROM KlientInfo WHERE loginKlient = ?";
        PreparedStatement statement;
		ResultSet rs = null;
		try {
			
			statement = connect.dbConnector().prepareStatement(query);
			statement.setString(1, login);			
			rs = statement.executeQuery();
			//System.out.println(rs.isClosed());
			if(!rs.isClosed()) {
			while (rs.next()) {				
				
				String paswords = rs.getString("passwordKlient");
				String name = rs.getString("nameKlient");
				String city = rs.getString("cityKlient");
				
				if(paswords.equals(password) ) 
				{
					SetCookie(response, name,city);
					SetSession(request, login, password);
					GetCookie(request, response);
				}
				else 
				{
					pw.println("oshibka paroli");
				}
			}	
	}	
			else {pw.println("oshibka logina");}
	} 
		catch (SQLException e) 
		{
			System.out.println("oshibka!");
			e.printStackTrace();
		}		
	
	}

	private void SetCookie(HttpServletResponse response, String name, String city) {
		Cookie cookieName = new Cookie("name_Klient", name); 
		Cookie cookieCity = new Cookie("city_Klient", city);	
		
		cookieName.setMaxAge(60);
		cookieCity.setMaxAge(60);	
		
		response.addCookie(cookieName);
		response.addCookie(cookieCity);
		
		
	}

	private void GetCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("Cp1251");           
        response.setCharacterEncoding("Cp1251"); 
		
		PrintWriter pw = response.getWriter();
		Cookie [] cookies = request.getCookies();
		
		pw.println("<h1>");
		pw.println("cookies, ");
		for (Cookie cookie : cookies) {			
				pw.println(cookie.getValue()+ " " + cookie.getName() + "<br>") ;					
		}
		pw.println("</h1>");
		
	}

	private void SetSession(HttpServletRequest request, String login, String password) {
		HttpSession session = request.getSession();
		session.setAttribute("loginKlient", login);
		session.setAttribute("passwordKlient", password);
		
	}
        
}
