package ch02;

public class _13_WhileEx {
	public static void main(String[] args) {
		/* **********
		 * * 구구단 출력 *
		 * **********
		 * === 2단 ===
		 * **********
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 
		 * ~
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * ==========
		 * === 3단 ===
		 * 3 * 1 = 2
		 * 3 * 2 = 6
		 * 
		 * ~
		 * 3 * 8 = 24
		 * 3 * 9 = 27
		 * === 9단 ===
		 * 9 * 1 = 9
		 * 9 * 2 = 18
		 * 
		 * ~
		 * 9 * 8 = 72
		 * 9 * 9 = 81
		 * ==========
		 * 		 
		 */
		
		//1. 초기값
		int dan = 2;
		System.out.println("***********");
		System.out.println("* 구구단 출력 *");
		System.out.println("***********");

		
		//2. 조건식
		while(dan<10) {
			
		System.out.println("=== "+dan+ "단 ===");

		
			//1-1.초기값
			int i = 1;
			//1-2.조건식
			while(i<10) {
				System.out.println(dan +"*"+ i +"=" +(dan*i));
					// 구구단 출력
			//1-3.증감식
				i++;
			}
				
			dan++;
		}
		//3. 증감식
		
		System.out.println("========");
	}
	
}
