package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

	//====================================================================================

	//1.create
	public int create(_06_Member member)  { // choi = new _06_Member(1005,"최현우");
		//null인지 아닌지 따져줌 따져서empty를 포함함(비어있니?)
		Optional.ofNullable(hashMap.get(member.getMemberId())) //최현우
		.ifPresent(targetMember -> {
			//밑에 값을 읽어서 존재해버리면 밑을 발생시킨다. 1003, 최현우로 하면 예외처리 발생한다.
			//존재 안하면
			throw new _06_MemberDupException("이미 존재하는 회원입니다.");
		});
		//최현우의 아이디를 읽어서 멤버정보 가져올 것.
		hashMap.put(member.getMemberId(),member);
		return (member.getMemberId());
	}
	//retrieveByName
	//한명의 회원조회 - 이름으로 조회 : stream()이용
	public List<_06_Member>retrieveByName(String name) {
		return hashMap.values().stream().filter(member -> member.getMemberName().equals(name))
				.collect(Collectors.toList());
		//필터링해서 toList타입으로 반환해 내보내겠다.
	}



	//3. update
	public void update(_06_Member member) {
		if(hashMap.containsKey(member.getMemberId())) {
			hashMap.put(member.getMemberId(), member);
		}
	}
	//4 retrieve
	public _06_Member retrieve(int memberId) {
		return hashMap.get(memberId);
	}
	
	//5.remove
	public boolean delete(int memberId) { 
		if(hashMap.containsKey(memberId)) {	
			hashMap.remove(memberId);
			return true; //메서드 종료
		}
		return false;
	}
	
	//6. exits - 존재하지 않으면 null, 존재하면 member정보를 출력retrieve 호출
		public boolean exists(int memberId) {
		return Optional.ofNullable(hashMap.get(memberId)).isPresent();
	}
}
 /*
 * Optional이란?
 * 
 * 고통스러운 null 처리를 직접하지 않고 Optional 클래스에 위임하기 위함이다.
 * 
 * 존재할수도 있지만 안 할수도 있는 객체.. 즉 null이 될 수도 있는 객체을 감싸고 있는 일종의 래퍼 클래스이다.
 * 원소가 없거나 최대 하나 밖에 없는 Collection이나 staeam으로 생각해도 좋다.
 * 
 * null 체크를 직접하지 않아도 된다.
 * 명시적으로 해당 변수가 null일수도 있다는 가능성을 표현할 수 있다.
 * 
 * Optional.ofNullable(value) : null인지 아닌지 확신할 수 없는 객체를 담고 있는 Optional 객체를 생성한다.
 *           - Optional.empty()와 Optional.ofNullable(value)를 합쳐놓은 메서드이다.
 *           - 해당 객체가 null인지 아닌지 자신이 없는 상황에서 이메서드를 사용한다.
 * 
 * ifPresent => get() 메서드는 비어있는 Optional 객체를 대상으로 호출할 경우, 예회를 발생시키므로 객체 존재 여부를 
 *          bool 타입으로 반환하는 isPresent()라는 메서드를 통해 null 체크가 가능하다.
 * 
 */














