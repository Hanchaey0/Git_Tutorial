package ch06;

public class _01_Main {
	public static void main(String[] args) {
		
		
		_01_Dog dog = new _01_Dog();
		dog.bark();   //자식
		//extends했으므로 부모 멤버변수와 메서드 사용가능
		dog.setKind("강아지");

		dog.setLegs(4);
		dog.eat();
		dog.play();
		dog.sleep();
		dog.printInfo();
		
		_01_Cat cat = new _01_Cat();
		cat.cry();
		cat.eat();
		cat.play();
		cat.sleep();
		cat.setKind("고양이");
		cat.setLegs(4);
		cat.printInfo();
		
		
	}
}
