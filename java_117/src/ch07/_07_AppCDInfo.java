package ch07;

//자식클래스 -  부모클래스 상속받고 인터페이스 구현
public class _07_AppCDInfo extends _07_CDInfo implements _07_Lendable {
	//멤버변수
	private String borrower; //대출자
	private String checkOutDate; //대출일자
	private int state; //대출여부

	//생성자
	public _07_AppCDInfo() {}
	public _07_AppCDInfo (String registerNo, String title, String borrower, String checkOutDate, int state) {
		super(registerNo, title);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state =state;
	}

	@Override //대출시
	public void checkOut(String borrower, String checkOutDate) {

		if(state==STATE_BORROWED) {
			System.out.println("대출할 수 없습니다.");
		}else {
			System.out.println("대출되었습니다.");
			System.out.println("도서번호 :"+super.getRegisterNo());
			System.out.println("책 이름 : "+super.getTitle());
			System.out.println("대출인 : "+borrower);
			System.out.println("대출일: "+checkOutDate);
			System.out.println("==============");
			state=STATE_BORROWED; //대출상태
		}
	}
	@Override //반납하다
	public void checkIn() {
		if(state==STATE_NORMAL) {
			System.out.println("이미 반납된 상태입니다.");
		}else {
			System.out.println("반납되었습니다..");
			System.out.println("도서번호 :"+super.getRegisterNo());
			System.out.println("책 이름 : "+super.getTitle());
			System.out.println("반납인 : "+borrower);
			System.out.println("반납일: "+checkOutDate);
			System.out.println("==============");
			state=STATE_NORMAL; //대출상태
		}
	}
}