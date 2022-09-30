package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _04_IOException {
public static void main(String[] args) throws FileNotFoundException {
	
/*
 * 예외처리 미루기 = throws 사용하기
 * - 예외를 해당 메서드에서 처리(try-catch)하지 않고 미룬 후, 
 * 메서드를 호출하여 사용하는 부분(부모메서드, 여기에서는 JVM에게 떠넘김)에서 예외를 처리하는 방법이다.
 * throws ~Exception
 */
	FileInputStream fis = null;

		fis = new FileInputStream("D:\\dev117\\file\\a.txt"); //b파일은 없으니까 정상종료 x, a파일은 존재해서 가능
	
		System.out.println("정상종료");

}

}

