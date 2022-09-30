package ch07;

public class _08_InterfaceEx {

	public static void main(String[] args) {
	//call by Reference
		C1 c1 = new C1();
		c1.method1(new C2());
	}

}


class C1 {
	public void method1(C2 c2) {
		System.out.println("C1 클래스 - method1()");
		//methodc2호출
		c2.method2(new C3());
		
	}
}

class C2 {
	public void method2(C3 c3) {
		System.out.println("C2 클래스 - method2()");
		c3.method3();
	}
}
class C3 {
	public void method3() {
		System.out.println("C3 클래스 - method3()");
		
	}
}