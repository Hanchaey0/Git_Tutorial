package ch06;

public class _07_sudang extends _07_Employee{

	//멤버변수
	private int sudang;
	
	//디폴트 생성자
	public _07_sudang() {}
	
	//매개변수 생성자
	public _07_sudang(String sabun, String name, String depName, int Salary,int sudang) {
		super(sabun, name, depName, Salary);
		this.sudang =sudang;
	}
	//멤버메서드 getter, setter
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public void calSudang(){
		System.out.println("연간 수당 :"+(super.getSalary()*12+sudang));
	}

	//printInfo
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : "+sudang);
	}
	

}
