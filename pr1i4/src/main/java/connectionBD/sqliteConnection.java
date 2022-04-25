package connectionBD;

import java.sql.*;

public class sqliteConnection {	
	Connection conn = null;
	String url = "jdbc:sqlite:D:/Eclips/pr1i4/src/main/DataBASE/BaseInet.db";
	
	public Connection dbConnector() throws SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			return conn;
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
			return null;
		}
	}
}
