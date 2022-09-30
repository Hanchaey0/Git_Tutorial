package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//536
public class _06_FileReader {
	public static void main(String[] args) throws IOException {

		//문자열로 읽어서 콘솔출력
		//한글이 2byte이므로 FileReader사용
		FileReader fr = null;
		try {
			//파일 직접 생성(파일의 내용작성 후 저장, 저장시 인코딩을 UTF-8로 저장한다.
			fr = new FileReader("D:\\dev117\\test\\6_FileReader.txt");
			
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) fr.close();
		}
		System.out.println();
		System.out.println("=== end ===");
		System.out.println("=== 정상종료 ===");
	}


}

