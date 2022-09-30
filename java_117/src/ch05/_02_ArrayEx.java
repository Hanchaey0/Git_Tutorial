package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
		//방법2
		String[] tea = new String[5];
		tea[0]="아메리카노";
		tea[1]="홍차";
		tea[2]="콜라";
		tea[3]="레몬차";
		tea[4]="복숭아아이스티";
		for(int i=0;i<tea.length;i++) {
			System.out.println("tea"+"["+i+"]="+tea[i]);
		}
		//방법4
		String[] tea2 ={"버블티","카페라떼","프라푸치노","얼그레이","밀크티"};
		
		
		System.out.println("=================");

		for(int j=0;j<tea2.length;j++) {
			System.out.println("tea2"+"["+j+"]="+tea2[j]);
		}
	}
}

