package ch01;

//1일차
//클래스명은 대문자로 시작한다
public class _01_VariableEx {
	//프로그램을 시작하는main() 메서드 소문자로 시작한다
	//자바가상머신(Java Virtual Machine, JVM)이 프로그램을 시작하기위해 호출하는 메서드
		public static void main (String[] args) {
			//변수 선언 및 대입
			//변수는 소문자로 시작한다.
			System.out.println("*** 변수 ***");
			System.out.println("변수:하나의 값을 저장할수 있는 메모리 공간");
			
			//자료형 변수명 =값;
			String name = "최슬기";
			System.out.println("이름 : "+name);
			name = "홍길동";
			// 메모리에 생성. 최슬기->홍길동 앞에 string을 선언하면 안 됨. 굳이 하겠다면 네임2를(다른공간) 만들던가 해야함.
			String name2 = "홍길동"; //String name = "이슬아";는 중복된 변수에 대입하므로 에러가 뜰 것이다.
			System.out.println("이름 : "+name);
			System.out.println("이름 : "+name2);

			
			String email = "tmfrl043@naver.com";
			System.out.println("이메일 : " + email);
			
			//중복변수라 안됨 String email = "tmfrl0243@naver.com";
			email="tmfrl987@naver.com";
			System.out.println(email);
			
			
		 char alpha = 'A';
		 //"A";라고하면 에러
		 
				
			int age = 29;
			System.out.println("나이 : " + age);
			
			
//			*** 변수 ***
//			변수:하나의 값을 저장할수 있는 메모리 공간
//			이름 : 최슬기
//			이름 : 홍길동
//			이름 : 홍길동
//			이메일 : tmfrl043@naver.com
//			tmfrl987@naver.com
//			나이 : 29
}
}
