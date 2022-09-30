package ch14;

public class _03_ThreadMain {
	public static void main(String[] args) {
		//2개의 쓰레드 발생 A B
		Thread tr = new Thread(new _03_MyRunnable("A"));
		tr.start();
		Thread tr1 = new Thread(new _03_MyRunnable("B"));
		tr1.start();
	}

}
