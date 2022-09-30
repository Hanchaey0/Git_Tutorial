package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_ArrayList {
	public static void main(String[] args) {
		/*
		 * [ArrayList]
		 * 
		 *         Collection 인터페이스
	     * - List 인터페이스 : 클래스 종류는 ArrayList, Vector, LinkedList
	     * - Set 인터페이스 : 클래스종류는 HashSet, TreeSet
	     * - Map 인터페이스 : 클래스종류는 HashMap, HashTable, TreeMap
	     * 
	     *  <면접>
	     *  1. 특징
	     *  List 인터페이스 : 순서가 있는 자료관리, 중복허용한다.
	     *                 index를 사용하여 요소에 접근한다.
	     *                 리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
         *                 클래스종류는 ArrayList, Vector, LinkedList
         *                 
         *  Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
         *                클래스종류는 HashSet, TreeSet
		 * 
		 * 
		 * 
		 * 2. 선언
		 *		wrapper클래스들이 <>에 들어간다. Integer, String... 
		 * 클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
		 * ArrayList<String> list = new ArrayList<String>();
		 *
		 *
		 * 다형성 적용
		 * List<String> list = new ArrayList<String>();
		 * List인터페이스
		 * 
		 * String타입이 오면 오른쪽에도 마찬가지로 String타입을 적는다.
		 * ArrayList라는 바구니 안에 문자열만 순서대로 집어넣겠다. String. 
		 * 정수만 넣겠다. Integer. (클래스기때문에 int안됨.)
		 * p.375
		 * 동일한 자료형에 대량의 데이터를 넣을 때 사용하는 것 = 배열.
		 * Array도 마찬가지로 배열이다.
		 * Array있는데 왜 ArrayList를 쓰는가.
		 * 배열은 갯수가 정해져있다 동일한 자료형의 대량의 데이터를 정해진 갯수만큼만(선언한 갯수만큼)쓰는 것.
		 * ArrayList : 갯수는 상관 없으나, <동일한 자료형>만 사용.
		 * 
		 * 3. 특징 : 데이터 순서가  있다. 중복 허용 된다.
		 * 4. 추가 : list.add(값);	//앞에서부터 순서대로 추가
		 * 		   list.add(추가할 위치 index,값); //지정한 인덱스에 값을 추가, 그 뒤의 값은 밀려난다.
		 * 5. 값 가져오기 : list.get(가져올 index);  //list.size()만큼 반복
		 * 
		 * 6. 교체 : list.set(교체할 위치 index, 값); //지정한 인덱스의 값을 변경 .. 그 뒤값은 그대로이다.
		 * 7. 삭제 : list.remove(삭제할 위치 index, 값);
		 * 8. 검색 : list.indexOf(검색할 값); 	// 중요
		 * 		리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		 * 		검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 * 
		 * 9. 전체 삭제 : list.clear();
		 * 10. 반복자 : Iterator<E> interator : while(hasNext()) {next()}
		 * 
		 * 
		 */
			//2. 선언
		 	//클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
		 	List<String> list = new ArrayList<String>();
		 	list.add("치킨");//0
		 	list.set(0, "파스타");  //치킨이 사라지고 파스타 고구마 피자 바나나우유 와인로 교체되었다.
		 	list.add("피자");//2
		 	list.add("와인");//5
		 	list.add(1, "고구마");//1    ->해당위치에 데이터가 삽입되고, 그 뒤의 데이터가 한칸씩 밀려남.
		 	list.add(3, "만두");//3
		 	list.add(4, "바나나우유");//4
		 	list.remove(3);

		 	
		 	//방법 1. for문
		 	System.out.println("[방법 1. for문]");
		 	for(int i=0; i<list.size();i++) {
		 		System.out.print(list.get(i)+ " ");
		 	}
		 	System.out.println();
		 	//방법2. 향상된 for문
		 	System.out.println("[방법2. 향상된for문]");
		 	for(String str : list) { 	//for(자료형 변수명 : 리스트명){}
		 		System.out.print(str+ " ");
		 	}
		 	System.out.println();
		 	//방법3.반복자(lterator) 지정하기
		 	/*
		 	 * 사용 목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인터페이스를 구현하는 객체이다.
		 	 * 			즉 컬렉션의 원소들에 접근하는 것이 목적이다.
		 	 * 사용 메서드
		 	 *  - hasNext() : 아직 접근하지 않는 요소가 있으면 true를 반환
		 	 *  - next() : 다음 요소를 반환 .. Object 타입을 반환 =>Object : 가장 큰 자료형
		 	 *  - remove() : 최근에 반환된 요소를 삭제한다.
		 	 */
		 	System.out.println("[반복자]");
		 	List<String> list2 = new ArrayList<String>();
		 	list2.add("봄");
		 	list2.add("여름");
		 	list2.add("가을");
		 	list2.add("겨울");
		 	
		 	Iterator iterator = list2.iterator();
		 	while(iterator.hasNext()) { //어레이리스트의 값이 존재하는지 체크 / 리턴타입은 불린. 
		 		//존재하면 참, 존재하지 않으면 거짓.
		 		//존재하면 반복자는 값을 읽어서 오브젝트 타입으로 리턴하므로, 스트링형으로 형변환
		 		//리턴타입이 오브젝트 스트링으로 받기위해 스트링으로 바꿔줌.
		 		 String season = (String)iterator.next();  //값이 존재하면 시즌에 값을 대입한다.
		 		//리턴타입이 Object이므로 다운캐스팅 해줘야한다.
		 		 	System.out.println(season + " "); //봄 여름 가을 겨울
		 	}
		 	
	}

}
