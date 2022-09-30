package test;

public interface _14_BookInfolmpl {
	//상수 - state 코드로 사용
	public static final int STATE_BORROWED = 1; //대출상태
	 int STATE_NORMAL = 0; //반납상태

	//추상메서드
	public void checkOut(String borrower, String checkOutDate); //대출일자
	public void checkIn(); //반납하다
}
