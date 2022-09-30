package test;
import java.util.Scanner;
 public class Switch{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("점수를 입력하세요. (0~100점) : ");
	int score = scan.nextInt();
	char grade = ' ';

	if(score > 100 || score < 0){
	System.out.println("맞지 않는 점수입니다.");
	}else{
	switch(((int)score)/10){
		case 10:
		case 9:
			grade = 'A';
			break; 
		case 8:
			grade = 'B';
			break; 
		case 7:
			grade = 'C';
			break; 
		case 6:
			grade = 'D';
			break; 
		default:
			grade = 'F';
		}
	System.out.println("점수 : " + score + " 학점  : " + grade);
	}
	scan.close();
       }
}
