package p_1;

import java.util.*;

public class Kindergarten {
	
	private ArrayList<Child> children;
	private int capacity;
	
	public Kindergarten() {
		children = new ArrayList<>();
		this.capacity = 5;
	}
		
	public boolean addChild(Child aChild) {
	   if(children.size() < capacity) {
		   return children.add(aChild);	
	   } else {
		   System.out.println("capacity full!");
		   return false;
	   }
       
	}
	
	public Child findOldestChild() {
		Child maxChild = children.get(0);
		for(Child c : this.children) {
			if((c.getAgeInMonths() / 12) > (maxChild.getAgeInMonths() / 12)) {
				maxChild = c;
			}
		}
		return maxChild;
	}

}
