package p_1;

public class Customer {
	
	private String name;
	private int identityID;
	private Rezervation rezervations[] = new Rezervation[10];
	
	public Customer(String name, int identityID) {
		this.name = name;
		this.identityID = identityID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdentityID() {
		return identityID;
	}

	public void setIdentityID(int identityID) {
		this.identityID = identityID;
	}

	public Rezervation[] getRezervations() {
		return rezervations;
	}

	public void setRezervations(Rezervation[] rezervations) {
		this.rezervations = rezervations;
	}
	
    public void makeRezervation(Hotel hotel, String roomType, int day) {
	  Room temp[] = hotel.getRooms();
	  int i = 0;
	  
	  while(i < 4) {
		  if(temp[i].getRoomType().equals(roomType) && temp[i].isAvailable()) {
             rezervations[Rezervation.counter] = new Rezervation(hotel, temp[i].getRoomNumber(), day);
             return;
		  }
		  i++;
	  }
	  
	  System.out.println("There is no available room for selected type.");
	  	
	}
    
    public void listCustomerRezervations() {
    	for(int i = 0; i < Rezervation.counter; i++){
    		System.out.println("Rezervation ID: " + this.rezervations[i].getRezervationID() +
    	    " Hotel: " + this.rezervations[i].getHotel().getHotelName() +
    	    " Room number: " + this.rezervations[i].getRoomNumber() +
    	    " Day: " + this.rezervations[i].getDay());
    	}
    }
    
    public void getInvoice(int rezervationID) {
    	int i = 0;
    	while(i < Rezervation.counter) {
    		 if(this.rezervations[i].getRezervationID() == rezervationID) {
    			 System.out.println("The invoice is: ");
    			 System.out.print(this.rezervations[i].calculatePayment());
    		 }
    		 i++;
    	}
    }
	
	
	
	

}
