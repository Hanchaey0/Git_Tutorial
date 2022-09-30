package ch14;

public class _06_TotalBalanceThread extends Thread{
//Thread 클래스를 상속 - 잔액합계 스레드
	_06_ShareArea sharedArea;
	
	public _06_TotalBalanceThread() {}
	public _06_TotalBalanceThread(_06_ShareArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	@Override
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			//잔액합계 구해서 출력
			int sum = sharedArea.getBalnceTotal();
			System.out.println("계좌 잔액 합계 : "+sum);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
