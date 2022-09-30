package ch09;

import java.lang.reflect.Member;

//434
public class _16_Member implements Comparable<_16_Member> {	
	private int memberId;
	private String memberName;

	//생성자
	public _16_Member() {}
	public _16_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	//멤버메서드

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//p434 implement받아서 compareTo재정의
	@Override
	public int compareTo(_16_Member mem) {
		return (this.memberId - mem.memberId);
	}

	@Override
	public String toString() {
		return "아이디 : " +memberId + ", 이름 : "+memberName;
	}


}


