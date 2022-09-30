package ch05;

public class _03_Main {
	public static void main(String[] args) {
		//배열 선언 및 초기화
		//자료형[] 배열명 = new자료형[갯수];
		_03_Book[] library = new _03_Book[5];
		
		//매개변수 생성자를 통해 멤버변수 초기화
		library [0] = new _03_Book("태백산맥", "조정래", 20000);
		library [1] = new _03_Book("데미안", "헤르만헤세", 25000);
		library [2] = new _03_Book("어떻게 살 것인가", "유시민", 30000);
		library [3] = new _03_Book("토지", "박경리", 35000);
		library [4] = new _03_Book("어린왕자", "생땍쥐베리", 40000);
			
		for(int i=0;i<library.length; i++) {
			library[i].showbookInfo();
		}
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
	}
}
