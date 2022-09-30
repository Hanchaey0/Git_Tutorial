package ch12;

public class _04_LocalInnerTest {
	
	
//456
	
	public static void main(String[] args) {
		_04_Outer out = new _04_Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
