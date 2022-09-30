package ch12;
//459메인
public class _05_AnnoymousInnerTest {
	public static void main(String[] args) {
		_05_Outer2 out = new _05_Outer2();
		Runnable runner = out.getRunnable(10);
		runner.run();
		out.runner.run();
	}

}
