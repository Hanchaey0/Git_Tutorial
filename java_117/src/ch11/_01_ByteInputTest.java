package ch11;

import java.io.IOException;
//516
public class _01_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요."); //A
		
		try {
			int i = System.in.read(); //콘솔창에서 한바이트 읽어서 아스키값 대입
			System.out.println("i : "+ i); //아스키값 출력 //65
			System.out.println((char)i); //A
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //콘솔창에서 한바이트 읽음
		
	}
}
