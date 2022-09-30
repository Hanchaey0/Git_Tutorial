package ch07;


public class _06_Main {
	public static void main(String[] args) {


		System.out.println(" == 자식클래스 생성 == ");

		_06_Smartphone p = new _06_Smartphone();

		p.calculate(10, 5);
		//_06_MP3 인터페이스의 추상메서드 호출 => 자식클래스의 재정의된 메서드가 호출된다.
		p.play();
		//_06_Mobile 인터페이스의 추상메서드 호출 => 자식클래스의 재정의된 메서드가 호출된다.
		p.sendSMS();
		p.receiveSMS();

		System.out.println(" == 다형성 적용해서 생성 == ");
		_06_Mp3 p2 = new _06_Smartphone(); //mp3에 있는 부모쪽만 사용 가능.
		//오버라이드된 자식메서드가 호출
		p2.play(); 
		p2.stop();
		_06_Mobile p3 = new _06_Smartphone();
		p3.sendSMS();



	} 
}
//	== 자식클래스 생성 == 
//		15
//		음악을 연주한다
//		문자를 받다
//		문자를 보낸다
//		음악을 멈추다
//		 == 다형성 적용해서 생성 == 
//		음악을 연주한다
//		음악을 멈추다
//		문자를 보낸다



