
package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= null;
		FileOutputStream fos = null;
		try {
			 fis = new FileInputStream("D:\\dev117\\test\\4_inputStream.txt");//내가 직접 파일 작성
			 fos = new FileOutputStream("D:\\dev117\\test\\4_OutputStream.txt",true); //자동생성, true를 주면 한번생성된 자료에 추가되어 출력된다.
			
			int i;
			while((i=fis.read()) != -1){ //inputstream.txt데이터를 1바이트씩 읽어서 아스키 코드로 변환 파일의 끝까지
				System.out.print((char)i);//아스키값을 char형으로 변환후 화면에 출력
				fos.write(i);//input파일을읽어서 output파일에 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fis != null)fis.close();
			if(fos != null)fos.close();
		}
		
	}

}
