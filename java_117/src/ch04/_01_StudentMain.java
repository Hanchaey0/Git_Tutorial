package ch04;

//import java.util.Scanner;

public class _01_StudentMain {
	public static void main (String[] args) {
		//클래스 생성 : 클래스를 실제 사용할 수 있도록 new연산자를 이용해
		//		메모리 공간 (힙메모리)에 올린다. =>실체화
		//인스턴스 : 실체화된 클래스
		//참조변수 : 인스턴스를 가리키는 클래스형 변수
		//클래스는 설계도이며, 이 설계도를 바탕으로 만들어진 힙메모리 공간(=인스턴스이자 객체)
		//클래스>아파트 설계도, 인스턴스(객체)힙메모리공간은 실제 지어진 아파트.
		//클래스=멤버변수+생성자+멤버메서드
		//참조변수, 멤버변수
		//참조변수, 멤버메서드
		
		//클래스명 참조변수 = new 클래스명();

	
	//클래스명 참조변수 = new 클래스명();

		
	_01_Student kth = new _01_Student();
	kth.studentID = "S001";
	kth.grade = 2;
	kth.name = "최슬기";
	kth.address = "서울특별시 독산동 벚꽃로 20길";
	kth.email = "tmfrl043@naver.com";
	
	kth.printInfo();
	
	System.out.println("============");
	
	_01_Student sg = new _01_Student();
	sg.studentID = "S002";
	sg.grade = 1;
	sg.name = "이슬아";
	sg.address = "벚꽃로21길";
	sg.email = "4seul1@daum.net";
	
	sg.printInfo();
	
	}
}
