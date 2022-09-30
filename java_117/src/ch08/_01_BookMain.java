package ch08;

public class _01_BookMain {
	public static void main(String[] args) {
		
		//클래스명 참조변수 = new 디폴트생성자();
		_01_Book bk00 = new _01_Book();
		//클래스명 참조변수 = new 매개변수 생성자(값1, 값2..);
		_01_Book bk0 = new _01_Book(1, "한강");
		//toString()이 오버로이드 안되어있으면 주소값을 출력하는 부모 Object의  toString()이 호출된다.(해시코드)
		System.out.println(bk0);
		System.out.println(bk0.toString());
	}

}
/*
ch08._01_Book@15db9742
ch08._01_Book@15db9742
*/