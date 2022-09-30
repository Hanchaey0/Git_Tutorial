package ch07;

public interface _07_Lendable {
	//상수 state 코드로 사용
	int STATE_BORROWED = 1; //대출상태
	int STATE_NORMAL = 0; //반납상태 (new시점에 반납상태로 초기화)
	
	//추상메서드
	public void checkOut(String borrower, String checkOutDate); //대출하다
	public void checkIn();	 //반납하다
	}
