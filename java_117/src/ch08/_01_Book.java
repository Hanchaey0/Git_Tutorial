package ch08;

public class _01_Book extends Object {
	//클래스는 크게 세가지로 되어있다. 
	//멤버변수, 생성자(디폴트, 매개변수), 멤버메서드
	
	//멤버변수
	private int bookNumber;
	private String bookTitle;
	
	//디폴트 생성자
	public _01_Book() {}
	//매개변수 생성자
	public _01_Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	//멤버메서드
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
}	