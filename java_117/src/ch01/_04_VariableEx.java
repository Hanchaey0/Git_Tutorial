package ch01;

//2일차
public class _04_VariableEx {
		public static void main(String[]args) {
				
			/*
			 * 아스키코드 10진수 값
			 * 아스키코드는 정해져 있음. 10진수 값으로 정해져있음
			 * A:65
			 * B:66
			 * C:67
			 * Z:90
			 * a:97
			 * z:122
			 */
			
			char ch1='A';
			System.out.println(ch1); // ch1 : A
			
			//문자에 해당하는 정수값(아스키코드값) 출력=인코딩
			System.out.println("ch1 : " + (int)ch1); //ch1 : 65
			
			
			char ch2 = 66; 		//(char)정수
			//66 정수에 해당하는 문자값 출력 = 디코딩
			System.out.println("ch2 : "+ ch2); // ch2 : B
			
			int ch3 = 67;
			System.out.println(ch3);
			System.out.println("ch3 : " + (char)ch3); //ch3 : 67
			
			
			
					
			
	}

}
