package ch14;

public class _06_Main {
	public static void main(String[] args) {
	/*
	 * 1)한계좌의 금액을 다른 계좌로 이체
	 * 2)공유 영역(김태희 계좌(200만원) + 비계좌(100만원))
	 * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
	 */
		_06_ShareArea sa = new _06_ShareArea();
		
		//Account 매개변수 생성자로 값 전달
		sa.account1 = new _06_Account("010-9622-4146","김태희",2000000);
		sa.account2 = new _06_Account("010-2714-4146","비",1000000);
		
		
		//스레드 생성 _06_TransferThread, _06_TotalBalanceThread
		 _06_TransferThread t1 = new _06_TransferThread(sa);
		 _06_TotalBalanceThread t2 = new _06_TotalBalanceThread(sa);
		
		//2개 스레드 실행
		t1.start();
		t2.start();
		
		//synchronized 추가하면 각각 영역이 보호된다 스레드가 섞이지 않는다
	}
	
}
