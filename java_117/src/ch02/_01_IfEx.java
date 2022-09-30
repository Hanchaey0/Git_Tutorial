package ch02;

public class _01_IfEx {
	public static void main (String[]args) {
		/*
		 <if - else if - else문>	
		
		if(조건식1) {			//조건식1이 참인경우 수행문 1 실행
			수행문1;
			
		}
		else if(조건식2) {	//조건식2가 참인경우 수행문2 실행
			수행문2;
		}
		else if(조건식3) {	//조건식3이 참인경우 수행문3 실행
			수행문3;
		}
		else {				//위의 조건이 모두 해당되지 않는 경우 수행문4 실행
			수행문4;
		}
		수행문5;		//if문 밖에 있는 수행문5는 반드시 실행
		
		*/
		int age = 8;
		//8살 이상이면 "학교에 다닌다." 출력, 그렇지 않으면 "학교에 다니지 않는다."
		if(age>=8) {
			System.out.println("학교에 다닌다.");
		}
		else {
			System.out.println("학교에 다니지 않는다");
		}
		
	}
}
