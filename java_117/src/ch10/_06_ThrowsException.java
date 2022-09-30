package ch10;

import java.util.Scanner;

public class _06_ThrowsException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//readAge() : 나이출력
		//입력받은 나이가 0세 미만이면 예외발생(arithmaticException)
		try {
			int age = readAge();
			System.out.println("Age: "+age);
		}catch(Exception e) {
			System.out.println("예외 메시지 : "+e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("정상종료");
	}

	static int readAge() throws ArithmeticException{

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age < 1 ) {
			throw new ArithmeticException("0세 미만입니다");

		}else {
			return age;
		}
	}
}




