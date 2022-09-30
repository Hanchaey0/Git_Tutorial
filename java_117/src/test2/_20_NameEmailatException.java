package test2;

public class _20_NameEmailatException extends Exception{

	String wrongemail;

	public _20_NameEmailatException(){}
	public _20_NameEmailatException(String message){
		super(message);
	}

	public void setWrongemail(String wrongemail){
		this.wrongemail = wrongemail;
	}

	public String getWrongemail(){
		return wrongemail;
	}

	public void showWrongemail(){ 
		System.out.println(wrongemail+"은 잘못된 이름입니다.");
	}
}



