package ch12;

public class _05_Outer2 {
	//458p 익명내부클래스
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}

		};
	}
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 셥ㄴ수");
		}
	};

}

