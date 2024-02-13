package p_1;

public class Car implements CommercialVehicle, PersonalVehicle {
	
	private String plate;
	private int modelYear;
	private double engineVolume;
	
	public Car(String plate, int modelYear, double engineVolume) {
		this.plate = plate;
		this.modelYear = modelYear;
		this.engineVolume = engineVolume;
	}
	
	public double calculateTax(double baseTax) {
		return baseTax * engineVolume;
	}
	
	public double calculateAmortizedTax(double baseTax, int currentYear) {
		int age = currentYear - this.modelYear;
		if(age < CommercialVehicle.yearLimit) {
			return baseTax * engineVolume * (1-age*
					((double)1/CommercialVehicle.yearLimit));
		} 
		return baseTax * engineVolume *
				((double)1/CommercialVehicle.yearLimit);
	}
	
	public String getPlate() {
		return this.plate;
	}

	public int getModelYear() {
		return modelYear;
	}

	public double getEngineVolume() {
		return engineVolume;
	}
	
	
	
	

}
