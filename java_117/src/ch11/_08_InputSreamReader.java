package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//541p
public class _08_InputSreamReader {
	//8_inputStream.txt : 안녕하세요 저장
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\dev117\\test\\8_inputStream.txt"))){
			int i;
			while((i = isr.read())!= -1){
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
