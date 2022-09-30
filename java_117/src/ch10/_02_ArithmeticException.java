package ch10;

import java.util.Scanner;

public class _02_ArithmeticException {
		public static void main(String[] args) {
			System.out.println(" ==== 두개의 정수를 입력 ==== ");
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("첫번째 값 입력 : ");
			int num1 = input.nextInt();
			
			System.out.println("두번째 값 입력 : ");
			int num2 = input.nextInt();
			
			try {
				System.out.println("몫 : "+(num1 / num2));
				System.out.println("나머지 : "+(num1 % num2));
			}catch(java.lang.ArithmeticException e){
				System.out.println(e.getMessage());
				
			}finally {
				System.out.println(" ==== finally ==== ");
				input.close();
			}
			System.out.println("정상종료");
		}
}
