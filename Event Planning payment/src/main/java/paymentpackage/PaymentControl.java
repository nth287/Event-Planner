package paymentpackage;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaymentControl {
	
	private static boolean isSuccess;
	private static Connection con =null; 
	private static Statement stmt =null;
	private static ResultSet rs =null;
	
	//Insert Data
	public static boolean insertdata(String eventid,String eventname,String eventdate,String amount,String status) {
		
		boolean isSuccess=false;
		
		try {
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			
			String sql="insert into payment values(0,'"+eventid+"','"+eventname+"','"+eventdate+"','"+amount+"','"+status+"')";
			int rs=stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//Display Data
	//Get By Id
	
	public static List<PaymentModel> getById(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		
		ArrayList <PaymentModel> payment = new ArrayList<>();
		
	try {
		con=DBConnection.getConnection();
		stmt=con.createStatement();
		
		String sql="select * from payment where paymentid '"+convertedID+"'";
		
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int paymentid = rs.getInt(1);
			String eventid = rs.getString(2);
			String eventname = rs.getString(3);
			String eventdate = rs.getString(4);
			String amount = rs.getString(5);
			String status = rs.getString(6);
			
			
			PaymentModel r = new PaymentModel(paymentid,eventid,eventname,eventdate,amount,status);
			payment.add(r);
		}
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return payment;
	}
	
	//GetaLL
	public static List<PaymentModel> getAllPayment(){
		
		ArrayList <PaymentModel> payments = new ArrayList<>();
			
	try {
		con=DBConnection.getConnection();
		stmt=con.createStatement();
		
		String sql="select * from payment";
		
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int paymentid = rs.getInt(1);
			String eventid = rs.getString(2);
			String eventname = rs.getString(3);
			String eventdate = rs.getString(4);
			String amount = rs.getString(5);
			String status = rs.getString(6);
			
			
			PaymentModel r = new PaymentModel(paymentid,eventid,eventname,eventdate,amount,status);
			payments.add(r);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return payments;
		
	}
	
	//Update Data
	public static boolean updatedata(String paymentid,String eventid,String eventname,String eventdate,String amount,String status) {
		try {
			//DB
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			
			//SQL
			String sql = "update payment set eventid='"+eventid+"',eventname='"+eventname+"',eventdate='"+eventdate+"',amount='"+amount+"',status='"+status+"'"
			+"where paymentid='"+paymentid+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}	
			
		}
		catch(Exception e){
			e.printStackTrace();	
		}
		return isSuccess;
	}
	


//Delete Data

public static boolean deletedata(String id) {
	int convID = Integer.parseInt(id);
	try {
		//DB
		con=DBConnection.getConnection();
		stmt=con.createStatement();
		String sql = "delete from payment where paymentid='"+convID+"'";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs>0) {
			isSuccess=true;
		}
		else {
			isSuccess=false;
		}
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return isSuccess;
}


}
