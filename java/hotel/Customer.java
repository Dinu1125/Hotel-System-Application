package hotel;

import java.math.BigInteger;

public class Customer {
	
	private int cusID;
	private double nic;
	private String fname;
	private String lname;
	private String address;
	private int phone;
	private String email;
	
	public Customer(int cusID, double nic, String fname, String lname, String address, int phone,String email) {
		
		this.cusID = cusID;
		this.nic = nic;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Customer( String fname, String lname, String address, int phone) {
		super();
	
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public double getNic() {
		return nic;
	}

	public void setNic(double nic) {
		this.nic = nic;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

	

	
	
	

}
