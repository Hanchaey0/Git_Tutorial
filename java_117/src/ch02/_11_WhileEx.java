package ch02;

public class _11_WhileEx {
	public static void main (String[] args) {
		/*
		 * 1~10까지 출력 => 1 2 3 4 5 6 7 8 9 10
		 * 끝
		 * ---------------------------------
		 * 1~10까지의 합계 : 55
		 */
		//1. 초기값
		
		//2. 조건식
		
		//3. 증감식
		
		int num = 1;
		int sum = 0;
		while(num<11) {
			
			sum += num;
			System.out.print(num+" ");
			num++;
		}
		System.out.println("\n끝"+"\n--------------------"+"\n1~10까지의 합계: "+sum);
	}

}
	