package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class _16_ArrayList {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");
		list.add("ORACLE");
		list.add("Javascript");

		//1.for문
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
		//향상된 포문
		for(String str : list) { 	
			System.out.print(str+ " ");
		}

		//반복자 이더레이터 사용하기 //다 틀림........ 와일문 사용해야하는데 이프를 씀.
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) { 
			String season = (String)iterator.next();  
			System.out.println(season + " "); 
			
			//어레이리스트의 값이 존재하는지 체크 / 리턴타입은 불린. 
	 		//존재하면 참, 존재하지 않으면 거짓.
	 		//존재하면 반복자는 값을 읽어서 오브젝트 타입으로 리턴하므로, 스트링형으로 형변환
	 		//리턴타입이 오브젝트 스트링으로 받기위해 스트링으로 바꿔줌.
		}

	}
}




