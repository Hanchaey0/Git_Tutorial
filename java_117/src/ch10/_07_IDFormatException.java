package ch10;

//사용자 정의 Exception	- Exception상속받아야 한다.
public class _07_IDFormatException extends Exception{

	//매개변수 생성자
	public _07_IDFormatException(String message) {
		super(message); //3 부모매개변수 생성자 호출 부모는 Exception
		
		
	}
}
