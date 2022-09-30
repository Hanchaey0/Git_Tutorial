package test2;

public class _20_IDFormatException extends Exception {

	private String wrongid;

	public _20_IDFormatException() {}

	public _20_IDFormatException (String message){
		super(message);
	}

	public void setWrongid(String wrongid){
		this.wrongid = wrongid;
	}

	public String getWrongid(){
		return wrongid;
	}

	public void showWrongID() {

		System.out.println(wrongid+"은 잘못된 ID입니다.");
	}
}