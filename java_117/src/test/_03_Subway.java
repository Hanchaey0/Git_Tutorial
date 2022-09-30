
package test;
public class _03_Subway{
	String lineNumber;
	int pessengerCount;
	int money;

	public _03_Subway(){}
	public _03_Subway(String lineNumber){
		this.lineNumber = lineNumber;}


	public void take(int money){
		pessengerCount++;
		this.money = money;
	}
	public void showInfo(){
		System.out.println("지하철 노선 : " + lineNumber + ", 승객 수 : "+ pessengerCount + ", 지하철 수입 : " +money);
	}

}