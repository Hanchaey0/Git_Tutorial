package ch06;


//부모 클래스
public class _08_ElectroProduct {	
	//멤버변수
	private String brandName;	//브랜드명
	private String modelName;
	//private int price; 			//가격
//	private int bonusPoint; 	//보너스 포인트
	
	//디폴트 생성자
	public _08_ElectroProduct() {}	
	//매개변수 생성자
	public _08_ElectroProduct(String brandName, String modelName) {
		//this.price = price;
		this.brandName = brandName;
		this.modelName = modelName;
		//this.price = price;
		//this.bonusPoint = bonusPoint;

	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName() {
		return modelName;
	}

	public void printInfo(){
	System.out.println("브랜드명 : "+brandName);
	System.out.println("모델명 : "+modelName);
		
	}
}

