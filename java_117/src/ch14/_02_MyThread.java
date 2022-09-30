package ch14;

// 1) Thread 클래스를 상속하기
public class _02_MyThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.print(i+" ");
		}		
	}
	
}
