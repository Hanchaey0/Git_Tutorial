package ch06;

public class _06_Human extends _06_Animal {

		//디폴트 생성자
		public _06_Human() {
		}

		@Override//재정의
		public void move() {
			System.out.println("사람이 두발로 걷습니다~~");
	
	}
		
		public void readBook() {
			System.out.println("사람이 책을 읽습니다.");
		}
}
