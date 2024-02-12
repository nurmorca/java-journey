package p_1;

public class Book {
     private String bookName;
     private String author;
     private String ISBN;
     private int rowNo;
     private int position;
     
     
     
     public Book() {
    	 
     }
     
     public Book(String bookName, String author, String ISBN) {
    	 this.bookName = bookName;
    	 this.author = author;
    	 this.ISBN = ISBN;  
     }
     
     public Book(String bookName, String author, String ISBN, int rowNo, int position) {
    	 this.bookName = bookName;
    	 this.author = author;
    	 this.ISBN = ISBN;
    	 this.rowNo = rowNo;
    	 this.position = position;
     }
     
     public String getBookName() {
    	 return bookName;
     }
     
     // setter metodlar genellikle bir deger dondurmezler.
     // o yuzden void olurlar.
     public void setBookName(String bookName) {
    	 this.bookName = bookName;
     }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getRowNo() {
		return rowNo;
	}

	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
     
     // genellikle setter'larda attribute ismi parametre
     // olarak kullanilir.
     // basina this.(attribute) geldiginde bu sinifa ait olan
     // ozellik kastedilmis olur. 
     
     
     
     
     
     
}
