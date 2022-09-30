package ch05;

public class _04_Main {
	public static void main(String[] args) {
		//3명의 student 정보를 배열로 출력
		
		_04_Student[] s1 = new _04_Student[3];
		
		s1[0] = new _04_Student("홍길동",20,"rlfehd@naver.com");
		s1[1] = new _04_Student("김아니",21,"awrrasd@naver.com");
		s1[2] = new _04_Student("이라니",23,"rdsdhd@naver.com");
		
		for(int i=0;i<s1.length;i++) {
			s1[i].showInfo();
		}
		

		
		
		
		
	}
}
