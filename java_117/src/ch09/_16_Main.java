package ch09;
//432
public class _16_Main {
	public static void main(String[] args) {
		_16_MemeberTreeSet mem = new _16_MemeberTreeSet();
		_16_Member park = new _16_Member(1003,"박서원");
		_16_Member lee = new _16_Member(1001,"이지원");
		_16_Member son = new _16_Member(1002,"손민국");
		
		mem.addMember(lee);
		mem.addMember(son);
		mem.addMember(park);
		mem.showallMember();
		
		_16_Member hong = new _16_Member(1003,"홍길동");
		mem.addMember(hong);
		mem.showallMember();
	}

}
/*
 * 아이디 : 1001, 이름 : 이지원
아이디 : 1002, 이름 : 손민국
아이디 : 1003, 이름 : 박서원

아이디 : 1001, 이름 : 이지원
아이디 : 1002, 이름 : 손민국
아이디 : 1003, 이름 : 박서원

*/
