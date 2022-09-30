package ch07;

public class _03_Main {
	public static void main(String[] args) {
		//다향성 적용
		System.out.println("=== 자율 주행하는 자동차 ===");
		_03_Car car = new _03_ManualCar();
		//템플릿 메서드 호출
		car.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		//다향성 적용
		_03_Car car2 = new _03_AICar();
		//템플릿 메서드 호출
		car2.run();
	}

}
