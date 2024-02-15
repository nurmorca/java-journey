package p_1;

import java.util.Arrays;

public class Hotel {
	
	private String hotelName;
	private String address;
	private String telephone;
	private Room rooms[] = new Room[4];
	
	public Hotel(String hotelName, String address, String telephone) {
		this.hotelName = hotelName;
		this.address = address;
		this.telephone = telephone;
	    rooms[0] = new Room(101, "standart", 100);
		rooms[1] = new Room(201, "family", 200);
		rooms[2] = new Room(301, "suit", 400);
		rooms[3] = new Room(302, "suit", 400);
		for(int i = 0; i < 4; i++) {
			this.rooms[i].setAvailable(true);
		}
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", address=" + address + ", telephone=" + telephone + ", rooms="
				+ Arrays.toString(rooms) + "]";
	}
	
	
	
	
	
	

}
