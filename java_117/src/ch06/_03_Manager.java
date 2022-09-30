package ch06;

public class _03_Manager extends _03_Employee {

	private int bonus;

	//디폴트 생성자
	public _03_Manager() {}

	//매개변수 생성자
	public _03_Manager(int bounus) {
		this.bonus = bounus;
	}

	//멤버메서드(셋겟인포)
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus () {
		return bonus;
	}
	
	//오버라이드:부모 메서드를 재정의(접근제어자 반황형 메서드명이 모두 동일하고, 구현만 다르다)하며, 호출시 자식메서가 호출된다.
	@Override
		public void printInfo() {
		super.printInfo(); //부모 클래스
		
		System.out.println("보너스 : "+ bonus);

		
		}
	
}
