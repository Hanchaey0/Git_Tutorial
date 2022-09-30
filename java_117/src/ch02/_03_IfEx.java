package ch02;

public class _03_IfEx {
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
		/*
		 * 방법1. If문을 이용
		 * score가 60점 이상이면 "점수 : 합격", 60점 미만이면 "점수 : 불합격", 40점 미만이면 "점수 : 과락"
		 */
		
		int score =20;
		String result="";
		
		if(score >= 60) {
			result="합격"	;
		}//else if(score >= 40) {  //40~59
		else if ((score<60)&&(score>=40)) {
			result="불합격";
		}else {
			result="과락";
		}
		System.out.println(score + "점: " + result);
		
		
		/*
		 * 방법3. 상항연산자를 이용
		 * 결과 = 조건식 ? 참 결과 :  거짓 결과; //반드시 결과에 대입하지 않으면 문법 오류
		 * score가 60점 이상이면 "점수 : 합격", 60점 미만이면 "점수 : 불합격", 40점 미만이면 "점수 : 과락"
		 * score, result 변수를 이용해 출력
		 * 
		 */
		
		
		result = (score>=60) ? "합격" : ((score<40) ? "과락" : "불합격");
		System.out.println(score + "점:" + result);
		
		}
		

	}
	


	
