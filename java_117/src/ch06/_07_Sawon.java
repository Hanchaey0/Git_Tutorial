package ch06;

public class _07_Sawon extends _07_Employee{

	//멤버변수
	private int bonus;
	
	//디폴트 생성자
	public _07_Sawon() {}
	
	//매개변수 생성자
	public _07_Sawon(String sabun, String name, String depName, int Salary, int bonus) {
		super(sabun, name, depName, Salary);
		this.bonus = bonus;
	}
	//멤버메서드 getter, setter
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void calBonus (){
		System.out.println("연 보너스 :"+(super.getSalary()*12+bonus));
	}
	@Override
	//printInfo
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : "+bonus);
	}
	

}
