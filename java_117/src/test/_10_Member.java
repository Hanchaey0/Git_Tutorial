package test;

public class _10_Member{
	//본인정보 넣어서 출력
	//멤버변수
	String id;
	String password;
	String name;

	//디폴트 생성자
	public _10_Member(){}
	//매개변수 생성자
	public _10_Member(String id, String password, String name){
		this.id = id;
		this.password = password;
		this.name = name;
	}
	//멤버변수

	public void printInfo(){
		System.out.println("id : "+id+", password : "+password+", name : "+name); 
	}
}