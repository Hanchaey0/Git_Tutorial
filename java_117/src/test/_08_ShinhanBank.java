package test;
public class _08_ShinhanBank{
	private String bankName; //은행명
	private int customerCount; //고객수
	private int bankMoney;  //은행수입
	//디폴트 생성자
	public _08_ShinhanBank(){}
	//매개변수 생성자
	public _08_ShinhanBank(String bankName){
		this.bankName=bankName;
	}
	//멤버변수
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return bankName;
	}
	public void setCustomerCount(int customerCount){
		this.customerCount=customerCount;
	}
	public int getCustomerCount(){
		return customerCount;
	}
	public void setBankMoney(int bankMoney){
		this.bankMoney=bankMoney;
	}
	public int getBankMoney(){
		return bankMoney;
	}
	public void deposit (int bankMoney){ //대문자 입력
		customerCount++;    //고객수 증가
		this.bankMoney = bankMoney;
	}
	public void printInfo(){
		System.out.println(bankName+"의 고객수 : "+customerCount+", 은행 잔고 : "+bankMoney+"원입니다.");
	}

}
