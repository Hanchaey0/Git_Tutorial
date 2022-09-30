package ch03;

public class _01_Calculator {
	/*
	 * 함수 :  하나의 기능을 수행하는 일련의 코드
	 * 
	 * 매서드 : 클래스 안에서 정의된 함수
	 * 		  입력을 받아 처리결과를 반환하는 기능
	 * 		1) 메서드 호출시 메서드명이 일치해야한다.
	 * 		2) 매개변수 갯수와 type(자료형)이 일치해야한다
	 * 		3) return 타입도 일치해야 한다.
	 * 			단, 변수명은 달라도 상관없음.
	 * 
	 * 
	 * public 반환형(자료형) 메서드명(매개변수1, 매개변수2..){
	 * 		return 반환값    //처리결과를 리턴하며, 변환형과 일치해야한다.
	 * 	}
	 * 반환형이 void로 선언된 메서드는 결과값을 반환하지 않는다.
	 */

	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
				//result num1 + num2; 생략 가능
	}
	public double sub(double num1, double num2) {
		return num1 - num2;
	}
	public double mul(double num1, double num2) {
		return num1 * num2;
	}
	public double div(double num1, double num2) {
		return num1 / num2;

	}
	
}
