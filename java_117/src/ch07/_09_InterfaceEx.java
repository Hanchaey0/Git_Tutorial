package ch07;

public class _09_InterfaceEx {
	public static void main(String[] args) {
		A09 a09 = new A09();
		a09.autoPlay(new B09()); //다형성, 인터페이스의 유연성
		C09 c09=new C09();
		c09.play();
		
	}
}

class A09{
	public void autoPlay(I09 i09) {	//매개변수에 다형성적용
		i09.play();
	}
}

interface I09{
	public void play(); //추상메서드
	
}

 //I09인터페이스 구현

class B09 implements I09{
//추상메서드 구현 -> 	B09 클래스 - play() 호출
	@Override
	public void play() {
		System.out.println("B09클래스 - play()");
	}

}class C09 implements I09{
	//추상메서드 구현 -> 	B09 클래스 - play() 호출
		@Override
		public void play() {
			System.out.println("C09클래스 - play()");
		}

	}