package ch06;

public class _02_Car{
	protected String kind;
	private int speed;
	
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind()	{
		return kind;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed()	{
		return speed;
	}
	
	
	public void carInfo() {
		System.out.println("kind : "+kind+", speed : "+speed);
		
	}

}
