package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _10_Imagecopy {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원본 파일명을 입력하세요. : ");//D:\\dev117\\filetest\\google.jpg
		String inputFileName = sc.nextLine();
		
		System.out.print("복사 파일명을 입력하세요. :  ");//D:\\dev117\\filetest\\copy_google.jpg
		String outputFileName = sc.nextLine();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inputFileName);
			fos = new FileOutputStream(outputFileName);
			int i;
			while((i=fis.read())!= -1) {
				fos.write(i);
			}
			System.out.println(inputFileName+"를 "+outputFileName+"로 복사했습니다.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally {
			if (fis != null) fis.close();
			if(fos != null)fos.close();
			sc.close();
		}
	}
}
