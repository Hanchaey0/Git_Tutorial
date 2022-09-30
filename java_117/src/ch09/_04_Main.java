package ch09;

public class _04_Main {
	public static void main(String[] args) {
		//1001, 이지원
		//1002, 손민국
		//1003, 박시원
		//1004, 홍길동
		_04_MemberArrayList list = new _04_MemberArrayList();
		_06_Member lee = new _06_Member(1001,"이지원");
		_06_Member son = new _06_Member(1002,"손민국");
		_06_Member park = new _06_Member(1003,"박시원");
		_06_Member hong = new _06_Member(1004,"홍길동");
//위와 같이 한 이유는 홍길동을 이따 지울 거라서 이렇게 추가한 것
//원래대로 _04_Member li = new(_04_Member(1001,"이지원"));라고 해도 된다.
//		li.addMember(new _04_Member(1001,"이지원"));
//		li.addMember(new _04_Member(1002,"손민국"));
//		li.addMember(new _04_Member(1003,"박시원"));
//		li.addMember(new _04_Member(1004,"홍길동"));	
		
		list.addMember(lee);
		list.addMember(son);
		list.addMember(park);
		list.addMember(hong);
		list.showMember();
		
		//회원 삭제 메서드 1004
		list.removeMember(hong.getMemberId());
		list.showMember();
	}
}
