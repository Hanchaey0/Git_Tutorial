package ch11;

import java.io.IOException;

public class _02_ByteInputTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요.");
		
		while(true) {
			try {
				int i = System.in.read();
				if(i == 13) { //10 줄바꿈 13엔터
					System.out.println("출력완료");
					break;
				}
				System.out.println((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //데이터를 1byte씩 읽어서 아스키값으로 저장
			
		}
	}

}
