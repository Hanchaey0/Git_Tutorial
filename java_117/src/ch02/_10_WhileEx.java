package ch02;

public class _10_WhileEx {
	public static void main(String[] args){
		
		/*
		 * 반복문 : 존건식이 참인동안 계속 반복해서 수행(while문, for문)
		 * 	   1. 초기값=> 2.조건식=> 3.증감식
		 * 
		 * 초기값;
		 * while(조건식){
		 * 		수행문1;
		 * 		증감식;
		 * }
		 * 수행문2;
		 */
		
		// 출력 => GoodDay1~~ GoodDay2~~ GoodDay3~~ GoodDay4~~ GoodDay5~~
		
		int num = 1;
		
		while(num<6){
			System.out.print("GoodDay"+num+"~~ ");
			num++;
		}
		System.out.println();
		System.out.print("반복문 종료.");
	}
}
