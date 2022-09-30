package ch06;

public class _07_Main {
	public static void main(String[] args) {
		
		//1. 자식매개변수 생성자 호출=>전체 멤버변수 초기화
		//다형성 적용

		allPrintInfo(new _07_Sawon("S100","홍","인사",700000,10000));
		allPrintInfo(new _07_sudang("S102","김","인사",720000,12000));

	}
	//6.공통기능 호출 오버라이드에의해 자식메서드 호출
	public static void allPrintInfo(_07_Employee ep) {
		ep.printInfo();
	
		 
		 //
		//7. 8.인스턴스에따른 수당, 보너스 출력 자식 메서드에만 있음
		//if체크
		if(ep instanceof _07_Sawon) {
			_07_Sawon sw1 = (_07_Sawon) ep; //다운캐스팅
			sw1.calBonus();//자식한테만 있는 메서드 호출
		}
		if(ep instanceof _07_sudang) {
			_07_sudang sd2 = (_07_sudang)ep;	
			sd2.calSudang();
		}

	}
}
