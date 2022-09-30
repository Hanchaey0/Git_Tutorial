package ch02;

public class _18_ForEx {
	public static void main(String[] args) {
		
	/*
	 * 2~20까지의 짝수합계
	 * 
	 * i = 1, sum = 2
	 * i = 20, sum = 110
	 * 2~20까지의 짝수합계 : 100
	 */

		int sum = 0;
		
		for(int num=2; num<=20; num+=2) {
			sum += num;
			System.out.println("num ="+num+", sum ="+sum);
		}
		System.out.println("2~20까지의 합 : "+sum);
		
	}
}
