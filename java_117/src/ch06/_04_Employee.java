package ch06;

public class _04_Employee {
	
	
	//4. 멤버변수 초기화
	private String sabun; 		//사번
	private String name;		//이름
	private String depName;		//부서명
	private int salary;		//급여
	
	//디폴트 생성자
	public _04_Employee() {
		System.out.println("부모 디폴트 생성자 호출");
	}
	

	//3.부모 매개변수 생성자 : 멤버변수 초기화
	public _04_Employee(String sabun, String name, String depName, int salary) {
		System.out.println("부모 매개변수 생성자 호출");
	
		this.sabun = sabun;
		this.name = name;
		this.depName = depName;
		this.salary = salary;
	}
	//멤버메서드
	public void setSabun(String sabun) {
		this.sabun =sabun;
	}
	public String getSabun() {
		return sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName =depName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void showInfo() {
		System.out.println("사번 : "+sabun+", 이름 : "+name+", 부서명 : "+depName+", 급여 : "+salary);
	}
}
