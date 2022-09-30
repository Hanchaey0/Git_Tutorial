package test;
public class _14_AppBookInfo extends _14_BookInfo implements _14_BookInfolmpl{

	//멤버변수
	private String borrower; //대출자
	private String checkOutDate; //대출일자
	private int state; //대출여부
	//생성자
	public _14_AppBookInfo(){}
	public _14_AppBookInfo(String registerNo, String title, String borrower, String checkOutDate, int state){
		super(registerNo, title);
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = state;
	}
	
	@Override
	public void checkOut(String borrower, String checkOutDate){
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		
		if(state ==STATE_BORROWED){
			System.out.println("대출하실 수 없습니다.");
		}else{
			System.out.println("대출되었습니다.");
			System.out.println("도서번호 : "+super.getRegisterNo());
			System.out.println("도서제목 : "+super.getTitle());
			System.out.println("대출인 : "+borrower);
			System.out.println("대출일 : "+checkOutDate);
			state = STATE_BORROWED;
		}
	}
	@Override
	public void checkIn(){
		
		if(state == STATE_NORMAL){
			System.out.println("이미 반납된 상태입니다.");
		}else{
			System.out.println("반납되었습니다.");
			System.out.println("반납인 : "+borrower);
			state = STATE_NORMAL;
		}
	}
}
