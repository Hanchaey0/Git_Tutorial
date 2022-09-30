package ch02;

import java.util.Scanner;

public class _07_SwitchCaseEx {
	public static void main (String[] args) {
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
		//ranking에 따른 메달색 출력
		//ranking이 1 : "금메달", 2 : "은메달", 3 : "동메달", 그외 :  참가상
		// 결과 : 2등 - 은메달

		String medalcolor = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("랭킹을 입력하세요.: ");
		int ranking = sc.nextInt();
		
		
		
		if(ranking<1) {
			System.out.println("잘못된 등수입니다.");
		}else {
			switch(ranking){
				case 1 : medalcolor = "금메달";  			
					break;
				case 2 : medalcolor = "은메달";
					break;	
				case 3 : medalcolor = "동메달"; 
					break;	
				default : medalcolor = "참가상";
			  }
		System.out.println("결과 : "+ ranking +"등 - "+medalcolor);			
		}
		sc.close();
	}
}
