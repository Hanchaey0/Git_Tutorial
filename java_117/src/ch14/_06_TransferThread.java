package ch14;

public class _06_TransferThread extends Thread{
	//Thread 클래스를 상속 - 계좌이체 스레드
	_06_ShareArea sharedArea;

	//디폴트 생성자
	public _06_TransferThread() {}
	//매개변수 생성자
	public _06_TransferThread(_06_ShareArea sharedArea) {
		this.sharedArea = sharedArea;
	}
	@Override
	public void run() {
		//계좌이체 5번
		for(int cn=0;cn<5;cn++) {
			sharedArea.transfer(1000);
			}

		}
	}

