package ch04;

public class _03_Bus {
	//멤버변수
	int busnumber; //버스번호
	int passengerCount; //승객수
	int money; 			//버스 수입
	
	//디폴트 생성자
	public _03_Bus() {}
	
	//매개변수 생성자
	public _03_Bus(int busnumber) {
		this.busnumber = busnumber;
	}
	//멤버메서드 - 버스타다
	public void take(int money) {
		passengerCount++; 		//승객수 증가
		this.money += money;	//버스수입 증가
	}
	public void showInfo() {
		System.out.println("버스번호 : " + busnumber + ", 승객수 : " + passengerCount + ", 버스수입 : " + money);
	}


		
	}




