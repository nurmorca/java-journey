package p_1;

public class Main {
	
	// komut satirinda calistirildiginda 
	// String[] args icerisine farkli farkli
	// parametreler verilerek yazilabilir.
	public static void main(String[] args) {
		
		int rowNumber = 3;
		
		Bookshelf bookshelf = new Bookshelf(rowNumber);
		
		Book b1, b2, b3;
		
		b1 = new Book("Mad Men", "Don Draper", "123-456-789", 1, 1);
		b2 = new Book("Succession", "Jesse Armstrong", "987-654-321", 1, 2);
		b3 = new Book("Mindhunter", "David Fincher", "888-999-000");
		
		b3.setRowNo(1);
		b3.setPosition(0);
		
		
		bookshelf.addBook(b1);
		bookshelf.addBook(b2);
		bookshelf.addBook(b3);
		
		bookshelf.showRow(1);
		
		Book tmp = bookshelf.deleteBook(b1);
		bookshelf.showRow(1);
		
		System.out.println("The deleted book was: " + tmp.getBookName());
		tmp.setRowNo(2);
		bookshelf.addBook(b1);
		bookshelf.showRow(2);
		
		
	}

}
