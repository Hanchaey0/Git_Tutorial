package test;


//자식클래스 - drive(), stop() 재정의
public class _12_ManualCar extends _12_Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");

	}
}
