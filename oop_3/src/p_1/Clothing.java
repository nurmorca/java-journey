package p_1;

public class Clothing extends Item{
   
   private int minMonthLimit;
   private int maxMonthLimit;
   
   public Clothing(String barcode, String description, int minMonthLimit, int maxMonthLimit) {
	super(barcode, description);
	this.minMonthLimit = minMonthLimit;
	this.maxMonthLimit = maxMonthLimit;
	}
   
    public boolean isSuitable(Child aChild) {
    	if(aChild.getAgeInMonths() < minMonthLimit
    			|| aChild.getAgeInMonths() > maxMonthLimit) {
    		return false;
    	}
    	return true;
    }
   
}
