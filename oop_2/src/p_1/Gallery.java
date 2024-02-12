package p_1;

import java.util.*;

public class Gallery {
	
	private String galleryName;
	private ArrayList<Car> cars;
	private int carCounts;
	private Person galleryOwner;
	
	
	public Gallery(String galleryName, Person galleryOwner) {
		this.galleryName = galleryName;
		this.galleryOwner = galleryOwner;
		this.carCounts = 0;
		cars = new ArrayList<>();
	}


	public String getGalleryName() {
		return galleryName;
	}


	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}
	
	public boolean addCar (Car c) {
		if(cars.add(c) == true) {
			c.getOwner().setCar(null);
			c.setOwner(galleryOwner);
			this.carCounts++;
			return true;
		}
		return false;
	}
	
	public boolean searchCar(Car c) {
		return cars.contains(c);
	}
	
	public Car searchCar(String plate) {
		int i = this.carCounts;		
		while(i >= 0) {
			if(cars.get(i).getPlate().equals(plate) == true) {
				return cars.get(i);
			}
			i--;
		}
		return null;
	}
	
	public Car removeCar(String plate) {
		int i = this.carCounts;		
		while(i >= 0) {
			if(cars.get(i).getPlate().equals(plate) == true) {
				Car tmp = null;
				tmp = cars.remove(i);
				if(tmp != null) {
					this.carCounts--;
				   return tmp;
				}
			}
			i--;
		}
		return null;
		
	 // an alternative logic using for each loop:
		// for (Car car : this.cars){
		// if(car.getPlate().equals(plate)){
		// cars.remove(cars.indexOf(car));
		// carCounts --;
		// return car;
	    // }
	  //}
	}
	
	public boolean sellCar(String plate, Person newOwner) {
		Car tmp = searchCar(plate);
		if(tmp != null) {
			// using this rather using cars.remove(tmp)
			// for the sake of using a method
			// that is written for this class especially.
			removeCar(tmp.getPlate());
			tmp.setOwner(newOwner);
			return true;
		} 
		return false;		
	}
	
	public String introduceSelf() {
		String intro = "";
		intro = "i am a gallery. the name is: " + this.galleryName + ". "
				+ " my owner is: " + this.galleryOwner + " . the number of cars"
				+ " i own is " + this.carCounts
				+ intro;
	    
		// could be looping through the cars list but not going to
		// since we just going to return a basic string.
		
		
		return intro;
	}

	

}
