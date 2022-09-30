package ch06;

public class _06_Eagle extends _06_Animal {

		//디폴트 생성자
		public _06_Eagle() {
		}

		@Override//재정의
		public void move() {
			System.out.println("독수리가 하늘을 납니다");
	
	}
		
		public void flying() {
			System.out.println("독수리가 날개를 쭉펴고 하늘을 날아갑니다.");
		}
}
