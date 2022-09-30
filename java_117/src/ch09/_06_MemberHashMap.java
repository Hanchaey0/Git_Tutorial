package ch09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _06_MemberHashMap {
	private Map <Integer,_06_Member> hashMap;
	public _06_MemberHashMap() {
		hashMap = new HashMap<Integer,_06_Member>();
	}
	//회원 정보 주기
	public void addMember (_06_Member member) {
		//hashMap.put(key,Value);
		hashMap.put(member.getMemberId(), member);
	}
	//회원정보 삭제
	
		public void removeMember(int memberId) { //매개변수 : key
			if(hashMap.containsKey(memberId)) {	//key에 해당하는 회원이 있으면
				hashMap.remove(memberId);
				return; //메서드 종료
			}
			System.out.println(memberId+"가 존재하지 않습니다.");
		}
	//방법1
	public void showAllMember() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		//keyset을 넣는 이유는 key를 가져오기위해서. 그래서 자료형도 key의 자료형인 인티저
		while(iterator.hasNext()) {//다음 key가 있으면
			int key = iterator.next(); //가져와서 key에 담아
			//인티저가 인트로 바뀐 거 ->언박싱
			_06_Member member = hashMap.get(key); //key가져와서 멤버 정보로 대입
			System.out.println(member); //.toString 생략 되어 있다.
		}
		System.out.println();

		//방법2
		for(Map.Entry<Integer, _06_Member> str : hashMap.entrySet()) {
			int key = str.getKey();
			_06_Member value = str.getValue();
			System.out.println("key = "+key+", value =: "+value);
		}
		System.out.println();
	}
}




