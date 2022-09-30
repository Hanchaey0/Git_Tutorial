package ch13;

public class _06_Member {
	
	//멤버변수
	private int memberId;
	private String memberName;
	
	//생성자
	public _06_Member() {}
	public _06_Member(int memberId, String memberName) {
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
	
	@Override
	public String toString() {
		return "아이디 : " +memberId + ", 이름 : "+memberName;
	}
}
