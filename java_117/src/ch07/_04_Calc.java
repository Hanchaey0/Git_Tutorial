package ch07;

//인터페이스 : 부모
public interface _04_Calc {
	//상수
	double PI = 3.14; 		//public static final이 생략돼있다
	int ERROR = -999999999;	 //public static final이 생략돼있다
	//추상메서드
	
	int add(int num1, int num2);
	int substract (int num1,  int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
}
