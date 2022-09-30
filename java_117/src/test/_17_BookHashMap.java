
package test;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class _17_BookHashMap {
	Map <Integer,_17_book>hashMap;
	//디폴트생성자에서 hasMap생성
	public _17_BookHashMap(){
		hashMap = new HashMap <Integer,_17_book>();
	}

	//add
	public void addBook(_17_book bk){
		hashMap.put(bk.getBookId(),bk);
	}

	public void removeBook(int bookId){
		if(hashMap.containsKey(bookId)) {
			hashMap.remove(bookId);
			return;
		}
		System.out.println(bookId+"가 존재하지 않습니다");
	}
	//hashmap.get, hasNext를 이해못하고 잘못 적음.
	public void printAllBook(){
		Iterator<Integer> iterator =hashMap.keySet().iterator();
		while(iterator.hasNext()){
			_17_book bk = hashMap.get(iterator.next());
			System.out.println(bk);
		}
		System.out.println();
}
}
