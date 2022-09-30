package test;

public class _10_VipMember extends _10_Member{

	//멤버변수
	String level;   //"vip";
	//디폴트 생성자
	public  _10_VipMember(){}
	//매개변수 생성자
	public  _10_VipMember(String id, String password, String name, String level){
		super(id,password,name);
		this.level = level;
	}
	//멤버메서드
	public void printInfo(){
		super.printInfo();
		System.out.println("level : "+level);
	}
}



