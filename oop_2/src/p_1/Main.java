package p_1;

public class Main {
	
	public static void main(String args[]) {
		Person p1 = new Person("Tony Soprano");
		Person p2 = new Person("Siobhan Roy");
		Person p3 = new Person("Frank Underwood");
		Person p4 = new Person("Amy Dunne");
		
		Car c1 = new Car("34-TUY-888", p1);	
		Car c2 = new Car("26-TUY-111", p1);
		Car c3 = new Car("03-TUY-333", p2);
		Car c4 = new Car("31-TUY-888", p2);
		Car c5 = new Car("16-TUY-888", p3);
		Car c6 = new Car("35-TUY-888", p3);
		
		Gallery gallery = new Gallery("The Gallery", p3);
		 System.out.println(c2.introduceSelf());
		
	     gallery.getGalleryName();
	    
	    gallery.addCar(c5);
	    gallery.addCar(c2);
	    gallery.addCar(c6); 
	    
	    System.out.println(p3.introduceSelf());
	    System.out.println(p4.introduceSelf());
	    System.out.println(c2.introduceSelf());
	    System.out.println(p1.introduceSelf());
	    
	    
	    
	    
	}
	
	
  
}
