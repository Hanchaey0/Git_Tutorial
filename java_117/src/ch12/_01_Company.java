package ch12;

public class _01_Company {
	/*  [면접] 싱글톤패턴
	    * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	    * - static을 응용하여 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
	    * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	    *   객체를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아 접근한다.
	    *   열번, 백번을 호출해도 항상 같은 주소의 인스턴스가 반횐된다.
	    *  
	    * 싱글톤패턴 생성
	    * - 1단계. 생성자를 private으로 만들기
	    * - 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	    * - 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	    * 
	    * 호출
	    * - 접근클래스명 참조변수 = 접근클래스명.getInstance();
	    * 예) _08_Company com1 = _08_Company.getInstance();  // 클래스명.메서드명
	    * 
	    */
	// 멤버변수
	private String companyName;
	private String address;
	private String telNo;
	
	//1단계. 생성자를 private으로 만들기
	private _01_Company() {}
	
	
	//2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static _01_Company instance = new _01_Company();
	//3단계. 외부에서 참조할 수 있는 public메서드 만들기
	public static _01_Company getInstance() {
		if(instance == null) {
			instance = new _01_Company();
		}
		return instance;
	}
	
	//멤버메서드
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getTelNo() {
		return telNo;
	}
	public void printInfo() {
		System.out.println(companyName+", "+address+", "+telNo);
	}
	

}
