package test;

public class _07_ArrayEx {
	public static void main(String[] args) {



		int[][] arr = {{100,100,100},  //0.0, 0.1, 0.2
				{90,90,90},	   //1.0, 1.1, 1.2
				{70,70,70},	   //2.0, 2.1, 2.2
				{70,100,100},   //3.0, 3.1, 3.2
				{60,100,100}};  //4.0, 4.1, 4.2

		System.out.println("=====================================================");
		System.out.println("번호	국어	영어	수학	총점	평균	학점");	
		System.out.println("=====================================================");
		
		int korTot=0;
		int engTot=0;
		int mathTot=0;
		char grade =' ';


		for (int i=0; i<arr.length;i++) {

			int sum=0;
			double avg=0.0;
			korTot+=arr[i][0];
			engTot+=arr[i][1];
			mathTot+=arr[i][2];
			
			System.out.print(" "+(i+1));

			for(int j=0; j<arr[i].length;j++) {
				System.out.print("\t"+arr[i][j]);
				sum+=arr[i][j];
				avg=(double)sum/arr[i].length;

			}
			System.out.printf("\t"+sum+"\t" + "%.2f",avg);
			if(avg>=90) {
				grade='A';
			}else if(avg>=80) {
				grade = 'B';
			}else if(avg>=70) {
				grade = 'C';
			}else if(avg<=60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			System.out.println(" "+"\t"+" "+grade);
			}
			
		
		System.out.println("====================================================");
		System.out.println("과목 합계   "+korTot+"\t"+engTot+"\t"+mathTot);
	}
}
//=====================================================
//번호	국어	영어	수학	총점	평균	학점
//=====================================================
// 1	100	100	100	300	100.00 	 A
// 2	90	90	90	270	90.00 	 A
// 3	70	70	70	210	70.00 	 C
// 4	70	100	100	270	90.00 	 A
// 5	60	100	100	260	86.67 	 B
//====================================================
//과목 합계   390	460	460




