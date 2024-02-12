package p_1;

public class Car {
	
	private String plate;
	private Person owner;
	
	
	public Car(String plate, Person owner) {
		this.plate = plate;
		this.owner = owner;
		owner.setCar(this);
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public Person getOwner() {
		return owner;
	}


	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public String introduceSelf() {
		String intro = "";
		intro = "i am a car. plate number is: " + this.plate + ". " 
				+ intro;
		
		if(this.owner == null) {
			intro = intro + "i don't have an owner.";
		} else {
			intro = intro + "my owner is: " + this.owner.getName() + ".";
		}
		
		return intro;
	}

}
