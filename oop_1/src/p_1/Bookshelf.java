package p_1;

public class Bookshelf {
	
	Row rows[];
	
	
	public Bookshelf(int rowNumber) {
		rows = new Row[rowNumber];
		for(int i = 0; i < rowNumber; i++) {
			rows[i] = new Row();
		}
	}
	
	public void addBook(Book b) {
		rows[b.getRowNo()].addBook(b);	
    }
	// kitabin attribute'u olan rowNo'ya eriserek
	// row nesnesinin metodu olan addBook'u cagiriyoruz.
	
	public Book deleteBook(Book b) {
		return rows[b.getRowNo()].removeBook(rows[b.getRowNo()].getBooks().indexOf(b));
	}
	
	public Book searchBook(String name) {
		for(int i = 0; i < rows.length; i++) {
			for(Book b : rows[i].getBooks()) {
				if(b.getBookName().compareTo(name) == 0) {
					return b;
				}
			}
		}
		return null;
	}
	
	public void showRow(int rowNo) {
		System.out.println("Books in row " + rowNo + ":");
		for(Book b : rows[rowNo].getBooks()) {
			System.out.println("Name of the book: " + b.getBookName() +
			                   " Name of the author: " + b.getAuthor() +
			                   " ISBN: " + b.getISBN());	
		}
		
		// an alternative syntax for that:
	//	for(int i = 0; i < rows[rowNo].getBooks().size(); i++) {
	//		System.out.println(rows[rowNo].getBooks().get(i).getBookName());
	//	}
	}
	
	

}
