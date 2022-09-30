package ch14;

public class _02_ThreadMain {
	public static void main(String[] args) {
		
		
		Thread thread = new Thread(new _02_MyThread());
		thread.start();
		
	}
	/*
	 * [면접]
	 * Thread 생성과 실행
	 * (2) 2)Runnable인터페이스를 구현하기
	 * 1. Runnable 인터페이스를 implements 받아 클래스를 작성한다.
	 * 2. 추상메서드 run()메서드를 재정의(Override)한다
	 * 3. main()메서드에서 Thread객체를 생성하고, implements 받은 클래스 객체를 매개변수로 전달한다.
	 * 4. start()메서드를 호출해서 스레드를 실행한다.
	 * 5. run()메서드가 실행된다.
	 * 
	 */
}
