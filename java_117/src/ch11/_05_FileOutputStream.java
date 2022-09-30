package ch11;

import java.io.FileOutputStream;
import java.io.IOException;

//529p
public class _05_FileOutputStream {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("D:\\dev117\\test\\5_FileReader.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
