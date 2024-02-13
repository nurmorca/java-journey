package p_1;

import java.util.*;
import java.io.*;

public class CreateContacts {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program saves information of your"
				+ " contacts to a file in your drive.");
		System.out.println("How many contacts will you enter? ");
		int contactCount = input.nextInt();
		Contact[] contacts = new Contact[contactCount];
		input.nextLine();
		
		for(int i = 0; i < contactCount; i++) {
			System.out.println("enter contact name #" + (i+1) + ": ");
			contacts[i] = new Contact(input.nextLine());
			System.out.println("enter number: ");
			contacts[i].setPhone(input.nextLine());
			System.out.println("enter email: ");
			contacts[i].setMail(input.nextLine());
		}
		
		try {
			// if the data is serializable, it is usually
			// saved as .dat file.
			String fileName = "contacts.dat";
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
			output.writeObject(contactCount);
			for(Contact c: contacts) {
				output.writeObject(c);
			}
			output.close();
			System.out.println("the info has been successfully saved under the filename " + fileName + ".");
			
		} catch(IOException e) {
			System.out.println("en error has been occured while saving contacts.");
			e.printStackTrace();
		}
		  input.close();	
	
	}

}
