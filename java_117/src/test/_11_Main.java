package test;

public class  _11_Main {
	public static void main(String[] args) {


		//매개변수를 통한 다형성 적용
		//부모클래스 참조변수 = new자식클래스();
		System.out.println(" == 매개변수를 통한 다형성 적용 ==");
		callAnimal(new _11_Eagle());
		System.out.println();
		callAnimal(new _11_Tiger());
		System.out.println();
		callAnimal(new _11_Human());
	}

	public static void callAnimal(_11_Animal animal){
		animal.move();//부모클래스타입 참조변수
		

		if(animal instanceof _11_Eagle){
			_11_Eagle eagle = (_11_Eagle) animal;
			eagle.flying();
		}
		if(animal instanceof _11_Tiger) {
			_11_Tiger tiger = (_11_Tiger)animal;
			tiger.hunting();
		}
		if(animal instanceof _11_Human) {
			_11_Human human = (_11_Human)animal;
			human.readBook();
			human.listenMusci();
		}
	}
}