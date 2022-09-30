package ch04;

public class _04_WorkerMain {
	public static void main(String[] args) {

		//1. setter를 이용한 값 전달
		System.out.println("1. setter를 이용한 값 전달");
		_04_Worker s1 = new _04_Worker();
		s1.setSabun(1001);
		s1.setName("김태희");
		s1.setSalary(100000);

		System.out.println("사번 : "+ s1.getSabun());
		System.out.println("이름 : "+ s1.getName());
		System.out.println("급여 : "+ s1.getSalary());

		//2. 매개변수 생성자를 이용한 값 전달
		System.out.println("2. 매개변수 생성자를 이용한 값 전달");
		
		_04_Worker s2 = new _04_Worker(1002,"비",20000);

		System.out.println("사번 : "+s2.getSabun());
		System.out.println("이름 : "+s2.getName());
		System.out.println("급여 : "+s2.getSalary());
		
	}
}