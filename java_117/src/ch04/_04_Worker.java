package ch04;

public class _04_Worker {
	//멤버변수 - 속성
	private int sabun; //사번: 1001
	private	String name; //이름 : 김태희
	private int salary; //급여 : 100000 
	
	/*p.153
	 * 생성자를 클래스를 new연산자로 생성할 때만 호출된다.
	 * 생성자 이름은 클래스명과 같고, 반환값이 없다.
	 * 기본생성자는 컴파일할 때 컴파일러가 자동으로 기본생성자를 만들어준다. (단 생성자가 하나도 없는 경우)
	 * 하지만 매개변수가 생성자가 존재하면 컴파일러가 기본생성자를 자동으로 만들어주지 않는다.
	 */
	//디폴트 생성자
	//생성자 오버로드 : 메서드나 생산자의 매개변수 갯수가 다르거나 타입이 다른 경우를 말하며, 
			//리턴 타입은 같아도 무관하다.
	public _04_Worker() {}
	//매개변수 생성자 : 1.Main에서 값 전달 ->2. 매개변수로 전달->3.멤버변수로 전달
	public _04_Worker(int sabun, String name, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.salary = salary;
	}
	//멤버 메서드 - 기능
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getSabun() {
		return sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}


}
