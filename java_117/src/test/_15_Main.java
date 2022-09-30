package test;

public class _15_Main {
	public static void main(String[] args){

	_15_Sawon sw = new _15_Sawon("S001","홍길동","인사과",200000,2000);
	sw.printInfo();
	System.out.println(sw.toString());
	}
	/*
	 * 사번 : S001
	 * 이름 :홍길동
	 * 부서명 : 인사과
	 * 급여 :200000
	 * 수당 :2000
	 * 사번 : S001, 이름 : 홍길동, 사번 : 인사과, 급여 : 200000
	 */
}
