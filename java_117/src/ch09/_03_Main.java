package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Main {
	public static void main(String[] args) {
		
		
		//멤버변수 초기화 방법은 두가지. 매개변수 생성자, setter를 이용한 방법.
		
		System.out.println("== 방법1. 매개변수 생성자를통한 멤버변수 초기화 ==");
		//ArrayList 생성
		List<_03_Book> list = new ArrayList<_03_Book>();

		//방법 1. 매개변수 생성자를통한 멤버변수 초기화 =>list에 추가

		list.add(new _03_Book("태백산맥", "조정래"));
		list.add(new _03_Book("데미안", "헤르만헷세"));
		list.add(new _03_Book("토지","박경래"));
		list.add(new _03_Book("어떻게 살 것인가","유시민"));
		list.add(new _03_Book("어린왕자","생떽쥐베리"));

		//for문으로 list정보 출력
		System.out.println("----for문----");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----향상된 for문----");
		//향상된 for문으로 list정보 출력
		for(_03_Book sr : list) {
			System.out.println(sr);
		}
		System.out.println("----toString----");

		for(int i=0;i<list.size();i++) {
			_03_Book bk = list.get(i); 
			System.out.println(bk); //toString() 생략
		}

		//setter
		System.out.println("==방법2.setter로 멤버변수 초기화==");


		//방법2. setter로 멤버변수 초기화 =>list에 추가

		list.clear(); //위의 정보를 모두 삭제한다. 이 방법도 있고 그냥 새로 list2를 만드는 방법도 있다.
		// List<_03_Book> list2 = new ArrayList<_03_Book>();


		_03_Book bk = new _03_Book();
		bk.setBookName("태백산맥");
		bk.setAuthor("조정래");
		list.add(bk);

		_03_Book bk2 = new _03_Book();
		bk2.setBookName("데미안");
		bk2.setAuthor("헤르만헷세");
		list.add(bk2);

		_03_Book bk3 = new _03_Book();
		bk3.setBookName("토지");
		bk3.setAuthor("박경래");
		list.add(bk3);

		_03_Book bk4 = new _03_Book();
		bk4.setBookName("어떻게 살 것인가");
		bk4.setAuthor("유시민");
		list.add(bk4);

		_03_Book bk5 = new _03_Book();
		bk5.setBookName("어린왕자");
		bk5.setAuthor("생떽쥐베리");
		list.add(bk5);

		System.out.println("--for문--");
		//for문으로 list정보 출력
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--향상된 for문--");
		//향상된 for문으로 list정보 출력
		for(_03_Book bb : list) {
			System.out.println(bb);
		}

		System.out.println("----toString----");

		for(int i=0;i<list.size();i++) {
			_03_Book bo = list.get(i); 
			System.out.println(bo); //toString() 생략
		}
		
	
	
	}
}


