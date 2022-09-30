package ch12;
//450 
//인스턴스 내부 클래스 예제 
public class _02_OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;


	public _02_OutClass() {
		inClass = new InClass();
	}

	class InClass{
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num = "+num + "외부클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = "+sNum+"외부클래스의 정적 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
}






