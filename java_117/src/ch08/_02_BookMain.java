package ch08;

public class _02_BookMain {
	public static void main(String[] args) {
		
		//클래스명 참조변수 = new 디폴트생성자();
		_02_Book bk1 = new _02_Book();

		//클래스명 참조변수 = new 매개변수 생성자(값1, 값2..);
		_01_Book bk0 = new _01_Book(1, "한강");
		_02_Book bk2 = new _02_Book(1, "한강", "조정래");
		//toString()이 오버라이드 안되어있으면 주소값을 출력하는 부모 Object의  toString()이 호출된다.(해시코드)
		//toString()이 오버라이드 되어있으므로 멤버변수를출력하는 자식클래스 book의 toString이 호출된다. (멤버변수 값 초기화)
		System.out.println(bk2);
		System.out.println(bk2.toString());
/*
 * 책번호 : 1, 책 이름 : 한강, 저자 : 조정래
 * 책번호 : 1, 책 이름 : 한강, 저자 : 조정래
 */
		
	}

}
