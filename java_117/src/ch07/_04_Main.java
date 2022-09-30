package ch07;

public class _04_Main {
	public static void main(String[] args) {
		//인터페이스 (부모)참조변수 = new자식클래스명();
		_04_Calc calc = new _04_CompleteCalc();
		//자식 오버라이드 메서드가 호출
		System.out.println("덧셈 : "+calc.add(8, 4));
		System.out.println("뺄셈 : "+calc.substract(8, 4));
		System.out.println("곱셈 : "+calc.times(8, 4));
		System.out.println("나눗셈 : "+calc.divide(8, 4));
		
		
		//showInfo()는 자식에게만 있는 메서드이므로 다운캐스팅
		if(calc instanceof _04_CompleteCalc) {
		_04_CompleteCalc com = (_04_CompleteCalc) calc;
		com.showInfo();
		}
	
		
	}

}
