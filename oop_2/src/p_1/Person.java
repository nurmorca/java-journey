package p_1;

public class Person {
	private String name;
	private Car car;
	
	
	public Person(String name)
	{
		this.name = name;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public String getName() {
		return name;
	}
	
	public String introduceSelf() {
		String intro = "";
		intro = "name is " + this.name + "." 
				+ intro;
		
		// don't need to use getCar() or something because 
		// a Car variable already exists in Person class.
		
		if(this.car == null) {
			intro = intro + " i don't have a car";
		} else {
			intro = intro + " my car plate is: " + this.car.getPlate() + ".";
		}
		
		return intro;
	}

}
