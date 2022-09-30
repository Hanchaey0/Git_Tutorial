package test;
import java.util.Scanner;
 public class _07_SungjukMain{
	public static void main(String[] args){

	Scanner i = new Scanner(System.in);
	System.out.print("음악 : ");
	int music = i.nextInt();
	System.out.print("역사 : ");
	int history = i.nextInt();
	System.out.print("화학 : ");
	int chemistry = i.nextInt();
	i.close();
	
	System.out.println("*** 성적 출력 ***");

	//1. setter
	System.out.println("1. setter를 이용한 값 전달");
	_07_Sungjuk sc1 = new _07_Sungjuk();
	sc1.setMusic(music);
	sc1.setHistory(history);
	sc1.setChemistry(chemistry);
	sc1.printInfo();
	System.out.println("=================");

	//2.
	System.out.println("2. 매개변수를 이용한 값 전달");
	_07_Sungjuk sc2 = new _07_Sungjuk(music,history,chemistry);
	sc2.printInfo();
	System.out.println("=================");
	}
}

	




