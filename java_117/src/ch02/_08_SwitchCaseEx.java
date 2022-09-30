package ch02;

import java.util.Scanner;

public class _08_SwitchCaseEx {
	
	public static void main(String[] args) {
		/*
		 * switch(조건)	}	//조건 : 변수, 수식
		 *  case 값1 : 수행문1;
		 * 			  break;
		 * 			    수행문2;
		 * 			  break;
		 * 			    수행문3;
		 * 			  break;
		 * 	default : 수행문4;
		 *
		 * 	}
		 */
		char grade = ' ';
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요. (0~100점) : ");
		int score = input.nextInt();
		
		if(score>100||score<0) {
			System.out.println("올바른 점수가 아닙니다.");
		}else {
			switch((int)score/10) {
				case 10:
					
				case 9:
					grade = 'A';
					break;
				case 8:
					grade ='B';
					break;
				case 7:
					grade ='C';
					break;
				case 6:
					grade ='D';
					break;
				default:
					grade ='F';
					break;
				case 2 : grade = 'A';
					break;								
		}		
		System.out.println("점수 : "+ score+"," + "학점 : " + grade);	
		}
		input.close();
	}

}
