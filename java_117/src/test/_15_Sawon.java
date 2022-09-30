package test;

public class _15_Sawon extends _15_Employee {

	//멤버변수
	private int sudang;
	//디폴트생성자
	public _15_Sawon(){}
	//매개변수 생성자
	public _15_Sawon(String sabun, String name, String depName, int salary, int sudang){
	super(sabun, name, depName, salary);
	this.sudang = sudang;
	}
	//멤버메서드 (셋 겟 프린트인포())
	public int getSudang(){
	return sudang;
	}
	public void setSudang(int sudang){
	this.sudang = sudang;
	}
	
	public void printInfo(){
	System.out.println("사번 : " + super.getSabun());
	System.out.println("이름 :" +super.getName());
	System.out.println("부서명 : " + super.getDepName());
	System.out.println("급여 :" +super.getSalary());
	System.out.println("수당 :" +sudang);
	}
}