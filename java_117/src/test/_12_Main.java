package test;

public class _12_Main {
	   public static void main(String[] args) {
			//다향성 적용
			System.out.println("=== 자율 주행하는 자동차 ===");
			_12_Car car = new _12_AICar();
			//템플릿 메서드 호출
			car.run();
			
			System.out.println("=== 사람이 운전하는 자동차 ===");
			//다향성 적용
			_12_Car car2 = new _12_ManualCar();
			//템플릿 메서드 호출
			car2.run();
		}

	}