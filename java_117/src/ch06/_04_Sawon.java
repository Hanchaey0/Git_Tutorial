package ch06;

public class _04_Sawon extends _04_Employee {
	/* p244       * super : 부모의 참조변수      
	 *  - 하위클래스에서 상위클래스로 접근할 때 사용한다.      
	 *    하위클래스는 상위클래스의 주소, 즉 참조값을 알고 있다.       
	 *    예) super.printInfo();      
	 *  - 상위클래스의 생성자를 호출할 때도 사용한다.       
	 *   예) super();  // 부모 디폴트 생성자      
	 *    예) super(sabun, name, deptName, salary);  // 부모 매개변수 생성자      
	 *    cf) this : 자기자신의 주소값       
	 */
	int sudang;
	public _04_Sawon() {}
	
	public _04_Sawon(String sabun, String name, String depName, int salary, int bonus, int sudang) {
		super (sabun, name, depName, salary);
		this.sudang = sudang;

	}
	
	public void setSudang (int sudang) {
		this.sudang =sudang;
	}
	public int getSudang() {
		return sudang;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("수당 : "+sudang);
	}
//	부모 디폴트 생성자 호출
//	자식 디폴트 생성자 호출
//	====== [ Manger 출력 ] =====
//	부모 매개변수 생성자 호출
//	자식 매개변수 생성자 호출
//	사번 : S001, 이름 : 김태희, 부서명 : IT, 급여 : 2500000
//	보너스 : 500000
//	====== [ Sawon 출력 ] =====
//	부모 매개변수 생성자 호출
//	자식 매개변수 생성자 호출
//	사번 : S002, 이름 : 홍길동, 부서명 : IT, 급여 : 2000000
//	보너스 : 450000
}