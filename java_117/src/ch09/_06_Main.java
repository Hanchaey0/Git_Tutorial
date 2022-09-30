package ch09;

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
	}
	//ArrayList와 hashMap을 비교해라. add는 같으나 put이 들어가고 key, value가 들어감.
}

//방법1
/*아이디 : 1001, 이름 : 이지원
아이디 : 1002, 이름 : 손민국
아이디 : 1003, 이름 : 박시원
아이디 : 1004, 이름 : 홍길동

=== remove ===
아이디 : 1001, 이름 : 이지원
아이디 : 1002, 이름 : 손민국
아이디 : 1003, 이름 : 박시원
*/

/*
방법2
key = 1001, value =: 아이디 : 1001, 이름 : 이지원
key = 1002, value =: 아이디 : 1002, 이름 : 손민국
key = 1003, value =: 아이디 : 1003, 이름 : 박시원
key = 1004, value =: 아이디 : 1004, 이름 : 홍길동

key = 1001, value =: 아이디 : 1001, 이름 : 이지원
key = 1002, value =: 아이디 : 1002, 이름 : 손민국
key = 1003, value =: 아이디 : 1003, 이름 : 박시원
*/

