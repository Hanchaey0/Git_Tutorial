package ch14;

public class _06_Account {

	//계좌정보


	//매개변수
	private String accountNo; //계좌번호
	private String ownerName; //예금주 이름
	private int balance; //잔액

	//디폴트 생성자
	public _06_Account() {}
	//매개변수 생성자
	public _06_Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance () {
		return balance;
	}
	public void setBalance (int balance) {
		this.balance = balance;
	}


	//입금하다
	public void deposit (int amount) {
		balance += amount;
	}
	//출금하다
	public int withdraw(int amount) {
		if(balance < amount) return 0; {
			balance -= amount;
			return balance;
		}
	}
}

