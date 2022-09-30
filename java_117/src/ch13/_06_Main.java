package ch13;

public class _06_Main {
	public static void main(String[] args) {
		
		
		_06_MemberHashMap memHashMap = new _06_MemberHashMap();
		_06_Member lee = new _06_Member(1001,"이지원");
		_06_Member son = new _06_Member(1002,"손민국");
		_06_Member park = new _06_Member(1003,"박시원");
		_06_Member hong = new _06_Member(1004,"홍길동");
		
		//회원추가 메서드
		memHashMap.addMember(lee);
		memHashMap.addMember(son);
		memHashMap.addMember(park);
		memHashMap.addMember(hong);
		memHashMap.showAllMember();
		/*
		 * key 		value
		 * 1001		1001 이지원
		 * 1002		1002 손민국
		 * 1003		1003 박시원
		 * 1004		1004 홍길동
		 */
		System.out.println("=== remove ===");
		memHashMap.removeMember(hong.getMemberId());
		memHashMap.showAllMember();
	
	//ArrayList와 hashMap을 비교해라. add는 같으나 put이 들어가고 key, value가 들어감.
	
	//====================================================================
	
	//1. create
	_06_Member choi = new _06_Member(1005,"최현우");
	memHashMap.create(choi);
	
	//2. retrieve - id -이름으로 조회
	System.out.println("최현우 조회 : "+memHashMap.retrieveByName("최현우"));
	
	//3. update - 1005번을 최현우에서 아이유로 변경
	_06_Member iu = new _06_Member(1005,"아이유");
	memHashMap.update(iu);
	
	//4 retrieve
	System.out.println("update 1005 조회 : "+memHashMap.retrieveByName("아이유"));
	
	//5. remove
	memHashMap.removeMember(1005);
	System.out.println("delete 1005 조회 :"+ memHashMap.delete(1005));
	//delete 1005 : false
	
	//6.exists
	memHashMap.exists(1005);
	System.out.println("exists 1005 조회 : "+memHashMap.exists(1005));
	}
	//exists 1005 조회 : false

}
