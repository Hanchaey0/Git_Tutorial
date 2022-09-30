    package ch02;

public class _12_WhileEx {
	public static void main (String[] args) {
		/*
		 * 구구단 출력
		 * 
		 * === 2단 ===
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 
		 * ~
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * ==========
		 */
		//1. 초기값
		int dan = 2;
		int i = 1;
		
		System.out.println("=== "+dan+ "단 ===");
		
		//2. 조건식
		while(i<10) {
			System.out.println( dan +"*"+ i +"=" +(dan*i));
			//3. 증감식
			i++;
		}
		System.out.println("========");
		 
		

	}
}
