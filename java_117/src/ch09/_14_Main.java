package ch09;

public class _14_Main {
	//p.426
	//객체가 동일(아이디가 같은 회원)하면 추가되지 않도록 함.
	//HashSet : 순서무관, 중복값 허용안함
	public static void main(String[] args) {
		
		_14_MemberHashSet hash = new _14_MemberHashSet();
		_14_Member lee = new _14_Member(1001, "이지원");
		_14_Member son = new _14_Member(1002, "손민국");
		_14_Member park = new _14_Member(1003, "박서훤");
		
		hash.addMember(lee);
		hash.addMember(son);
		hash.addMember(park);
		hash.showAllMember();
		
		_14_Member hong = new _14_Member(1003,"홍길동");
		hash.addMember(hong);
		hash.showAllMember();
	}
	
	

}
