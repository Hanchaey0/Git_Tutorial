package ch02;

public class _02_IfEx {
	public static void main(String[]args) {
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
		
		int num = -5;
		String result ="";
		
		/// 퀴즈 : num이 (양수/음수/0)인지 판단 => 결과 출력 =>  -5는 음수
		if(num>0) {
			result="양수";
		}else if(num == 0) {
			result="0";
		}else {
			result="음수";	
		}
		System.out.println(num + "는 " + result);			
		
		
	}
}
