package ch15;

public class _03_SpreadArgs {

	public _03_SpreadArgs() {}
	/*
	 * 스프레드 매개변수
	 * 1. 용도 : 메서드 호출시 매개변수 인자의 수가 일치하지 않아도 호출이 가능하도록 한다.
	 *         args는 인자의 수를 동적으로 처리할 수 있도록 유연성을 제공한다.
	 * 2. 방법 : 메서드 인자(데이터Type ...변수)로 지정하나, 스프레드 매개변수는 1개밖에 사용할 수 없다.
	 *         컴파일시 매개변수 인자로 넘어온 갯수만큼 배열이 생성된다.       
	 */
	public void callArg(String...str) {
		for(int i = 0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		for(String s : str) {
			System.out.println(s+" ");
		}
	}

	public void callArg2(String name, int...score) {
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+" ");
		}
		for(int ival : score) {
			System.out.println(ival+" ");

		}
	}
}
