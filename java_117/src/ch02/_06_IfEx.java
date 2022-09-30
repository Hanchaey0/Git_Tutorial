package ch02;

import java.util.Scanner;

public class _06_IfEx {
	public static void main (String[]args) {
		
		/*
		 * 나이를 입력받는다. : age
		 * 입장료 : charge , 단계 : grade
		 *  나이 잘못 입력한경우 "나이를 다시 입력하세요."
		 
		 * 1~8세 => grade : "미취학아동", charge : 1000
		 * ~13세 => grade : "초등학생", charge : 2000
		 * ~19세 => grade : "청소년", charge : 3000
		 * ~64세 => grade : "일반인", ADULT_CHARGE(변하지 않는 수, 상수처리) : 4000
		 * ~65세  이상 => grade : "경로우대", ADULT_CHARGE의 20% 할인 : charge에 대입
		 * 출력형식 => 나이 : 5세이며, grade : 미취학아동, 입장료 : 1000원
		 * 
		 */
		int charge = 0;
		String grade = "";
		int ADULT_CHARGE = 4000; //상수
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요. (1~):");
		int age = scan.nextInt();
		
		if(age<=0) {
			System.out.print("나이를 다시 입력하세요.");	
		}else{
			if(age<=8) {
				grade = "미취학아동";
				charge = 1000;
			}else if (age<=13){
				grade = "초등학생";
				charge = 2000;
			}else if (age<=19){
				grade = "청소년";
				charge = 3000;	
			}else if (age<=64){
				grade = "일반인";
				charge = ADULT_CHARGE;
			}else{
				grade = "경로우대";
				charge = ADULT_CHARGE*(int)(0.8); //int *double => doubel=>int에 대입해야 하므로 강제 형변환
			}
			System.out.println("grade : " + grade + ", charge :" + charge + "원");
		}		
		scan.close();	


	}
}

	

