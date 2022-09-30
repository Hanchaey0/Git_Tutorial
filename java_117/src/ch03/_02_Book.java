package ch03;

public class _02_Book { //붕어빵 만드는 틀 ㅎㅎ

	//멤버 변수
	private int bookNo;			//책 번호
	private String bookTitle;	//책 이름
	private String author;		//책 저자
	private int bookPrice;	//책 가격
	
	//생성자
	//반환형이 없으며, void도 붙이지 않는다.
	//접근제어자 + 클래스명 (){}
	//디폴트 생성자
	public _02_Book() {
		System.out.println("new 연산자에 의해 기본생성자 호출~~");
	}
	
	
	
	/*
	 * _01, _02의 멤버변수를 넣는 방법은 좋은 방법이 아님.
	 *  변수의 값을 넣을 때 잘못된 값을 넣을 수 있다.
	 *  그래서 직접 대입하지 말고, 메서드를통해 값을 대입하자.
	 *  (private를 사용) 그러면 02main이 오류난다.
	 *  쉴드쳐서. 그러면 메인에선 값을 줄 수 없다.
	 *  ->메서드를 통해서 값을 준다.
	 */
			//값을 설정/값을 가져온다
	
	// 매개변수 생성자 : 매개변수의 값을 멤버변수로 전달
	public _02_Book(int bookNo, String bookTitle, String author, int bookPrice) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookPrice = bookPrice;
		//멤버변수↑
	}
	
	
	//멤버 메서드(setter/getter) showBookInfo-> setShowBookInfo
	//2. 매개변수 -> 멤버변수로 값 전달(돌려주는 역할)

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
		
	// 3. 멤버변수의 값을 리턴
	public void showBookInfo() {

		//this는 현재 나의 것. 02북네임전부임. 메인에서 (int bookNo)로 받아와서
		//bookNo;에 받고 this.bookNo에 저장. 이건 맨 위 private int bookNo;에
		//저장된다. 
	
		//멤버변수를 이용해 출력
		//System.out.println("책 번호 : " + bookNo);
		//System.out.println("책 이름 : " + bookTitle);
		//System.out.println("책 저자 : " + author);
		//System.out.println("책 가격 : " + bookPrice);
		
		//getter을 이용해 출력
		
		System.out.println("bookNo : " + getBookNo());
		System.out.println("bookTitle : " + getBookTitle());
		System.out.println("author : "+ getAuthor());
		System.out.println("bookPrice : "+ getBookPrice());
	}

}

