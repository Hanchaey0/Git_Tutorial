package ch13;

//470 매개변수로 전달하는 람다식
interface PrintString{
	void showString(String str);
}

public class _02_TesetLamda {
	public static void main(String[] args) {


		//인퍼테이스명 참조변수 = (인터페이스를 오버라이드 한)자식클래스의 메서드 -> 구현부;
		PrintString lamdaStr = (String s) -> System.out.println(s); //람다식이 자식클래스
		lamdaStr.showString("hello lamda_1"); //추상메서드 호출 
		showString(lamdaStr);
	}
	public static void showString(PrintString p) { // PrintString p = lamdaStr; 인터페이스의 주소값을 인터페이스의 p로 넣었다.

		p.showString("hello lamda_2");
	}
}


