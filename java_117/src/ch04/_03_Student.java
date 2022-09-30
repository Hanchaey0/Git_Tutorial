package ch04;

public class _03_Student {
	//멤버변수
	public String studentName; //학생이름
	public int grade;			//학년
	public int money;			//용돈

	//디폴트 생성자
	public _03_Student() {}
	
	//매개변수 생성자 : 멤버변수에 전달
	public _03_Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	//멤버메서드 - 버스타다	//int i와 같다. 값을 안 넣어주면. new _03_Bus(100)와도 같다. call by reference라고도 부른다
	public void takeBus(_03_Bus bs) {
		//_03_Bus bs = new _03_Bus(100);
		bs.take(1000);
		this.money -= 1000;	
	}
	public void takeSubway (_03_Subway sy) {
		sy.take(1400);
		this.money -= 1400;
	}
	public void takeTaxi (_03_Taxi ty) {
		ty.take(2000);
		this.money -= 2000;
	} //콜바이레퍼런스
		
		
		public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 : "+ money +"원입니다.");
	
		}
	}
	

