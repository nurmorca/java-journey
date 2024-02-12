package p_1;

public abstract class Item {
	
	private String barcode;
	private String description;
	
	
	public Item(String barcode, String description) {
		this.barcode = barcode;
		this.description = description;
	}


	public String getBarcode() {
		return barcode;
	}


	public String getDescription() {
		return description;
	}
	
	public abstract boolean isSuitable(Child aChild);
	
	// static kavrami oldugunde o isimden
	// bir nesne olusturulmamissa bile
	// onu kullanmamiz mumkun!
	public static String getType() {
		return "this is an item";
	}

}
