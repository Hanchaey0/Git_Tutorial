package ch06;

//자식클래스
public class _08_Notebook extends _08_ElectroProduct {
	private int price;  //모델명
	private double bonusRatio;   //보너스 비율
	private double saleRatio;   //할인율

	//디폴트 생성자
	public _08_Notebook() {}	
	//매개변수 생성자
	public _08_Notebook(String brandName, String modelName, int price,double bonusRatio, double saleRatio ) {
		super(brandName, modelName);
		this.price = price;
		this.bonusRatio = bonusRatio; //적립비율
		this.saleRatio = saleRatio;

	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	public int getPayPrice () {
		return (int)(price*(100.0-saleRatio)/100.0);
	}
	//보너스포인트
	public double getBonusPoint() {
		return (int)(getPayPrice()*bonusRatio/100.0);
	}

	public void printInfo(){
		super.printInfo();
		System.out.println("가격 : "+price);
		System.out.println("할인율 : "+saleRatio*100+"%");
		System.out.println("결제금액 : " +getPayPrice());
		System.out.println("적립비율 : " +bonusRatio*100+"%");
		System.out.println("보너스포인트 : "+getBonusPoint());
		System.out.println("================");
	}

}
