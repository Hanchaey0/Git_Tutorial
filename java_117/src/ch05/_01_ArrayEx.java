package ch05;

public class _01_ArrayEx {
	public static void main(String[] args) {
		/*
		 * 배열(Array):대량의 동일한 자료형 데이터를 한꺼번에 순차적으로 저장할 수 있는 저장장소이다.
		 * 
		 * 방법1) 선언과 생성을 따로 한다.
		 * 		int[] scores;    //선언
		 * 		scores = new int[갯수] //생성
		 * 		scores[index] = 값;
		 * 
		 * 방법2) 선언과 생성을 동시에 한다. . .. 추천
		 * 		배열자료형[] 배열명 = new 배열자료형[배열갯수];
		 * 		배열명[index] = 값;
		 * 
		 * 방법3) int[] scores = new int[]{1,2,3,4,5};  //갯수는 생략해야 함.
		 * 	    int[] scores = new int[5]{1,2,3,4,5};  //갯수가 있으므로 오류 발생.
		 *
		 *		자료형[] 배열명;
		 *		배열명 = new 자료형[]{1,2,3,4,5}  //new자료형[]생략시 오류발생
		 *
		 * 방법4) 선언과 할당을 동시에 한다. . ..제일 많이 사용
		 * 		배열자료형[] 배열명 = {1,2,3,4,5};
		 */
		//방법2) 배열자료형[] 배열명 = new 배열자료형[배열갯수];
		int[]scores = new int[5];
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;

		/*
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;
		 */
		//for(초기값; 조건식; 증감식;)
		for (int i=0;i<5;i++) {
			System.out.println("scores"+"["+i+"]="+scores[i]);
		}
		/*
		scores[0]=10
		scores[1]=20
		scores[2]=30
		scores[3]=40
		scores[4]=50
		 */
	}

}