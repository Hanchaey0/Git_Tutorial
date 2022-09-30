package ch10;
//사용자 정의 Exception - Exception 상속
public class _08_InvalidNameException extends Exception	{
	private String wrongName;
	
	//디폴트 생성자
	public _08_InvalidNameException() {}
	
	//매개변수 생성자
	public _08_InvalidNameException(String message) {
		super(message);
	}
	
	public void setWrongName(String worngName) {
		this.wrongName = wrongName;
	}
	public String getWrongName() {
		return wrongName;
	}
	public void showWrongName() {
		System.out.println("잘못 입력된 이름 : "+wrongName);
	}

}
