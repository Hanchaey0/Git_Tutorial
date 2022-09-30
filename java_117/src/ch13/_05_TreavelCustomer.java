package ch13;

public class _05_TreavelCustomer {
	//481
	private String name;
	private int	age;
	private int price;
	
	public _05_TreavelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}

	public String toString() {
		return "name : "+name + "age : "+age+"Price : "+price;
	}
}
