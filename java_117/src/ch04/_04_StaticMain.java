package ch04;

public class _04_StaticMain {
	public static void main(String[] args) {
		
		_04_Static lee = new _04_Static();
		lee.setStudenName("이지원");
		System.out.println(lee.serialNum);
		System.out.println(lee.getStudentName()+ " 학번 : "+lee.getStudentID());
		
		
		_04_Static son = new _04_Static();
		son.setStudenName("손수경");
		System.out.println("serialNum : "+ son.serialNum);
		System.out.println("serialNum : "+ _04_Static.serialNum);
		System.out.println(son.getStudentName()+"학번 : "+ son.studentID);
		
	}

}
