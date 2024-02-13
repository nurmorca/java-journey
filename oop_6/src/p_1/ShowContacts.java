package p_1;

import java.io.*;

public class ShowContacts {
	public static void main(String args[]) {
		String fileName = "contacts.dat";
		
		try {
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileName));
			int contactCount = (int) reader.readObject();
			for(int i = 0; i < contactCount; i++) {
				Contact aContact = (Contact) reader.readObject();
				System.out.println(aContact);
			}
			reader.close();	
		}
		catch(IOException e) {
			System.out.println("an exception has occured during file reading.");
			e.printStackTrace();
		}
		catch(ClassNotFoundException er) {
			System.out.println("an exception has occured while processing read records.");
			er.printStackTrace();
		}
	}
}
	

