package ch07;

public class _07_Main {

	public static void main (String[] args) {
		
		//(String registerNo, String title, String borrower, String checkOutDate, int state)
		_07_AppCDInfo ap = new _07_AppCDInfo("R001","노인과 바다","","",_07_Lendable.STATE_NORMAL);
		System.out.println("=== 책 대여시 ===");
		ap.checkOut("홍길동", "2022-06-29");
		
		System.out.println("\n==== 이미 대출된 상태인데 대출시도 할 때 ====");
		ap.checkOut("홍길동", "2022-06-29");
		
		System.out.println("\n=== 책 반납시 ====");
		ap.checkIn();
		
		System.out.println("\n==== 이미 반납된 상태일 때 책 반납시 ====");
		ap.checkIn();
		//checkOut시점에 (borrower, checkOutDate)
		//대출상태 판단은 상수를 이용할 것
	
	
	
	
	}
}
	/*
	 * === 책 대여시 ===
  	대출되었습니다.
	도서번호 :R001
	책 이름 : 노인과 바다
	대출인 : 홍길동
	대출일: 2022-06-29
	==============
	
	==== 이미 대출된 상태인데 대출시도 할 때 ====
	대출할 수 없습니다.
	
	=== 책 반납시 ====
	반납되었습니다..
	도서번호 :R001
	책 이름 : 노인과 바다
	반납인 : 홍길동
	반납일: 2022-06-29
	==============
	
	==== 이미 반납된 상태일 때 책 반납시 ====
	이미 반납된 상태입니다.
	
	 */
