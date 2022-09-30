package test2;
import java.util.Scanner;
public class _19_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//메인에서 스캐너를 넣어야하는 걸 몰랐음.. try틀림
		
		_19_Age a = new _19_Age();
		try{
			System.out.println("나이를 입력하세요 : ");
			int n = sc.nextInt();
			a.setAge(n);  //에이지 입력을 못함
		}catch(_19_AgeException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("====finally====");
		}
	}
}
