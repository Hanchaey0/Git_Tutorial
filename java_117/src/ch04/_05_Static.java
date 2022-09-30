package ch04;


//p.184
public class _05_Static { 
	private static int serialNum = 1000;
	public int studentID; 			//학번
	public static String studentName;		//이름

	
	//디폴트 생성자
	public _05_Static() {
		serialNum++;  //학생이 증가할 때마다 증가
		studentID = serialNum;
	}
	public static void setSerialNum(int seriaNum) {
		_05_Static.serialNum = serialNum; //클래스명.static변수
	}
	//static메서드 내에서 멤버변수 사용불가, 멤버변수는 인스턴스(new)가 생성될 때 만들어지는 인스턴스 변수
	public static int getSerialNum() {
		//studentName = "홍길동";  => 오류
		//static 메서드에서 static변수만 사용가능
		//studentName은 멤버변수이며, 객체생성을 안했으므로 메모리에 안올라간 상태임
		//따라서 선언시 studentName에 static을 붙이면 사용 가능.
		return serialNum;
	}
	public void setStudenName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
				return studentName;
	}
	public void setStudenID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID() {
				return studentID;
	}
}
