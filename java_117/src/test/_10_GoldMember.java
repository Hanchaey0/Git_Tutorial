package test;

public class _10_GoldMember extends _10_Member{

	//멤버변수
	String event;  //"GoldMember event"<생성자에서 출력
	//생성자
	public _10_GoldMember(){}
	public  _10_GoldMember(String id, String password, String name, String event){
		super(id, password, name);
		this.event = event;
	}
	//멤버메서드
	public void printInfo(){
		super.printInfo();
		System.out.println("event :"+event);
	}
}
