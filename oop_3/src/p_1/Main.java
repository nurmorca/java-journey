package p_1;

public class Main {
	
	public static void main(String args[]) {
		
		Kindergarten kindergarten = new Kindergarten();
		
		Child c1 = new Child("Gokcen", 36);
		Child c2 = new Child("Mera", 6);
		Child c3 = new Child("Devrim", 60);
		Child c4 = new Child("Araf", 3);
		Child c5 = new Child("Tony", 0);
		Child c6 = new Child("Ugur", 12);
		
		Toy t1 = new Toy("123-456", "rocket", 2);
		
		Clothing ct = new Clothing("098-765", "sweater", 12, 18);
		
		kindergarten.addChild(c1);
		kindergarten.addChild(c2);
		kindergarten.addChild(c3);
		kindergarten.addChild(c4);
		kindergarten.addChild(c5);
		kindergarten.addChild(c6);
		
		System.out.println(kindergarten.findOldestChild().getName());
		
		System.out.println(t1.isSuitable(c2));
		System.out.println(t1.isSuitable(c1));
		
		System.out.println(ct.isSuitable(c2));
		System.out.println(ct.isSuitable(c1));
		
		System.out.println(Item.getType());
		
	
		
		
		
		
	}

}
