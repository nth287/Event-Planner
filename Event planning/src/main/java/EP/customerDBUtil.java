package EP;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class customerDBUtil {
	
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	public static List<customer> validate(String userName, String password){
		
		ArrayList<customer> cus=new ArrayList<>();
	
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select*from customer where username='"+userName+"' and password='"+password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String userU=rs.getString(5);
				String passU=rs.getString(6);
				
				customer c=new customer(id,name,email,phone,userU,passU);
				cus.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	public static boolean insertcustomer(String name,String email,String phone,String username,String password) {
		
		boolean isSuccess=false;
		
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
		    String sql="insert into customer values(0,'"+name+"','"+email+"','"+phone+"','"+username+"', '"+password+"' )";
		    int rs=stmt.executeUpdate(sql);
		    
		    if(rs>0) {
		    	isSuccess=true;
		    }else {
		    	isSuccess=false;
		    }
		    		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;

	}
	
	
}

