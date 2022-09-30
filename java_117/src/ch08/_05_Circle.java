package ch08;

/*
 * 마커 인터페이스 : 구현할 메서드가 없는 인터페이스
 * 예 )클론에이블 : 객체를 복제할 때 사용하는 인터페이스로서 Cloneable 인터페이스에서 구현할 메서드는 없다.
 * 하지만, clone()을 하지않으면 복제 되지 않는다.
 * clone()메서드 호출시 implements Cloneable을 하지 않으면CloneNotSupportedException예외가 발생한다.
 */
public class _05_Circle implements Cloneable {
					
	int radius;
	_05_Point point; //클래스명 참조변수;
	//상속을 하지 않고도 접근해서 정보 가져올 수 있는 거
	//밖으로 빼내야 로컬변수가 아닌 클래스 내에서도 다 쓸 수 있게 된다.
	//new랑 떨어져 있어도 됨.
	
	public _05_Circle() {}
	public _05_Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new _05_Point(x, y);
	}
	
	@Override
	public String toString() {
		return "원점은 "+point.toString()+"이고, 반지름은 "+radius+"이다.";
	}
	
	//clone() : 복제메서드
	//CloneNotSupportedException : 클래스의 clone() 메서드가 지원되지 않았을 경우의 예외클래스
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//super.는 오브젝트를 말하는 것. 오브젝트는 반환형.
	//조상인 Object를 반환하면 모든 클래스에 있는 정보를 복제할 수 있다. 무슨타입인지 불분명하면 오브젝트로 반환하면 됨.
	//오브젝트라는 상위 메서드에게 throws 떠넘긴다.
}
