package ch01;

public class _03_VariableEx {
	public static void main (String[] args) {
		/*
		 * 1. 기본자료형(Primitive Type) : 실제 '값'이 저장되는 공간
		 * 		정수형:byte(1바이트) - short(2바이트) - int(4바이트) - long(8바이트)
		 * 		실수형:float(4바이트)-double(8바이트)
		 * 		문자형:char(2바이트)
		 * 		부울형:boolean(1바이트):true(1), false(0)
		 * 
		 * 2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 - 참조변수의 자료형
		 * 		클래스, 인터페이스, 배열
		 * 
		 * 3. 문자열 : String 클래스
		 */
		
		System.out.println("==== 정수형 변수 ====");
		
		int num1=10; //값을 대입한 것을 초기화라고 함. 4바이트를 차지해서 만들었고, 10을 초기화함. 변수 선언과 동시에 초기화 한 것.
		long num2 = 1234567890L; //long은 숫자 뒤에 L또는 l을 붙인다. int와 비교하기 위해.
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("=== 실수형 변수 ===");
		float fnum1 = 3.14F; // F나f를 붙임
		double dnum1 = 3.14; // double형은 기본형이며, 뒤에 F나f를 생략
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		
		System.out.println("=== char형 변수 ====");
		char ch1 = ' '; //공백 없으면 에러남. 초기화 할 때 홑따옴표를 사용.
		ch1='A'; //이것도 에러. 문자 초과. char ch1 ='A';해도 에러. 변수 중복이라.
		System.out.println("ch1 : " + ch1);
		
		System.out.println("=== 문자열 ===");
		String str = "김태희";//공백이 없어도 에러가 발생하지 않는다 class이므로 반드시 대문자로 시작한다
		System.out.println(str);
		
		System.out.println( "=== 부울형 ===");
		boolean isMarried = true;
		boolean isWorker = false;
		System.out.println("isMarried : " + isMarried);
		System.out.println("isWorker : " + isWorker);
		
		
		
	}

}
