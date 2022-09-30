package ch02;

import java.util.Scanner;

//사용자가 직접 만든, 사용자 클래스
public class _05_IfEx {
	public static void main(String[]args) {
		/*
		 * 학점구하기  => 시험
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수 사용
		 * 2. 점수가 90점 이상이면 A
		 *  점수가 80점 이상이면 B
		 *  점수가 70점 이상이면 Cㄴ
		 *  점수가 60점 이상이면 D
		 *  점수가 60점 미만이면 F
		 *  100점보다 클경우, 0보다 작을경우 "잘못된 정수입니다."
		 * 3. 결과 출력 => 점수 : 80, 학점 : B
		 * 
		 */
		

		char grade = ' ';
		
		//클래스명 참조변수 = new 클래스명
		//System.In : 콘솔에서 입력받음
		//Scanner는 내장클래스이므로 import를 통해 가져온다.
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요. (0~100점) : ");
		// 참조변수. 메서드명
		// nextInt() :  콘솔에서 입력받은 정수를 읽어들임.
		int score = input.nextInt();
		
		
		if (score>100||score<0){
			System.out.println("잘못된 정수입니다.");
		}else{
		if (score>=90) {
		
			grade='A';
		}else if (score>=80){
			grade='B';
		}
		else if (score>=70) {
			grade='C';
		}
		else if (score>=60) {
			grade='D';
		}
		else { 
			grade='F';
		}
		System.out.println("점수 : "+ score+"," + "학점 : " + grade);
		}
		
		input.close(); //자원해제
	
	}
}
