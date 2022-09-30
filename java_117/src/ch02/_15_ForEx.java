package ch02;

public class _15_ForEx {
	public static void main(String[] args) {
	/*
	 * 반복문 : 조건식이 참인동안 반복(while문, for문)	
	 * 
	 * for문의 기본구조
	 * 
	 * for(초기갑; 조건식; 증감식) {
	 *	수행문1;
	 *	수행문2;...
	 */

	
	/*num = 1, sum = 1
	/*num = 2, sum = 3
	/*num = 10, sum = 55
	 * 
	 * 출력 : 1~10까지의 합 : 55 =>1번 출력
	 */
	int num = 0;
	int sum = 0;
		//for문 안에 int num=1이라 하면 넘은 로컬변수로, 포문 안에서만 쓸 수 있다. 밖에서도 쓰려면 바깥에 선언 해줘야 한다.
	for(num=1; num<=10; num++) {
		sum += num; //sum= sum+num;
		System.out.println("num = "+num+", sum = "+sum);
		}
		System.out.println("1~10까지의 합 :"+num);
	}
 }


	


	

