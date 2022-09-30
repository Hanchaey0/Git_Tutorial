package ch03;

public class _03_Car {
		 
	//멤버변수
	private String brand;
	private String color;
	private int speed;
	
	//생성자
	//디폴트 생성자
	public _03_Car() {
		
	}
	//매개변수 생성자 : 매개변수의 값을 멤버변수로 전달
	public _03_Car(String brand, String color, int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	//멤버메서드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void printInfo() {

		System.out.println("Car brand : " + brand);
		System.out.println("Car color : " + color);
		System.out.println("Car speed : " + speed);

		
	}


}

