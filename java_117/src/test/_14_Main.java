package test;

public class _14_Main {
	public static void main(String[] args){

		_14_AppBookInfo in = new _14_AppBookInfo("B001","자바프로그래밍입문","","",_14_BookInfolmpl.STATE_NORMAL);
		System.out.println("=== 책 대여시 ===");
		in.checkOut("김태희","2022-06-30");
		System.out.println("=== 이미 대출된 상태인데 대출시도할 때 ===");
		in.checkOut("김태희","2022-06-30");
		System.out.println("=== 책 반납시 ===");
		in.checkIn();
		System.out.println("=== 이미 반납된 상태인데 책 반납시 ===");
		in.checkIn();
	}
}

/*=== 책 대여시 ===
대출되었습니다.
도서번호 : B001
도서제목 : 자바프로그래밍입문
대출인 : 김태희
대출일 : 2022-06-30
=== 이미 대출된 상태인데 대출시도할 때 ===
대출하실 수 없습니다.
=== 책 반납시 ===
반납되었습니다.
반납인 : 김태희
=== 이미 반납된 상태인데 책 반납시 ===
이미 반납된 상태입니다.
*/
