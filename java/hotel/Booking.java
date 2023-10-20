package hotel;

public class Booking {
	String roomType, arrival, departure;
	int bookingID, roomNumber, nights,adults,childern;
	double nic;
	
	public Booking(int bookingID,String roomType, String arrival, String departure, int roomNumber, int nights, int adults,
			int childern,double nic) {
		super();
		this.bookingID=bookingID;
		this.roomType = roomType;
		this.arrival = arrival;
		this.departure = departure;
		this.roomNumber = roomNumber;
		this.nights = nights;
		this.adults = adults;
		this.childern = childern;
		this.nic=nic;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getNights() {
		return nights;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildern() {
		return childern;
	}

	public void setChildern(int childern) {
		this.childern = childern;
	}

	public double getNic() {
		return nic;
	}

	public void setNic(double nic) {
		this.nic = nic;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Booking(String roomType, String arrival, String departure, int roomNumber, int nights,int nic) {
		super();
		this.roomType = roomType;
		this.arrival = arrival;
		this.departure = departure;
		this.roomNumber = roomNumber;
		this.nights = nights;
		this.nic = nic;
	}
	
	

}
