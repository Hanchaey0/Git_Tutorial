package ch01;

public class _07_OperatorEx {
	public static void main(String[]args) {
		/*
		 * 연산
		 * 1.	사칙연산자
		 */
		System.out.println("=== 사칙 연산자 ===");
		
		int num1 = 8;		//변수선언, 초기화
		int num2 = 4;		//변수선언, 초기화
		
		int addResult = num1 + num2;
		int subResult = num1 - num2;
		int mulResult = num1 * num2;
		int divResult = num1 / num2;
		int modResult = num1 % num2;
		
		System.out.println("addR : " + addResult);
		System.out.println("subR : " + subResult);
		System.out.println("mulR : " + mulResult);
		System.out.println("divR : " + divResult);
		System.out.println("modR : " + modResult);
		
		/*
		 * 연산
		 * 2.	증감연산자
		 * 1)  전위연산자 : y = ++x; 	=>	x값을 1증가 시키고, 증가한 값을 대입 시킨다.
		 * 2)  후위연산자 : y = x++; 	=>	x값을 먼저 y에 대입한 후, x값을 1증가 시킨다.
		 */
		System.out.println("=== 증감 연산자 ===");
		
		//전위연산자
		int c = 5 ;
		int nextC = ++c;
		System.out.println("C : " + c );  // c : 6
		System.out.println("nextC : " + nextC); // nextC : 6
		
		//후위연산자
		int d = 5 ;
		int nextD = d++; 		// d++ => ;
		System.out.println("d : " + d ); 			// d : 6
		System.out.println("nextD : " + nextD ); 		// d : 5
		
		int  e = 2 , f = 3 , result = 0;
		System.out.println(++e + --f * e--);  	// 3+2*3 =9
		System.out.println("e : "+ e);  // 2 => 후위연산자 작동
		System.out.println("f : " + f); // 2 => 전위연산자 작동
		
		
		 result = ++e + --f * e--;
		System.out.println("result : " + result);  	// 6=3+1*3
		System.out.println("e : "+ e);  // 2
		System.out.println("f : " + f); // 1  
		
		/*
		 * 연산
		 * 3.	복합연산자
		 * 1)  
		 */
		System.out.println("=== 복합 연산자 ===");
		
		int ii = 5;
		ii += 10;  // ii = ii + 10; 15
		
		System.out.println("ii = " + ii);
		
		ii -= 10; // ii = ii -10 ; 5 (15 - 10)
		System.out.println("ii = " + ii);
		
		ii *= 10; // ii = ii * 10 ; 50 (5 * 10)
		System.out.println("ii = " + ii);
		
		ii /= 10; // ii = ii / 10 ; 5 ( 50 / 10 )
		System.out.println("ii = " + ii);
		
		/* 
		 *연산
		 *4. 관계연산자 : 같다(==), 같지않다(!=), >, <, >=, <=
		 *		- 결과값은 boolean 타입 : 참(true), 거짓(false) 
		 */
		System.out.println("=== 관계 연산자 ===");
		int c1 = 10;
		int c2 = 20;
		
		System.out.println("c1 == c2 : " + (c1 == c2));  	// c1 == c2 : false
		System.out.println("c1 != c2 : " + (c1 != c2));  	// c1 != c2 : true
		System.out.println("c1 > c2 : " + (c1 > c2));  	// c1 > c2 : false
		System.out.println("c1 < c2 : " + (c1 < c2));  	// c1 < c2 : true
		System.out.println("c1 >= c2 : " + (c1 >= c2));  	// c1 > c2 : false
		System.out.println("c1 <= c2 : " + (c1 <= c2));  	// c1 > c2 : true

		/* 
		 *연산
		 *5. 논리연산자 : 1=>참(true), 0=>거짓(false)
		 *		&&(논리곱) :x && y => x와 y 모두 참이면 참, 그렇지 않으면 거짓
		 *		||(논리합) :x || y => x와 y 중 하나만 참이면 참, 모두 거짓이면 거짓
		 *
		 */
		System.out.println("=== 논리연산자 ===");
		
		int z1 = 4, y1 = 5;
		System.out.println((z1 == 4) && (y1 == 5));  //T && T = T
		System.out.println((z1 == 4) && (y1 ==10));  //T && F= F
		System.out.println((z1 == 4) || (y1 == 7));  //T || F = T
		System.out.println((z1 == 8) || (y1 == 8));  //F || F = F
		
		
				
	}
	
}
