package ch06;


//구매자
public class _08_Buyer  {	
	int myMoney = 1000000;	//소지금액
	int bonusPoint;
	//매개변수의 다향성
	public _08_Buyer ( int myMoney, int bonusPoint) {
		this.myMoney = myMoney;
		this.bonusPoint =bonusPoint;
		System.out.println("===================");
	}
	public int getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {

		this.bonusPoint = bonusPoint;
	}


	public void buy(_08_ElectroProduct et) {
		et.printInfo();

		if (et instanceof _08_Notebook){
			_08_Notebook noteBook = (_08_Notebook) et;
			if(myMoney < noteBook.getPayPrice()) {
				System.out.println("================");
				System.out.println("잔액이 부족합니다.");
				return;
			}else { 
				System.out.println(noteBook.getModelName()+"을 구매하셨습니다.");
				myMoney -= noteBook.getPayPrice();
				bonusPoint += noteBook.getBonusPoint();
				System.out.println("================");
			}
		}
		if (et instanceof _08_Tv){
			_08_Tv tv = (_08_Tv) et;
			if(myMoney < tv.getPayPrice()) {
				System.out.println("잔액이 부족합니다.");
				return;
			}
			else { 
				System.out.println(et.getModelName()+"을 구매하셨습니다.");
				myMoney -= tv.getPayPrice();
				bonusPoint += tv.getBonusPoint();
			}
			System.out.println("================");
		}

	}

		public void printInfo() {
			System.out.println("잔액 : "+myMoney);
			System.out.println("누적포인트 : "+bonusPoint);
			//		현재 남은돈  : myMoney 
			//		보너스 포인트 : bonusPoint
		}
	}





