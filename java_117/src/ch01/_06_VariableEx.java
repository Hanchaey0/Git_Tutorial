package ch01;

public class _06_VariableEx {
	public static void main (String []args) {
		
		
		/*
		 * 형변환 -1
		 * 
		 * 소->	대 : 자동형변환 : 묵시적 형변환, 확대 형변환 = 형변환 생략 가능
		 * 대->	소:  강제형변환 : 명시적 형변환, 축소 형변환 = 형변환 생략 불가능 =>자료손실이 발생 
		 * 
		 * 1. 자동 형변환 : 묵시적 형변환 => 형변환 생략 가능
		 * 		- 데이터 큰 타입 = 데이터 작은 타입;			//큰타입으로 바꾼 후 대입
		 * 			(ex. float f=10;		 //		float f = 10.0f;)
		 * 		- 자료형이 다른 값을 연산하는 경우 하나의 큰타입 자료형으로 통일 후 대입
		 *		 	(ex. double d = 10.0 + 30;			// double d = 10.0 + 30.0;)
		 *
		 *	 2. 강제 형변환 : 명시적 형변환 => 형변환 생략 불가이며, 생략시 컴파일 에러가 발생하므로 반드시 형변환해야 한다.
		 * 		- 데이터 작은 타입 = 데이터 큰 타입;			//작은 타입으로 바꾼 후 대입
		 * 			(ex. int num1=10.0f;		 //		int num1=(int)10.0f ;)
		 * 		- 자료형이 다른 값을 연산하는 경우 하나의 작은 타입 자료형으로 통일 후 대입
		 *		 	(ex. int num1 = 10.0 + 30;			// int num1 = 10.0 +30;)
		 * 	 		
		 * 
		 */
		System.out.println("====형변환 - 1 ====");
		//1. 자동 형변환 : 묵시적 형변환 => 데이터 큰 타입 = 데이터 작은 타입; 형변환 생략 가능
		double dVal = 20;
		System.out.println("dVal : " + dVal);		//dVal : 20.0
		
		float fVal = 20.5f + 10;
		System.out.println("fVal : " + fVal);		//fVal : 30.5
		
		double d = 10.0 + 30;	
		System.out.println("d : " + d); 		//d : 40.0
		
		//2. 강제 형변환 : 명시적 형변환 => 형변환 생략 불가
		int iVal = (int)10.5;
		System.out.println("iVal : "+ iVal);
	
		//Typt mismatch : cannot convert from double(대) to int (소)
		int num1 = (int)10.0 + 30;  		// =>10+30
		System.out.println("num1 : " +num1);		// num1 : 40
		
		
		/*
		 * 형변환 -2
		 * 3. int(4바이트)보다 작은 자료형(char, byte, short)은 int형으로 형변환 후 계산
		 * 		예) byte + short => int + int;
		 * 
		 * 4. 두개의 피연산자 중 표현범위가 큰 쪽에 맞춰서 형변환 후 계산
		 
		 */
		System.out.println("====형변환 - 2 ====");
		int iVal2;
		double dVal2;
		
		iVal2 = 5 / 4;		// int = int / int
		System.out.println("iVal2 : " + iVal2);	//	iVal2 : 1(원래결과가 1.25지만 int이므로 1)
	
		dVal2 = 5 / 4;		// double = int / int => 1.25 => 1 (원래결과가 1.25지만 doubl1이므로 1.0)
		System.out.println("dVal2 : " + dVal2);	//	dVal2 : 1.0 
	
		iVal2 = (int)(2.5 + 3.2); //int Val2 = (int)(double + double) =>(int)(5.7)=>5
		System.out.println("iVal2 : " + iVal2); 	//iVal2 : 5
		
		System.out.println("==============");
		
		int gg = 1000000;
		int jj = 1000000;
		long ll = 2000000L;
		
		int num2 = gg * jj;
		//	int형 범위 (-21억~ +21억) 초과상태
		System.out.println("num2 : " +num2); 		// num2 : -727379968
		
		long num3 = gg * jj;
		//	연산 후 대입=>long형으로 대입하기 전부터 연산결과가 int형 범위 초과
		System.out.println("num3 : " +num3); 		// num3 : -727379968
		
		long num4 = (long)(gg * jj);
		//	연산 후 형변환 해서 대입 => long형으로 형변환하기 전부터 연산결과가 int형 범위 초과
		System.out.println("num4 : " +num4); 		// num4 : -727379968
		
		// 형변환 -2, 4. 두개의 피연사 중 표현범위가 큰 쪽에 맞춰서 형변환 후 계산
		
		long num5 = (long)gg*jj; 	//long * lnt \ long * long
		System.out.println("num5 : " + num5); 	// num5 : 1000000000000
		
		
		
		
	}

}
