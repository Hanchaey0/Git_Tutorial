package ch02;

import java.util.Scanner;

public class _09_SwitchCaseEx {
	public static void main(String[] args) {
		
		//숫자입력=>num에 대입 =>num이 1:하나, 2~4 두서넛, 5~6 대여섯, 그외 : 많음
		String name = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();
		
			switch(num) {
				case 1 : name = "하나";
					break;
				case 2 : 
				case 3 : 
				case 4 : name = "두서넛";
					break;
				case 5 : name = "대여섯";
				case 6 :
				default : name = "많음";
			}
			System.out.println(num+":"+name);
	}
}
