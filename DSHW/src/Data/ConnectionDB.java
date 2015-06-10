package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
	String DB = "test";
	String userDB = "root";
	String passDB = "petrozzi";
	String driver = "com.mysql.jdbc.Driver";
	String urlDB = "jdbc:mysql://localhost/"+DB;
	Connection conn = null;
	
	public ConnectionDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(urlDB, userDB, passDB);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
}
