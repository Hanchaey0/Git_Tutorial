package ch15;

public class _03_Main {
	public static void main(String[] args) {
		_03_SpreadArgs sp = new _03_SpreadArgs();
		sp.callArg("샌드위치", "연어스테이크","고구마","닭가슴살","견과류");
		System.out.println();
		
		sp.callArg2("홍길동", 50,60,70,80,90,110,120);
	}

	
}
