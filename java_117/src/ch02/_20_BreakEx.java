package ch02;

public class _20_BreakEx {
	public static void main(String[] args) {
		/*
		 * break문
		 *  - 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료한다.
		 *  - 반복문 안에서 continue문을 만나면, 그 이후의 문장은 수행하지 않고,
		 *    break문은 반복문을 더 이상 수행하지 않고 빠져나올 때 사용한다.
		 */
		
		//sum이 100이상이면 빠져나온다. sum, num의 값을 구하기
		//num은  1부터
		
		
		int sum = 0;
		int num;
		for(num=1; num<=100; num++) {
			sum = sum += num;
			if(sum >= 100) {
				break;
		}
		}
		System.out.println("num: "+ num + ", sum : "+ sum);
}
}
