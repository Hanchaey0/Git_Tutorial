package ch14;

public class _04_Thread {
	public static void main(String[] args) {
		System.out.println("현재 수행되고 있는 스레드 이름 : "+Thread.currentThread().getName());
		System.out.println("스레드의 최소 우선순위 값 : "+Thread.MIN_PRIORITY);
		System.out.println("스레드의 최대 우선순위 값 : "+Thread.MAX_PRIORITY);
		System.out.println("스레드의 중간 우선순위 값 : "+Thread.NORM_PRIORITY);
		System.out.println("현재 수행되고 있는 스레드의 우선순위 값 : "+Thread.currentThread().getPriority());


		/*
		 * 현재 수행되고 있는 스레드 이름 : main
		 * 스레드의 최소 우선순위 값 : 1
		 * 스레드의 최대 우선순위 값 : 10
		 * 스레드의 중간 우선순위 값 : 5
		 * 현재 수행되고 있는 스레드의 우선순위 값 : 5
		 */
	}
}
