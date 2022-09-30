package ch04;

public class _01_Student {
	
		/*
		 *클래스 : 객체에 대한 설계도, 디자인
		 *	- 멤버변수(속성, 명사) + 멤버 메서드(기능, 동작)
		 */
		
		//멤버변수(속성)
		//학번, 이름, 주소, 이메일
		
		String studentID; //100
		int grade;	//1
		String name;	//"홍길동";
		String address;
		String email;
	
		//멤버 메서드(가능)
		
		public void printInfo() {
			System.out.println("학번 : " + studentID);
			System.out.println("학년 : " + grade);
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + address);
			System.out.println("이메일 : " + email);
			
	}
}
