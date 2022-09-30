package ch02;

public class _17_ForEx {

	public static void main(String[] args) {
		
		/* for문을 이용해구구단 출력
		 * 
		 * === 2단 ===
		 * 2 * 1 = 2
		 * 2 * 9 = 18
		 * ==========
		 */
		
		int num = 1;
		int dan = 1;
		System.out.println("***********");
		System.out.println("* 구구단 출력 *");
		System.out.println("***********");
		
		for(dan=1; dan<=9; dan++) {

			System.out.println("=== "+dan+"단 ===");

		
			for(num=1; num<=9; num++) {
				System.out.println(dan+" * "+num+"= "+(dan*num));
			}
		}
		System.out.println("=============");
	}

}


