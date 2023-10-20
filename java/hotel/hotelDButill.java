package hotel;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;



public class hotelDButill {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	//Staff Login
	
	public static boolean login(String userID,String password ) {
    	
		 int convId = Integer.parseInt(userID);
		 boolean isSuccess = false;
		 
		 try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from user where userID='"+convId+"' and password='"+password+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		if (rs.next()) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	
	//Customer Information Insert
	
	public static boolean insertcustomer(String nic,String fname,String lname,String address,String phone,String email ) {
    	
		 double convnic = Double.parseDouble(nic);
		 int convphone = Integer.parseInt(phone);
		 boolean isSuccess = false;
		 
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into customer values (0,'"+convnic+"','"+fname+"','"+lname+"','"+address+"','"+convphone+"','"+email+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} 
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	 
	//Available Rooms
	
	 public static int roomCount(String roomType) {
	    	
	    	
		 String a=null;
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    			
		    		String sql = "select count(status) as count from rooms where roomType='"+roomType+"' and status='available'";
		    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			 a = rs.getString("count");
	    			
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    		
	    		int conval = Integer.parseInt(a);

	    		return conval;
	    
	    }
	 
	 //Add Rooms
	 
	 public static boolean AddRooms(String roomID,String roomType) {
	    	
		 int convId = Integer.parseInt(roomID);
		 
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into rooms values ('"+convId+"','"+roomType+"','available')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	 
	 //Rooms Update View
	 
	 public static List<Rooms> RoomView(String RoomID) {
	    	
		 int convId = Integer.parseInt(RoomID);
	    	ArrayList<Rooms> rom = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from rooms where roomID='"+convId+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int roomID =rs.getInt("roomID");
	    			String roomType = rs.getString("roomType");
	    			String status = rs.getString("status");
	    			
	    			
	    			Rooms m = new Rooms(roomID,roomType,status);
	    			rom.add(m);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return rom;	
	    }
	 
	 //Rooms Update
	 
	 public static boolean updaterooms(String RoomID, String roomType,String status ) {
		    
		 int convId = Integer.parseInt(RoomID);
			
			try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "UPDATE rooms SET roomID ='"+convId+"', roomType='"+roomType+"', status='"+status+"' WHERE roomID='"+RoomID+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 //Room Validation
	 
	 public static boolean RoomValidation(String roomID) {
	    	
		 int convId = Integer.parseInt(roomID);
		 boolean isSuccess = false;
		 
		 try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select* from rooms where roomID='"+convId+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		if (rs.next()) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 //Customer Details
	 
	 public static List<Customer> CoustomerDetails(String nic) {
	    	
		 	double convnic = Double.parseDouble(nic);
	    	ArrayList<Customer> cus = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from customer where nic='"+convnic+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    		
	    			String fname = rs.getString("fname");
	    			String lname = rs.getString("lname");
	    			String address = rs.getString("address");
	    			int phone = rs.getInt("phone");
	    			
	    			Customer c = new Customer(fname,lname,address,phone);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return cus;	
	    }
	 
	 //Customer Validation
	 
	 public static boolean CustomerValidation(String nic) {
	    	
		 double convnic = Double.parseDouble(nic);
		 boolean isSuccess = false;
		 
		 try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select* from customer where nic='"+convnic+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		if (rs.next()) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 //Room Booking
	 
	 public static boolean Booking(String roomType,String roomNumber, String arrival, String departure,  String nights, String adults,String childern,String nic) {
	    	
		 int ConRoomNumber = Integer.parseInt(roomNumber);
		 double Connic = Double.parseDouble(nic);
		 int ConAdults = Integer.parseInt(adults);
		 int ConChild = Integer.parseInt(childern);
		 int ConNights = Integer.parseInt(nights);
		 boolean isSuccess = false;
		 
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into booking values (0,'"+roomType+"','"+arrival+"','"+departure+"','"+ConRoomNumber+"','"+ConNights+"','"+ConAdults+"','"+ConChild+"','"+Connic+"')";
	    		int rs = stmt.executeUpdate(sql); 
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} 
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	 
	 //Available rooms
	 
	 public static List<Rooms> AvlRooms(String roomType) {
	    	
		
	    	ArrayList<Rooms> rom = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select* from rooms where roomType='"+roomType+"' and status='available'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			
	    			int roomID = rs.getInt("roomID");
	    			
	    			
	    			
	    			Rooms m = new Rooms(roomID);
	    			rom.add(m);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return rom;	
	    }
	 
	 //Update Room Status
	 
	 public static boolean updateroomStatus(String RoomID ) {
		    
		 int convId = Integer.parseInt(RoomID);
			
			try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "UPDATE rooms SET status='unavailable' WHERE roomID='"+convId+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 //Hall Booking
	 
	 public static boolean HallBooking(String hallType, String guest, String date,  String time, String hours,String nic) {
	    	
		
		 double Connic = Double.parseDouble(nic);
		 int Conhours = Integer.parseInt(hours);
		
		 boolean isSuccess = false;
		 
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into hall_booking values (0,'"+hallType+"','"+guest+"','"+date+"','"+time+"','"+Conhours+"','"+Connic+"')";
	    		int rs = stmt.executeUpdate(sql); 
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} 
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	 
	 //Report
	 
	 public static List<Booking> Report(String month) {
	    	
		 	
	    	ArrayList<Booking> bk = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "SELECT * FROM booking where month(arrival)='"+month+"' ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    		
	    			int roomNumber = rs.getInt("roomNumber");
	    			String arrival = rs.getString("arrival");
	    			String departure = rs.getString("departure");
	    			int nic = rs.getInt("nic");
	    			int nights = rs.getInt("nights");
	    			String roomType = rs.getString("roomType");
	    			
	    			
	    			
	    			Booking b = new hotel.Booking(roomType,arrival,departure,roomNumber,nights,nic);
	    			bk.add(b);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return bk;	
	    }
}
