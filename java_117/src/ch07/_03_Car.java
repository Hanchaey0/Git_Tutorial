package ch07;

//부모클래스
public abstract class _03_Car extends Object{
	/* 시험
	 * 템플릿 메서드 : 
	 * - 메서드 실행순서와 시나리오를 정의하는 것이다.
	 * - 로직 흐름이 이미 정해져 있는 프레임워크에서 많이 사용하는 구현 방법이다.
	 * - final로 선언한 이유는 모든 하위클래스가 공통으로 사용하고, 코드를 변경하면 안되기 때문에 final로 선언함
	 * final 메서드명 : 상속받은 하위 클래스가 부모 메서드를 재정의 할 수 없다.  
	 * 
	 * final  p305
	 * 1) 변수(상수) : 변수에 값 대입불가
	 * 2) 메서드 : 재정의 불가
	 * 3) 클래스 : 상속 불가
	 */
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	//자동차가 달리는 방법을 순서대로 구현
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
