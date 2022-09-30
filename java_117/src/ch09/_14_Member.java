package ch09;

public class _14_Member {
	//p.424
	//멤버변수
	private int memberId;
	private String memberName;
	
	//생성자
	public _14_Member() {}
	public _14_Member(int memberId, String memberName) {
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
	//hashCode(). equals()재정의 427p.
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _14_Member) {
			_14_Member mem =(_14_Member)obj;
			if(this.memberId == mem.memberId)
				return true;
			else
				return false;
			
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "아이디 : " +memberId + ", 이름 : "+memberName;
	}


}
