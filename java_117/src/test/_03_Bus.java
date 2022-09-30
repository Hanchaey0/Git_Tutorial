package test;
 public class _03_Bus{

int busNumber;
int pessengerCount;
int money;

	public _03_Bus(){}
	public _03_Bus(int busNumber){
	 this.busNumber = busNumber;}


	public void take(int money){
		pessengerCount++;
		this.money -= money;
	}
	public void showInfo(){
	System.out.println("버스 번호 : " + busNumber + ", 승객 수 : "+ pessengerCount + ", 버스 수입 : " +money);
	}
	
}
