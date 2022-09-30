package ch04;

import java.util.Scanner;

public class _02_SungjukMain {
	public static void main(String[] args) {
	
		//int kor = 100;
		//int eng = 90;
		//int math = 80;

		Scanner i = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = i.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = i.nextInt();
	
		System.out.print("수학 점수 : ");
		int math = i.nextInt();
		i.close();
		
		
		//방법1. setter를 이용한 값 설정
		System.out.println("방법1. setter를 이용한 값 설정");
		
		_02_Sungjuk s1 = new _02_Sungjuk();
		s1.setKor(kor);
		s1.setEng(eng);
		s1.setMath(math);
		s1.printInfo();


		
		//방법2. 매개변수 생성자를 이용한 값 설정
		System.out.println("방법 2. 매개변수 생성자를 이용해서 멤버변수에 값 전달");
		_02_Sungjuk s2 = new _02_Sungjuk(kor,eng,math);

		s2.printInfo();
		

	}
}