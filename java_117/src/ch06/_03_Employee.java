package ch06;

public class _03_Employee  {

	
	//멤버변수
	private String sabun; 	//사번
	private String name;	//이름
	private String depName;	//부서명
	private int salary;	//급여

	//디폴트 생성자
	
	//매개변수 생성자
	//멤버메서드 (셋,겟,프린인포)
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepName() {
		return depName;
	}	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void printInfo() {
		System.out.println("이름 : "+name+", 부서명 : "+depName+", 급여 : "+salary);
	}
}
