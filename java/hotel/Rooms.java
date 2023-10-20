package hotel;

public class Rooms {

	private int roomID;
	private String roomType;
	private String status;
	
	public Rooms(int roomID, String roomType, String status) {
		
		this.roomID = roomID;
		this.roomType = roomType;
		this.status = status;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Rooms(int roomID) {
		
		this.roomID = roomID;
	}
	
	
	
}
