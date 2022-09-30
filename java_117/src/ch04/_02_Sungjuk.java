package ch04;

public class _02_Sungjuk {
	
	//멤버변수
	private int kor;
	private int eng;
	private int math;
	
	//디폴트 생성자
	public _02_Sungjuk() {
	}
	
	//매개변수 생성자
	public _02_Sungjuk(int kor, int eng, int math) {
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	}

	//메서드
	// setter, getter
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng =eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math =math;
	}
	public int getMath() {
		return math;
	}
	
	//getTotal(국, 영, 수) - 3과목의 합계
	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	//getAvg(국, 영, 수) - 3과목의 평균
	public int getAvg() {
		int avg =getTotal()/3;
		return avg;
	}	
	//getGrade() -switch
		

		public char getGrade() {
			char grade = ' ';
			
			switch ((int)(getAvg())/10) {
			case 10 :
			case 9 : grade = 'A';
					break;
			case 8 : grade = 'B';
					break;	
			case 7 : grade = 'C';
					break;	
			case 6 : grade = 'D';
					break;	
			default : grade = 'F';
			
			}
			return grade;
		}

	//printInfo
	public void printInfo() {
		System.out.println("국어 점수 : "+getKor());
		System.out.println("영어 점수 : "+getEng());
		System.out.println("수학 점수 : "+getMath());
		System.out.println("3과목 합계 : "+getTotal());
		System.out.println("3과목 평균 : "+getAvg());
		System.out.println("학점 : "+getGrade());
		
		
	}
}