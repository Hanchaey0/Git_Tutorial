package ch12;

public class _03_InnerTest {
	public static void main(String[] args) {
		_03_Outclass.InStaticClass sInClass = new _03_Outclass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		_03_Outclass.InStaticClass.sTest();
		
	}

}
