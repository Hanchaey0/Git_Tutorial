package ch05;

public class _06_ArrayExx {
	public static void main(String[] args) {
		//int[]arr = new int[5];
		int[][] arr = {{1,2,3},		//{{0행},
					   {4,5,6}};   // {1행}}
		
		for(int i=0; i<arr.length; i++) {		// 행 : i<배열의 길이
			for(int j=0; j<arr[i].length; j++) {	// 열 : j<행의 길이
				System.out.print(arr[i][j]);
			}
			System.out.println(); //행이 바뀔 때 한줄 띄우기
		}
	}
}
