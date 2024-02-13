package p_1;

import java.util.*;

public class TestExceptions {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("enter name: ");
			String name = in.nextLine();
			Person person = new Person(name);
			System.out.println("enter age: ");
			int age = in.nextInt();
			person.setAge(age);
			System.out.println(person);
		}   catch(ImpossibleInfo e) {
			// System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

}
