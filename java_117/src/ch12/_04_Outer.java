package ch12;

public class _04_Outer {
//455p 지역내부클래스
	int out = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRun implements Runnable{
			int lo = 10;

			@Override
			public void run() {
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("lo = "+lo);
				System.out.println("out = "+out+"(외부 클래스 인스턴스 변수)");
				System.out.println("_04_Outer.sNum = "+_04_Outer.sNum+"(외부 클래스 정적 변수)");
				
			}
		}
		return new MyRun();
	}
}
