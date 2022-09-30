package ch09;

import java.util.HashMap;
import java.util.Map;

public class _07_MembeHasMap_Enrty {
	//시험
	public static void main(String[] args) {
					//멤버변수
		Map<String, _07_Member> map = new HashMap <String, _07_Member>();
		
		//hashMap에 멤버변수 정보기 매개변수 생성자를 통해서
		_07_Member hong =new _07_Member(1, "홍길동");
		_07_Member kim =new _07_Member(2, "김태희");
		_07_Member lee =new _07_Member(3, "아이유");
		
		
		//헤시맵에 볌버변수 정보 추가
		map.put("1001",hong);
		map.put("1002", kim);
		map.put("1003", lee);

	System.out.println(map); //map.toString실행	
	
	//멤버삭제
	map.remove("1002");
	System.out.println(map);
	
	//멤버변경
	map.put("1003", new _07_Member(3, "박명수")); //아이유->박명수
	System.out.println(map);
	
	//멤버추가
	map.put("1004", new _07_Member(4,"유느님"));
	System.out.println(map);
	
	//조회 key,value 가져오기
	//map에 있는 정보를 쓰기위해 entry를사용하면 entry 인터페이스를 사용할 수 있다.
			//인터페이스				//ketset이랑 같음. 앞에 map.entry처럼 짝 맞춰서 써야함.Entry.entrySet()
	
	//map.entryset() map에 포함된 메핑정보를돌려준다
	//Map.Entry<K, V> =>getkey(), getvalue()를 가지고 있는 인터페이스 
	for(Map.Entry<String, _07_Member> str : map.entrySet()) {
		String key = str.getKey();
		_07_Member value = str.getValue();
		System.out.println("key = "+key+", value =: "+value);
		/*
		key = 1004, value =: 아이디 : 4, 이름 : 유느님
		key = 1003, value =: 아이디 : 3, 이름 : 박명수
		key = 1001, value =: 아이디 : 1, 이름 : 홍길동
		*/
		//이터레이터보다 간단함.
	}
	
	}

}
