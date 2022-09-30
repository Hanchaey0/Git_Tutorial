package ch13;

//465

// @FunctionalInterface : 함수형 인터페이스
// -> 하나의 메서드만 선언가능(람다식은 메서드 이름이 없는 익명함수로 구현)이므로 실수로 하나 이상 선언시 컴파일에게 오류를 발생시키도록 한다.
@FunctionalInterface
public interface _01_StringConcat  {
	public void makeString(String s1, String s2);
	
}
