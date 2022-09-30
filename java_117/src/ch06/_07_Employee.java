package ch06;

public class _07_Employee {

	//멤버변수
	private String sabun;
	private String name;
	private String depName;
	private int Salary;
	
	//디폴트 생성자
	public _07_Employee() {}
	
	//매개변수 생성자
	public _07_Employee(String sabun, String name, String depName, int Salary) {
		this.sabun = sabun;
		this.name = name;
		this.depName = depName;
		this.Salary = Salary;
	}
	//멤버메서드 getter, setter
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
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
		this.depName = depName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary =Salary;
	}

	//printInfo
	public void printInfo() {
		System.out.println("사번 : "+sabun+", 이름 : "+name+", 부서명 : "+depName+", 급여 : "+Salary);
	}
	

}
