package ch14;

public class _05_VoteMain {
public static void main(String[] args) {
	
	//객체 5개, 스레드 5개
	//각자 영향을 받지 않고, 각자 일을 한다.
	
	Thread local1 = new Thread(new _05_VoteThread(), "서울");
	Thread local2 = new Thread(new _05_VoteThread(), "충주");
	Thread local3 = new Thread(new _05_VoteThread(), "포천");
	Thread local4 = new Thread(new _05_VoteThread(), "가평");
	Thread local5 = new Thread(new _05_VoteThread(), "청평");
	
	local1.start();
	local2.start();
	local3.start();
	local4.start();
	local5.start();
	
}
}
