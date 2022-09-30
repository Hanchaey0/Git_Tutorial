package test;

public class _15_Employee {
	//4부모멤버변수 초기화

	private String sabun; //사번
	private String name; //이름
	private String depName; //부서명
	private int salary; //급여

	//디폴트 생성자

	public _15_Employee(){}

	//부모 매개변수 생성자 : 부모멤버변수로 값 전달
	public _15_Employee(String sabun, String name, String depName, int salary){
		this.sabun = sabun;
		this.name = name;
		this.depName = depName;
		this.salary = salary;	
	}

	//멤버메서드
	public String getSabun(){
		return sabun;
	}
	public void setSabun(String sabun){
		this.sabun =sabun;
	} 
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	} 
	public String getDepName(){
		return depName;
	}
	public void setDepName(String depName){
		this.depName = depName;
	} 
	public int getSalary(){
		return salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	} 

	@Override
	public String toString(){
		return "사번 : "+sabun+", 이름 : "+name +", 사번 : "+depName+", 급여 : "+salary;
	}

}
