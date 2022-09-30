package ch07;

public class _10_Interface {
	public static void main(String[] args) {
		A10 a = new A10();
		a.methodA();
	}

}
class A10{
	public void methodA() {
		// I10 i10 = new B10();
		I10 i10 = InstanceManager.getInstance(); //팩토리 메서드(factory method)
		//클래스명.getInstance을 하기위해선 static을 붙여야 바로 호출이 가능함.
		i10.methodB();
	}
}

interface I10{
	public void methodB();

}

class B10 implements I10{
	public B10() {
		System.out.println("B10 디폴트 생성자 호출");
	}

	@Override
	public void methodB() {
		System.out.println("B10클래스 - metodB");
	}
}

class InstanceManager{
	//I10 i10 = new B10();	//다형성 적용
	//정적메서드 ( static )
	public static I10 getInstance() {
		return new B10();
	}
}
//* 팩토리 메서드(factory method)
//* - 객체를 생성하는 정적 팩토리메서드이다.
//*   이것은 디자인 패턴의 하나로서 객체를 만드는 부분을 자식클래스에게 위임하는 패턴이다.
//*   즉 new 연산자를 호출하여 객체를 생성하는 코드를 자식클래스에게 위임하는 패턴이다.
//*   사용하는 이유는 하나의 클래스가 변경되었을 경우에 다른 클래스의 변경을 최소화하기 위함이다.
//*   
//*   팩토리 메서드 이름으로 많이 사용되는 것은 getInstance()이다.
//*   인터페이스에서 팩토리 메서드를 제공할 때 정적메서드를 사용하게 된다.
//*   static이므로 클래스명.정적메서드로 접근

