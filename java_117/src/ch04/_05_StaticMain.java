package ch04;

public class _05_StaticMain {
	public static void main(String[] args) {
	
	System.out.println(_05_Static.getSerialNum());
		
		//1001
		_05_Static lee = new _05_Static();
		lee.setStudenName("이지원");
		System.out.println("seraiNum : " + _05_Static.getSerialNum());
		System.out.println(lee.getStudentName()+ " 학번 : "+lee.getStudentID());
		
		//1002
		_05_Static son = new _05_Static();
		son.setStudenName("손수경");
		System.out.println("serialNum : "+ _05_Static.getSerialNum());
		System.out.println(son.getStudentName()+"학번 : "+ son.studentID);
		

		
		/*
		 * seraiNum : 1001
		이지원 학번 : 1001
		serialNum : 1002
		손수경학번 : 1002
		 */
	}

}
