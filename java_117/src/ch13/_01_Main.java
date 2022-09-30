package ch13;

//467
public class _01_Main {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world!";
		//인터페이스명 참조변수 = (매개변수1, 매개변수2 .. .)->구현부 
		_01_StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString("Hello", "world!");
		
		
		
		
	}
	

}
