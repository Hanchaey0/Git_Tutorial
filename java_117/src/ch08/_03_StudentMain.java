package ch08;

public class _03_StudentMain {
	public static void main(String[] args) {
		//359page. 17행~끝
		//365page 14행~17행@hashcode()
		_03_Student studentLee = new _03_Student(100, "이상원");
		_03_Student studentLee2 = studentLee;
		_03_Student studentSang = new _03_Student(100, "이상원");
		
		if(studentLee == studentLee2) 
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
			else
				System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
			
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다.");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
	System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
	System.out.println("studentSang의 hashCode : "+studentLee.hashCode());
	
	System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentLee));
	System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentSang));
	
	
	}
	
	
} 
//358page@toString + 361o @equals() + p365 5~8행@hashcode()
 class _03_Student  {
	 
	 int studentId;
	 String studentName;
	 
	 public _03_Student(int studentId, String studentName) {
		 this.studentId = studentId;
		 this.studentName = studentName;
	 }
	 public String toString() {
		 return studentId + ","+studentName;
	 }
	 @Override
	 public boolean equals(Object obj) {
		 if(obj instanceof _03_Student) {
			 _03_Student std = (_03_Student)obj;
			 if(this.studentId == std.studentId)
				 return true;
			 else return false;
		 }
		 return false;
	 }
	 @Override
	 public int hashCode() {
		 return studentId;
	 }
 
 }
 
 
	
 
 
