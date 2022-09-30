package ch02;

public class _19_ContinueEx {
	public static void main(String[] args) {
		/*
		 * continue문
		 * continue문은 반복문과 함께 사용한다
		 * 반복문 안에서 continue문을 만나면, 그 이휴의 문장은 수행하지 않고
		 * for문의 처음으로 돌아가 증감식을 수행한다.
		 * 
		 */
		
		//1~100까지의 짝수 합계
		
		
		int i = 1;
		int sum = 0;
				for(i=1; i<=100; i++) {
					if(i%2!=0)  //홀수, 중중괄호 생략 가능 컨티뉴 하나밖에 없을 때. 여러가지 중첩일 땐 중괄호 해야함. 근데 헷갈릴 수 있으니 걍 쓰기
						continue;
					
					sum += i;
					}
				System.out.println("1~ 100까지의 짝수 합계 :" + sum);
				}
			}
				//1~ 100까지의 짝수 합계 :2550




