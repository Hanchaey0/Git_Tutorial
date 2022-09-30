package ch10;

public class _07_IDFormat2 {
	private String userID;
	
	public void setUserID(String userID) throws _07_IDFormatException { //4.throws : 상위메서드에게 던지기 
		if(userID == null) {
			throw new _07_IDFormatException("아이디는 null일 수 없습니다.");//2강제예외발색
		}
		else if (userID.length()<8||userID.length()>20) {
			throw new _07_IDFormatException("아이디는 8자이상 20자 이하로 쓰세요.");
	}
		this.userID = userID;
	}
	public String getUserID() {
		return userID;
	}
	
}
