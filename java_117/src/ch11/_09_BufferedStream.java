package ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//545
public class _09_BufferedStream {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		FileWriter out = null;
		
		try {
		//BufferedReader 보조스트림을 이용해 읽고, 파일에 출력
		//9번예제를 9_FileReader.txt에 복사해서 저징
			in = new BufferedReader(new FileReader("D:\\dev117\\test\\9_FileReader.txt"));
			out= new FileWriter("D:\\dev117\\test\\\\9_FileWriter.txt"); //자동생성
			
			int i;
			while(( i = in.read()) != -1) {
				out.write(i);
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}finally {
			if(in != null)in.close();
			if(out != null)out.close();
		}
		System.out.println("정상종료");
		
	}
}
