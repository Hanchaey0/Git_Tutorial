package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\dev117\\test\\3_inputStream.txt");

			int i;
			while((i=fis.read())!= -1){
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fis.close();
		}
	}
}
