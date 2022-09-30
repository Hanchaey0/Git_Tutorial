package ch06;

public class _08_Main {
	public static void main(String[] args) {
		_08_Buyer buy = new _08_Buyer(5000000,0);
		//자식 매개변수 생성자를 이용한 값전달
		buy.buy(new _08_Notebook("삼성","갤럭시 노트북",1000000, 0.01, 0.1));
		buy.buy(new _08_Tv("LG","OLED TV", 1500000,0.01, 0.2));
		buy.printInfo();
		// ("삼성", "삼성 노트북", bonusRatio 0.01, salePoint0.1)
	}
	
	
	}





