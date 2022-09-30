package ch07;

//자식클래스
public class _02_CompleteCalc extends _02_Calc {
	
	@Override
	public void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("두 수의 합계 : "+result);
	}

	@Override
	public void sub(int num1, int num2) {
		int result = num1-num2;
		System.out.println("두 수의 뺄셈 : "+result);
	}

	@Override
	public void mul(int num1, int num2) {
		int result = num1*num2;
		System.out.println("두 수의 곱셈 : " +result);
	}

	@Override
	public void div(int num1, int num2) {
		int result = num1/num2;
		System.out.println("두 수의 나눗셈 : "+result);
		
	}

}
