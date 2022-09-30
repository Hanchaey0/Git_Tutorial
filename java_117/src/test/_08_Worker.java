package test;
public class _08_Worker{

	private String workerName;  //이름
	private int money; 		//금액

	public _08_Worker(){}

	public _08_Worker(String workerName, int money ){
		this.workerName = workerName;
		this.money = money;
	}
	public void setWorkerName(String workerName){
		this.workerName=workerName;
	}
	public String getWorkerName(){
		return workerName;
	}
	public void setMoney(int money){
		this.money=money;
	}
	public int getMoney(){
		return money;
	}
	public void wooriDeposit (_08_WooriBank wi){
		wi.deposit(1000);
		this.money -=1000;
	}
	public void shinhanDeposit (_08_ShinhanBank sb){
		sb.deposit(3000);
		this.money -=3000;
	}
	public void printInfo(){
		System.out.println(workerName+"의 남은 돈은, "+money+"원입니다.");
	}
}