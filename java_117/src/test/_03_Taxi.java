package test;

public class _03_Taxi{
	
	String taxiNumber;
	int pessengerCount;
	int money;

	public _03_Taxi(){}
	
	public _03_Taxi(String taxiNumber){
		this.taxiNumber = taxiNumber;}

	public void take(int money){
		pessengerCount++;
		this.money = money;
	}
	
	public void showInfo(){
		System.out.println("택시번호 : " + taxiNumber + ", 승객 수 : "+ pessengerCount + ", 택시 수입 : " +money);
	}

}