package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_IOException {
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D:\\dev117\\file\\a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //에러정보를 알려주는 것
			System.out.println("e.getMessage() : "+e.getMessage());
		}finally {
			if(fis != null)
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("finally 문장이므로 항상 수행합니다.");
		System.out.println("정상종료");
	}
}
