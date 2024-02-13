package p_1;

public class Main {
	
	public static void main(String args[]) {
		
		Car c1 = new Car("34TUY123", 2015, 3.04);
		
		Car c2 = new Car("26YTU321", 2010, 3.04);
		
		System.out.println(c1.calculateAmortizedTax(1000, 2024));
		System.out.println(c1.calculateTax(1000));
		
		System.out.println(c2.calculateAmortizedTax(1000, 2024));
		System.out.println(c2.calculateTax(1000));
		
		
	}

}
