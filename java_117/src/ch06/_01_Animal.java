package ch06;
//부모클래스(공통)
public class _01_Animal {
	//멤버변수
	protected String kind ;	//종류
	private int legs;		//다리
	//디폴트 생성자
	public _01_Animal() {}

	//매개변수 생성자
	public _01_Animal(String kind, int legs) {
	this.kind = kind;
	this.legs = legs;
	}

	//멤버메서드(get,set,printInfo)
	public void eat() {
		System.out.println("먹다~~");
	}
	public void sleep() {
		System.out.println("자다~~");
	}
	public void play() {
		System.out.println("놀다~~");
	}
	public String getKind() {
		return kind;
	}
	public void setKind (String kind) {
		this.kind = kind;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs=legs;
	}
	public void printInfo() {
		System.out.println("kind:"+kind +", legs: "+legs);
				
	}
}
