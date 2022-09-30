package ch07;

//자식클래스
public class _05_SamsungTV implements _05_Tv{

	@Override
	public void turnOn() {
		System.out.println(_05_Tv.BRAND+"TV를 켜다.");
	}

	@Override
	public void turnOff() {
		System.out.println(_05_Tv.BRAND+"TV를 끄다.");
	}
}
