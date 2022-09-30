package ch05;

public class _05_Enfor {
public static void main(String[] args) {
	
	/* p.218
	 *  -향상된 for문 => 중요
	 *  배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하는 반복문
	 *  배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
	 *  따로 초기화와 종료조건이 없기때문에, 모든 배열의 시작요소부터 끝요소까지 실행한다.
	 *  
	 *  for(배열자료형변수 : 배열명)}
	 * 		반복실행문;
	 * }
	 */

	String[] strArray = {"java", "oracle", "html", "JavaScript", "jsp","spring"};
	
	//일반 for문으로
	 for(int i=0; i<strArray.length; i++) {
		 System.out.print(strArray[i]);
	 }
	
	//향상된 for문
	 
	 for(String str : strArray) {
		 System.out.print(str);
	 }
	}
}


