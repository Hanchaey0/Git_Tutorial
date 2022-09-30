package ch08;

public class _02_Book extends Object {
	//클래스는 크게 세가지로 되어있다. 
	//멤버변수, 생성자(디폴트, 매개변수), 멤버메서드
	
	//멤버변수
	private int bookNumber;
	private String bookTitle;
	private String author;
	
	//디폴트 생성자
	public _02_Book() {}
	//매개변수 생성자
	public _02_Book(int bookNumber, String bookTitle, String author) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
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
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	/*  class_01_Book
	 * 모든 클래스의 최상위 클래스 Object
	 * toString() 메서드가 재정의 안되어있다.
	 * 컴파일과정에서 Extends Object가 자동으로 추가되고, Object의 toString() 메서드가 호출되었다.
	 * Object의 toString() : 패키지명.클래스명@해시코드값 => 주소값  예) ch08._01_Book@7852e922
	 *
	 * <class_02_Book에서 재정의>
	 * 	 * 재정의해서 객체 정보를 문자열로 반환해서 사용해야 원하는 정보를 출력할 수 있다.
	 */
	
	@Override
	public String toString() {
		return "책번호 : "+bookNumber+", 책 이름 : "+bookTitle+", 저자 : "+author;
	}

   
}
