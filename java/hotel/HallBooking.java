package hotel;

public class HallBooking {

		
		String hallType;
		int guest;
		String date;
		String time;
		int hours;
		
		public HallBooking( String hallType, int guest, String date, String time, int hours) {
		
		
			this.hallType = hallType;
			this.guest = guest;
			this.date = date;
			this.time = time;
			this.hours = hours;
		}

		

		public String getHallType() {
			return hallType;
		}

		public void setHallType(String hallType) {
			this.hallType = hallType;
		}

		public int getGuest() {
			return guest;
		}

		public void setGuest(int guest) {
			this.guest = guest;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}
		
		
		
}
