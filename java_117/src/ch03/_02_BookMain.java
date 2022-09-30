package ch03;

public class _02_BookMain {
	public static void main(String[] args) {

		//두번째 붕어빵도 만들 수 있음.
		_02_Book java = new _02_Book();
//		java.bookNo = 1;
//		java.bookTitle ="자바 프로그래밍 입문";
//		java.author ="박은종";
//		java.bookPrice ="25000";
		
		//참조변수.멤버메서드
		System.out.println("== 1. 기본생성자, setter로 값 전달==");
		//1. setter를 이용해서 매개변수에 값 전달
		java.setBookNo(1);
		java.setBookTitle("자바 프로그래밍 입문");
		java.setAuthor("박은종");
		java.setBookPrice(25000);
		
		//참조변수.멤버메서드
		java.showBookInfo();
		
		////////////////////
		System.out.println("== 2. 매개변수 생성자를 통해 매개변수로 값을 전달==");
		//////////////////
		// 2. 매개변수 생성자를 통해 매개변수로 값을 전달
		_02_Book java2 = new _02_Book(2,"jsp","홍길동",30000);
		java2.showBookInfo();
	}
}
	//new 연산자에 의해 기본생성자 호출~~
	//== 1. 기본생성자, setter로 값 전달==
	//bookNo : 1
	//bookTitle : 자바 프로그래밍 입문
	//author : 박은종
	//bookPrice : 25000
	//== 2. 매개변수 생성자를 통해 매개변수로 값을 전달==
	//bookNo : 2
	//bookTitle : jsp
	//author : 홍길동
	//bookPrice : 30000

