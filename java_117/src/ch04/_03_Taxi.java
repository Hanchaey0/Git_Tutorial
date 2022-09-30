package ch04;

public class _03_Taxi {
	
	//멤버변수
	String taxinumber; //택시번호
	int passengerCount; //승객수
	int money; 			//택시 수입
	
	//디폴트 생성자
	public _03_Taxi() {}
	
	
	//매개변수 생성자
	public _03_Taxi(String taxinumber) {
		this.taxinumber = taxinumber;
	}
	
	//멤버메서드 - 택시타다
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	//showInfo
	public void showInfo() {
		System.out.println("택시번호 : " +taxinumber+ ", 승객수 : "+passengerCount+", 택시 수입 : "+money);
	}

}
