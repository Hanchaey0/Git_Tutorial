package test;

public class _06_MemberMain {

	public static void main(String[] args){
	
	_06_Member mem = new _06_Member(); //클래스명 참조변수 = new 연산자 (클래스 명);
	mem.juminNo = 19980101;
	mem.name = "송혜교";
	mem.address = "서울시 마포구";
	mem.salary = 3000000;

	mem.printinfo();
	}
}
