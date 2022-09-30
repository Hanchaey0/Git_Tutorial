package ch04;

public class _03_Subway {
	//멤버변수
	String lineNumber;
	int passengerCount;
	int money;
	//매개변수 생성자
	public _03_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	//멤버메서드 버스타다
	public void take (int money) {
		passengerCount++; 		//승객수 증가
		this.money += money;
	}
	public void showInfo() {
		System.out.println("지하철노선 : " + lineNumber + ", 승객수 : " + passengerCount + ", 지하철 수입 : " + money);
	}

}
