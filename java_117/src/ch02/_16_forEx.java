package ch02;
import java.util.Scanner;
public class _16_forEx {
	public static void main(String[] args) {
		
		/* for문을 이용해 단을 입력 받아서 구구단 출력
		 * 단을 입력하세요 : 2
		 * === 2단 ===
		 * 2 * 1 = 2
		 * 2 * 9 = 18
		 * ==========
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요. : ");
		int dan = scan.nextInt();
		int num = 1;
		
		System.out.println("=== "+dan+"단 ===");
		
		for(num=1; num<=9; num++) {

				System.out.println(dan+" * "+num+"= "+(dan*num));
			}
		System.out.println("=============");
		scan.close();
	}

}


