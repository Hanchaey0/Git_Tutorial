package ch03;

public class _03_CarMain {
	public static void main(String[ ]args) {
		
		//1. setter를 이용해서 매개변수에 값 전달
		System.out.println("1. setter를 이용해서 멤버변수에 값 전달");
		_03_Car car1 = new _03_Car();
		car1.setBrand("현대 자동차");
		car1.setColor("검정");
		car1.setSpeed(200);	
		car1.printInfo();
		
		// 2. 매개변수 생성자를 통해 매개변수로 값을 전달
		System.out.println("방법 2. 매개변수 생성자를 이용해서 멤버변수에 값 전달");
		_03_Car car2 = new _03_Car("기아자동차","흰색",300);
		
		car2.printInfo();
		System.out.println("[ 메서드를 통해 값을 출력 ]");
		System.out.println("Car brand : " + car2.getBrand());
		System.out.println("Car color : " + car2.getColor());
		System.out.println("Car speed : " + car2.getSpeed());
		//private가 붙어서 다른 집에 있어서 brand~speed를 가져올 수 없으니
		//(캡슐화 되어 있다는 소리)
		//getter를 통해 가져온다. getter를 가져올 땐 내꺼가 아니기때문에
		//앞에 주소인 참조변수(car2.)를 붙여준다.
		
	}

}	

