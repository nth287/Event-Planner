package EP;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url="jdbc:mysql://localhost:3306/login";
	private static String userName="root";
	private static String pass="12345";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, userName, pass);
		}
		catch(Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}

}
