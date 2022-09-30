package test;

public class _09_Bank{

	// 멤버변수
	private String BankName;	//은행명 : 우리은행 	신한은행		 국민은행
	private int balance;		//잔고 :	10000 		20000		 30000
	private String address;	//위치 : 	강남구 대치동	관악구 신림동	 금천구 시흥동

	//디폴트 생성자
	public _09_Bank(){}
	//매개변수 생성자
	public _09_Bank(String BankName, int balance, String address){
		this.BankName = BankName;
		this.balance = balance;
		this.address = address;
	}
	//멤버메서드 (setter, getter, printInfo)

	public String getBankName(){
		return BankName;
	}
	public void setBankName(String BankName){
		this.BankName = BankName;
	}
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void printInfo(){
		System.out.println("은행명 : "+BankName+ ", 잔고 : " +balance+ ", 위치 : " + address);
	}
}

