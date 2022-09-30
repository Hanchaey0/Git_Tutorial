package ch06;

public class _04_Main {

	public static void main(String[] args) {
		//자식 디폴트 생성자 호출
		_04_Manager mg1 = new _04_Manager();
		System.out.println("====== [ Manger 출력 ] =====");
		//1.자식 매개변수생성자를 통한 값전달(전체 멤버변수를 초기화)
		//2.자식의 매개변수 생성자 -> 부모 매개변수 생성자 호출
		//3.부모 매개변수 생성자 : 멤버변수로 값전달
		//4.부모 멤버변수 초기화
		//5. 출력 : 오버라이드에 의해 자식의 메서드 호출
		_04_Manager mg = new _04_Manager("S001", "김태희", "IT", 2500000, 500000);
		mg.showInfo();
		//5. 출력 : 오버라이드에 의해 자식의 메서드 호출
//		부모 디폴트 생성자 호출
//		자식 디폴트 생성자 호출
//		부모 매개변수 생성자 호출
//		자식 매개변수 생성자 호출
//		사번 : S001, 이름 : 김태희, 부서명 : IT, 급여 : 2500000
//		보너스 : 500000
		System.out.println("====== [ Sawon 출력 ] =====");
		_04_Manager sw = new _04_Manager("S002","홍길동","IT",2000000,450000);
		sw.showInfo();
		
	}
}
