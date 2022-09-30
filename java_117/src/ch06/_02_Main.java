package ch06;

public class _02_Main {
	public static void main(String[] args) {
	//자식클래스에서 setter로 값 설정, 자식메서드, 상속받은 메서드 호출
	//상속을 이용해 부모클래스 접근
		
	_02_FireCar c1 = new _02_FireCar();
	c1.setKind("소방차");
	c1.setSpeed(2000);
	c1.water();
	c1.carInfo();
	
	_02_PoliceCar f1 = new _02_PoliceCar();
	f1.setKind("경찰차");
	f1.setSpeed(3000);
	f1.siren();
	f1.carInfo();
	}
	

	
	
}
