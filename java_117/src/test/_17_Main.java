package test;

import ch09._03_Book;

public class _17_Main {
	public static void main(String[] args) {
		//삭제멤버를 지정하기위해서는 참조변수를 이용한 new 힙메모리 만들어야함.
		_17_BookHashMap map = new _17_BookHashMap();
		_17_book b1 = new _17_book(1, "태백산맥", "조정래");
		_17_book b2 = new _17_book(2, "데미안", "헤르만헷세");
		_17_book b3 = new _17_book(3, "토지","박경래");
		_17_book b4 = new _17_book(4, "어떻게 살 것인가","유시민");
		_17_book b5 = new _17_book(5, "어린왕자","생떽쥐베리");
		
		map.addBook(b1);
		map.addBook(b2);
		map.addBook(b3);
		map.addBook(b4);
		map.addBook(b5);
		map.printAllBook();

		map.removeBook(b5.getBookId());
		map.printAllBook();


		}
		}
	


