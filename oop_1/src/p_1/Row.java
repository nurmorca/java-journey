package p_1;

import java.util.ArrayList;

public class Row {
	
	private ArrayList<Book> books;
		
	
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public Row() {
		books = new ArrayList<>();
	}
	
	public boolean addBook(Book b) {
		return books.add(b);
	}
	
	public boolean removeBook(Book b) {
		return books.remove(b);
	}
	
	public Book removeBook(int position) {
		return books.remove(position);
	}
	// eger silindiginde bilgileri tutmak istiyorsak
	// o tipte bir deger donduren bor metod yazilip
	// silinen kitabi book tipinde donduren bir metodla
	// siliyoruz listeden.
	

}
