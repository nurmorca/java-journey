package p_1;

public class Rezervation {
	
	public static int counter = 0;
	private int rezervationID;
	private Hotel hotel;
	private int roomNumber;
	private int day;
	
	public Rezervation(Hotel hotel, int roomNumber, int day) {
		this.hotel = hotel;
		this.roomNumber = roomNumber;
		this.day = day;
		this.rezervationID = counter + 20230001;
		counter++;
	}

	public int getRezervationID() {
		return rezervationID;
	}

	public void setRezervationID(int rezervationID) {
		this.rezervationID = rezervationID;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Rezervation [rezervationID=" + rezervationID + ", hotel=" + hotel + ", roomNumber=" + roomNumber
				+ ", day=" + day + "]";
	}
	
	public double calculatePayment() {
		Room temp[] = hotel.getRooms();
		int i = 0;
		while(i < 4) {
			if(temp[i].getRoomNumber() == this.roomNumber) {
				return temp[i].getPrice() * this.day;
			}
			i++;
		}
		return 0;
	}
	
	
	
	

}
