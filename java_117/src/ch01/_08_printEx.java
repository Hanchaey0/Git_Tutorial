package ch01;

public class _08_printEx {
	public static void main(String[] args) {
		/*
		 * printf(형식지전자, 값 또는 변수)
		 * - 형식지정자
		 * %d : 정수를 출력한다. 예) System.out.printf(%d,10);
		 * %f : 실수를 출력한다. 예) System.out.printf(%f,3.14f);	//실수 6자리
		 * %c : 한문자를 출력한다. 예) System.out.printf(%c,'a');
		 * %s : 문자열을 출력한다. 예) System.out.printf(%s,"Good Luck");
		 * 
		 */

	double value = 1.0/3.0;
	System.out.println("value : "+ value);  //value : 0.3333333333333333
	System.out.printf("value : "+ "%f",+ value); //value : 0.333333
	
	System.out.println();
	//printf("%전체자릿수.나머지자릿수f", + value);
	System.out.printf("value : "+ "%6.2f", +value);  //value :   0.33
		//자릿수가 모자르면 공백으로 채운다   0.33
	
	System.out.println();//빈줄 계속 넣어줘야 함 그래야 안붙고 밑으로 내려감
	System.out.printf("value :" + "%s", "Good Luck");//value :Good Luck
	System.out.println();
	System.out.printf("년도 : "+"%s", "20220623");//년도 : 20220623
	}
}
