package ch10;

public class _08_InvalidAgeException extends Exception{
	//멤버변수
	
	private int wrongAge;
	
	//디폴트 생성자
	public _08_InvalidAgeException() {}
	//매개변수 생성자
	public _08_InvalidAgeException(String message) {
		super(message);
	}
	
	public int getWrongAge() {
		return wrongAge;
	}
	public void setWrongAge(int wrongAge) {
		this.wrongAge = wrongAge;
	}
	
	public void showWrongAge() {
		System.out.println("잘못 입력된 나이 : "+wrongAge);
	}
}
