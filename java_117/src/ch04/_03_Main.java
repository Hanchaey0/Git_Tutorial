package ch04;

public class _03_Main {
	public static void main(String[] args) {
		
		//학생 두 명 생성
		_03_Student james = new _03_Student("james", 5000);
		_03_Student tom = new _03_Student("Tom", 10000); //call by value =>호출시 값 전달
		
		//by reference =>호출시 주소값 전달
		
		_03_Bus bs = new _03_Bus(100);
		james.takeBus(bs);
		tom.takeBus(bs);
		bs.showInfo();
		
		_03_Subway sy = new _03_Subway("1호선");
		james.takeSubway(sy);
		tom.takeSubway(sy);
		sy.showInfo();

		
		_03_Taxi ty = new _03_Taxi("12가2341");
		james.takeTaxi(ty);
		tom.takeTaxi(ty);
		ty.showInfo();
		james.showInfo();
		tom.showInfo();
	}
}
