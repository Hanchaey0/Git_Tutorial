package test;
import java.util.Scanner;
public class _01_SungjukEx{
 public static void main (String[]args){
	
	char grade = ' ';
	
	Scanner input = new Scanner(System.in);
	System.out.print("점수를 입력하세요. (0~100점) : ");
	int score = input.nextInt();
	
	if(score>100||score<0){
	System.out.println("잘못된 점수입니다.");
	}else{
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else if(score>=60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("jumsu : "+score+", "+"level : "+grade);
	}
	input.close();
 }
}