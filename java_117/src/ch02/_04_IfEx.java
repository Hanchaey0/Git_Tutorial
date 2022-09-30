package ch02;

public class _04_IfEx {
	public static void main(String[]args) {
		/*
		 * 학점구하기
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수 사용
		 * 2. 점수가 90점 이상이면 A
		 *  점수가 80점 이상이면 B
		 *  점수가 70점 이상이면 C
		 *  점수가 60점 이상이면 D
		 *  점수가 60점 미만이면 F
		 *  100점보다 클경우, 0보다 작을경우 "잘못된 정수입니다."
		 * 3. 결과 출력 => 점수 : 80, 학점 : B
		 * 
		 */
		
//		int score =120;
//		char grade = ' ';
		
//	
//		}else if (score>=90) {
//			grade='A';
//		}else if (score>=80){
//			grade='B';
//		}else if (score>=70) {
//			grade='C';
//		}else if (score>=60) {
//			grade='D';
//		}else { 
//			grade='F';
//		}
//		System.out.println("점수 : "+ score +"," + " 학점 : " +grade);

		
		int score =-15;
		char grade = ' ';
		
		/*
		 * ||:논리합 : OR(또는)
		 * &&:논리곱 : AND(이면서)
		 */
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
		}//else안에 있어야 함.. 

	}
}
