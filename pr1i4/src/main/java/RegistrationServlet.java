

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionBD.sqliteConnection;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
	
		
		request.setCharacterEncoding("windows-1251");           
        response.setCharacterEncoding("windows-1251");
		
		String login = request.getParameter("LoginSite");     
        String password = request.getParameter("PasswordSite");
        String City = request.getParameter("CitySite");     
        String Street = request.getParameter("StreetSite");
        String Home = request.getParameter("HomeSite");     
        String Phone = request.getParameter("PhoneSite");
        String Name = request.getParameter("NameSite");     
        String Surname = request.getParameter("SurnameSite");
        String Lastname = request.getParameter("LastnameSite");     
        String Age = request.getParameter("AgeSite");
		
		
        try { 
        	
        	sqliteConnection connect=new sqliteConnection();  				
    		
        	String query = "INSERT INTO KlientInfo (loginKlient, passwordKlient,cityKlient,streetKlient,homeKlient,phoneKlient,nameKlient,surrnameKlient,lastnameKlient,ageKlient) VALUES (?,?,?,?,?,?,?,?,?,?);";
        	PreparedStatement statement =connect.dbConnector().prepareStatement(query);
        	statement.setString(1, login);
			statement.setString(2, password);		
			statement.setString(3, City);
			statement.setString(4, Street);	
			statement.setString(5, Home);
			statement.setString(6, Phone);	
			statement.setString(7, Name);
			statement.setString(8, Surname);	
			statement.setString(9, Lastname);
			statement.setString(10, Age);	
			statement.executeUpdate();       			
    			//statement.close();
				 pw.println("Dobro Pozalovat ");
				 pw.println(request.getParameter("LoginSite"));
    		
    	
        	}
        catch (SQLException throwables) 
        {
        	pw.println("Informaciy ne sohranena!");
        	throwables.printStackTrace();
        	
        }
       
       
	}

}
