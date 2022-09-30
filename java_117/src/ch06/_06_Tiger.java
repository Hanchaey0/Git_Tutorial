package ch06;

public class _06_Tiger extends _06_Animal {

		//디폴트 생성자
		public _06_Tiger() {
		}

		@Override//재정의
		public void move() {
			System.out.println("호랑이가 네 발로 뜁니다~");
	
	}
		
		public void hunting() {
			System.out.println("호랑이가 사냥을 합니다.");
		}
}
