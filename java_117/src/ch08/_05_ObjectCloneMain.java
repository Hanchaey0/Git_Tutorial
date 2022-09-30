package ch08;

public class _05_ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		_05_Circle circle = new _05_Circle(10, 20, 30);
		_05_Circle copyCircle  = (_05_Circle)circle.clone();
		//반환형이 Object인데 우린 써클로 받는다 그러려면 다운캐스팅으로 타입을 맞춰줘야한다.
		//써클에 있는 toString을 호출하기 위해서. 그건 자식한테만 있는 투스트링이니까.
		//부모에는 없고 자식에만 갖고 있는 정보라서.
		
		
		
		//clone을 하면 멤버변수값은 동일하고, 주소값은 다름.
		System.out.println(circle.toString());		//원점은 x=10, y=20이고, 반지름은 30이다.
		//자식한테만 있는 투스트링 호출
		System.out.println(circle);  //circle.toString()을 호출하는 것고 ㅏ같다.
		// 원점은 x=10, y=20이고, 반지름은 30이다.
		

		System.out.println("실제 주소값 : "+System.identityHashCode(circle));
		System.out.println("실제 주소값 : "+System.identityHashCode(copyCircle));
		//실제 주소값 : 366712642
		//실제 주소값 : 1829164700
	}

}
