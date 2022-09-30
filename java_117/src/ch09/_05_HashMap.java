package ch09;

import java.util.HashMap;
import java.util.Map;

public class _05_HashMap {

	public static void main(String[] args) {
		/*
		 * [면접] p439
		 * 해싱(hashing) : 키를 이용해서 해시테이블로부터 데이터를 가져오는 과정
		 * 
		 * HashMap
		 * 1) 특징
		 * - 데이터의 순서를 보장하지 않는다.
		 * - key와 value 쌍으로 저장한다.
		 * - key는 중복되면 안된다.
		 * - key를 이용해서 value를 가져올 수 있다.
		 * - List 계열과 달리 index가 없다.
		 * - Map이라는 인터페이를 구현한 클래스이다.
		 * 
		 * 2) 선언
		 * - HashMap<Key 타입, value 타입> map = new HashMap<Key 타입, value 타입>();
		 * - Map<Key 타입, value 타입> map = new HashMap<Key 타입, value 타입>(); // 다형성 적용
		 * 
		 * 3) 메서드
		 * - 데이터 추가 : put(key, value);
		 * - 데이터 가져오기 : get(key)
		 * - 데이터 삭제 : remove(key)
		 * - 데이터가 비어있는지 여부 : isEmpty()
		 * - 해당 키가 있는지 여부 : containsKey(key)
		 * - 해당 값이 있는지 여부 : containsValue(value)
		 * - 해당 갯수 : size()
		 */
		//MAP건설

		//1. 홍길동 2. 김태희  3. 유재석ㅣ4.박나래
		Map<Integer, String> map = new HashMap<Integer, String>();
		//데이터 추가 : put(key, value);
		map.put(1, "홍길동");
		map.put(2, "김태희");
		map.put(3, "유재석");
		map.put(4, "박나래");

		for(int i=1;i<=map.size();i++) {
			System.out.print(map.get(i)+" ");
		}
		System.out.println();

		//데이터 가져오기 :get(key)박나래 가져오기
		System.out.println(map.get(4));

		System.out.println("삭제전 map.size() : " + map.size()); //4

		//데이터 삭제 김태희
		map.remove(2);
		System.out.println("=== 삭제 후 ===");
		System.out.println("삭제 후 map.size() : " + map.size());
		
		for(int i=1;i<=map.size();i++) {
			System.out.print(map.get(i)+" "); 
			//3번 삭제 경우 :홍길동 김태희 null 땡겨지지 않음. 
			//2번 삭제  경우: 홍길동 null 유재석 클래스의 기본 자료인 null이 들어감.
			
			//각 각 자리가 정해져있기때문. ArrayList와는 다름.
		}
		System.out.println();
		
		//데이터가 비어있는지 여부
		System.out.println("=== 데이터가 비어있는지 여부 : isEmpty() ===");
		System.out.println(map.isEmpty()); //false

		// - 해당 키가 있는지 여부 : containsKey(key)
		// - 해당 값이 있는지 여부 : containsValue(value)
		
		
		//현재 김태희가 삭제된 경우. 김태희는 없음.
		System.out.println("===  해당 키가 있는지 여부 : containsKey() ===");
		System.out.println(map.containsKey(1)); //true
		System.out.println(map.containsKey(2)); //false
		System.out.println(map.containsKey(3)); //true
		System.out.println(map.containsKey(4)); //true
		
		System.out.println("=== 해당 값이 있는지 여부 : containsValue() ===");
		System.out.println(map.containsValue("홍길동")); //true
		System.out.println(map.containsValue("김태희")); //false
		System.out.println(map.containsValue("유재석")); //true
		System.out.println(map.containsValue("박나래")); //true
		
		System.out.println("=== 해당 갯수 : size() ===");
		System.out.println(map.size()); //3 김태희를 지웠기때문.

	}
}


