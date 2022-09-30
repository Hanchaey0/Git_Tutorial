package ch09;

public class _09_GenericPrinter<T> {
	//new class 클래스명:09_09_GenericPrinter<T> -> _09_GenericPrinter로 만들어졌다.
	
	/*
	 * T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간이다.
	 * 따라서 static은 T의 자료형이 결정되는 시점보다 빠르기 때문에 
	 * static 변수의 자료형이나, static 메서드 내부의 자료형으로 T를 사용할 수 없다.
	 * 단 제네릭클래스가 static이면 예외 
	 */
	
	private T material;
	
	public void setMaterial (T material) { //_09_Powder material= new _09_Powder();
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	@Override
	public String toString() {
		return material.toString();
}

}


