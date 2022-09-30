package ch11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		
		try {
		fw = new FileWriter("D:\\dev117\\test\\7_FileWriter.txt");
		fw.write('A');
		char buf[] = {'B','C','D','E','F','G'};
		
		fw.write(buf);
		fw.write(buf,1,2);
		fw.write("Have a nice day");
		fw.write("65");
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)fw.close();
		}
		System.out.println();
		System.out.println("=== end ===");
		System.out.println("=== 정상 종료 ===");
		
	}

}
