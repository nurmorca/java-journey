package p_1;

public interface CommercialVehicle {
	
	// the only way to add an attribute to 
	// an interface is describing it
	// as public final static.
	public final static int yearLimit = 10;
	
	public String getPlate();
	
	public double calculateAmortizedTax(double baseTax, int currentYear);

}
