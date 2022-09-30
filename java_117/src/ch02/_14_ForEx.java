package ch02;

public class _14_ForEx {
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
		
	// HappyDay1~~ HappDay2~~ HappDay3~~ HappDay2~~ HappDay5~~
	int num = 0;
//	for(num=1; num<=5; num++) {
//	System.out.print("HappyDay"+num+"~~ ");	
	
	//HappyDay5~~ HappyDay4~~ HappyDay3~~ HappyDay2~~ HappyDay1~~// 
	for(num=5; num>=1; num--) {
		System.out.print("HappyDay"+ num + "~~ ");
	}
  }
}



	