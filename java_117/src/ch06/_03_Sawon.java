package ch06;

public class _03_Sawon extends _03_Employee {
	
	//자식클래스

	
	//멤버변수
	private int sudang;
	
	//디폴트
	public _03_Sawon() {}
	//매개
	public _03_Sawon(int sudang) {
		this.sudang = sudang;
	}
	
	//멤버메서드
	public void setSudang (int sudang) {
		this.sudang =sudang;
	}
	public int getSudang() {
		return sudang;
	}
	@Override
	/* p250 [면접] 오버로드 vs 오버라이드    
	 * @Override 어노테이션 : "이 메서드는 재정의된 메서드입니다."라고 컴파일러에게 명확히 알려주는 역할을 한다."    
	 * 오버라이딩(=재정의)    
	 * - 자식클래스의 메서드가 부모클래스의 메서드를 오버라이드(재정의)한다라고 말한다.    
	 * - 상속에서 부모클래스의 메서드를 변경하고자 할 때 사용한다.    
	 * - 메서드 이름, 매개변수, 매개변수 자료형, 반환형까지 모두 동일해야한다.    
	 *   (동일하지 않으면 컴파일러가 다른 메서드로 인식한다.)    
	 * - 호출시 오버라이딩한 자식메서드가 호출된다.    
	 *   (오버라이드 목적 : 부모클래스의 메서드를 변경해서 자식쪽에서 호출하고자 하는 의도)    
	 *   사전적인 의미 : 부모메서드의 기능을 무시한다.    
	 */
	public void printInfo() {
		/* p244       * super : 부모의 참조변수      
		 *  - 하위클래스에서 상위클래스로 접근할 때 사용한다.      
		 *    하위클래스는 상위클래스의 주소, 즉 참조값을 알고 있다.       
		 *    예) super.printInfo();      
		 *  - 상위클래스의 생성자를 호출할 때도 사용한다.       
		 *   예) super();  // 부모 디폴트 생성자      
		 *    예) super(sabun, name, deptName, salary);  // 부모 매개변수 생성자      
		 *    cf) this : 자기자신의 주소값       
		 */
		
		super.printInfo();
		System.out.println("수당 : "+sudang);
	}

}










