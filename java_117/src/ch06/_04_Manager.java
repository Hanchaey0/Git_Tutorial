package ch06;
//자식클래스
public class _04_Manager extends _04_Employee {
	//멤버변수
	private int bonus;   	//보너스
	//디폴트생성자
	public _04_Manager() {
		//super();  부모 디폴트 생성자 호출
		System.out.println("자식 디폴트 생성자 호출"); //부모 디폴트 생성자를 먼저 호출
	}
	//매개변수 생성자
	public  _04_Manager( String sabun, String name, String depName, int salary, int bonus) {
		//2. 자식의 매개변수 생성자 -> 부모 매개변수 생성자 호출
		super (sabun, name, depName, salary);//첫줄에 기술해야함 : 값을 변경못하도록 하기 위해
		System.out.println("자식 매개변수 생성자 호출");
		this.bonus = bonus;
	}
	//멤버메서드
	public int getBonus () {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("보너스 : "+bonus);
	}
}
