package ch14;

//공유 영역 - 계좌이체, 잔액합계
public class _06_ShareArea {

	//멤버변수
	_06_Account account1;//김태희 계좌
	_06_Account account2;//비 계좌
	
	//계좌 이체를 한다
	synchronized void transfer(int amount) {
		account1.withdraw(amount);
		System.out.println("김태희 계좌"+amount+"인출, ");	
	
	//입금하다
	account2.deposit(amount);
	System.out.println("비 계좌" + amount + "입금, ");
}
	synchronized int getBalnceTotal() {
		return account1.getBalance() + account2.getBalance();
		
	}
}
	
