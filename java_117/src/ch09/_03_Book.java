package ch09;

public class _03_Book {
	
	//멤버변수
	private String bookName;
	private String author;
	
	
	//생성자
	public _03_Book() {}
	public _03_Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//멤버메서드(set, get, toString)
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return bookName+", "+author;
		
	
		
	}
}
