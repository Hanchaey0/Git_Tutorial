package test;

public class _14_BookInfo {
	//멤버변수

	private String registerNo; //등록번호
	private String title; //타이틀
	//생성자
	public _14_BookInfo(){}
	public _14_BookInfo(String registerNo, String title){
		this.registerNo = registerNo;
		this.title = title;
	}
	//멤버메서드

	public String getRegisterNo(){
		return registerNo;
	}

	public void setRegisterNo(String registerNo){
		this.registerNo = registerNo;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}
}
