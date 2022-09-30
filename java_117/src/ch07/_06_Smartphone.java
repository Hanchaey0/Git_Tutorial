package ch07;
//자식클래스 인터페이스 구현
//4. 상속과 구현을 동시에 해야 함.
public class _06_Smartphone extends _06_PDA implements _06_Mobile, _06_Mp3 {

	@Override
	public int calculate(int x, int y) {
		System.out.println(x+y);
		return x + y;
	}
	@Override
	public void play() {
		System.out.println("음악을 연주한다");
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈추다");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보낸다");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받다");
	}
}