package ch02;

import java.util.Scanner;

public class _22_Dowhile {
	public static void main(String[] args){
	
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 수정");
		System.out.println("3.데이터 삭제");
		System.out.println("4.데이터 조회");
		System.out.println("5.프로그램 종료");
		System.out.println("선택 : ");
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		int num = 1;
		int sum = 1;
		
		do {
			sum += num;
			num++;
		
		}
		while(num<= 1); {
		System.out.println("1부터 10까지의 합 : ");
		switch(choice) {
		case 1 : System.out.println("1");
			break;
		case 2 : System.out.println("2");
			break;
		case 3 : System.out.println("3");
			break;
		case 4 : System.out.println("4");
			break;
		case 5 : System.out.println("종료");
			break;
			}
		}
		
		
		
	}
	
	
}
