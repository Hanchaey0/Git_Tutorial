package ch06;

public class _03_Main {
	public static void main(String[] args) {

		//Manager자식클래스 정보를 출력
		_03_Manager mg = new _03_Manager();
		//부모메서드(사번, 이름, 부서명, 급여)
		mg.setSabun("C100");
		mg.setName("김태희");
		mg.setDepName("전산실");
		mg.setSalary(5000000);
		//mg.printInfo();   
		System.out.println("[ 자식메서드(보너스) ]");
		//자식메서드(보너스)
		mg.setBonus(10000);
		mg.printInfo(); //자식클래스의 프린트인포 호출  
		

		//부모쪽과 자식쪽이 같은 메서드명을 사용하면 자식 것을 사용한다. 다시 재정의했다고 판단함.
		//	보너스 : 0
		//	[ 자식메서드(보너스) ]
		//	보너스 : 10000
		
		//super 부모 메서드 소환, 위에있던 mg.printInfo()주석처리
//		[ 자식메서드(보너스) ]
//		이름 : 김태희, 부서명 : 전산실, 급여 : 5000000
//		보너스 : 10000

		_03_Sawon sn = new _03_Sawon();
		System.out.println("[ Sawon 자식 메서드(수당) ]");
		sn.setSabun("C101");
		sn.setName("홍길동");
		sn.setDepName("인사과");
		sn.setSalary(5000000);
		//mg.printInfo();   
	
		
		//자식메서드(보너스)
		sn.setSudang(10000);
		sn.printInfo();
	}
}
