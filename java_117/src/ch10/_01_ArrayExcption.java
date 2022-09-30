package ch10;

//p491
public class _01_ArrayExcption {
	public static void main(String[] args) {

		/*
		 * [면접]
		 * 예외 처리 목적 : 정상종료
		 * 
		 * try {
		 * 
		 * }catch(처리할 예외타입 e){
		 * 	//try 블록안에서 예외가 발생했을 때 예외를 처리하는 부분
		 * 
		 * }finally{
		 *  //항상 수행되는 부분(예외가 발생하지 않더라도),
		 *  //주로 자원해제를 위한 close() 문장이 온다.
		 *  }
		 */

		int[] array = new int[5];

		try {
			for(int i=0; i<=array.length; i++) {
				array[i] = i;
				System.out.println(array[i]); //0~4
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("==== 예외처리 부분 ====");
			System.out.println("e : " + e); //e가 getmessage부분
			System.out.println("e.getMessage() : "+e.getMessage()); //e.getMessage() : 5
			e.printStackTrace(); //추적(원래 에러가 뭐였는지 추적해서 알려줌)
			//_01_ArrayExcption.java:26 26행이 문제라고 알려줌
		}
		finally {
			System.out.println("==== finally 부분 ====");
			
			
		}
		System.out.println("정상종료");
	}
}
