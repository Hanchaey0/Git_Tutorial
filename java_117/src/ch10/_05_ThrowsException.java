package ch10;

import java.util.Scanner;

public class _05_ThrowsException {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {//try catch하지 않고, throws Exception : JVM에게 떠넘긴다
		//
		//입력받은 이름이 2자미만이면 예외발생
		//3.예외 처리 : try~catch~finally
		try {
			String name = readName();
			System.out.println("name : "+name);
		}catch(Exception e) { //던진 걸 받는 것. 똑같이 적어줘야함Exception 밑에서 만든 걸 받는데 메세지를 받아옴 "이름은2글자이상입니다~"
			System.out.println("예외메세지 : "+e.getMessage());
		}finally {
			input.close();
		}
		System.out.println("정상종료");
	}
//자식에서 메인으로 떠넘긴다. 자식이 직접 처리하는 게 좋긴 하다.
	static String readName() throws Exception{ //만들어서 던지고 위에서 받음 

		System.out.println("이름을 입력하세요 : ");
		String name = input.next();
		if(name.length() < 2){
			//1.강제 예외 발생 :  throw new Exception("message");
			throw new Exception("이름은 2글자 이상입니다~");
		}else{
			return name;
		}
	}
}
