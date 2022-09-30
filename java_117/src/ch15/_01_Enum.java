package ch15;


public class _01_Enum {
	enum Animal{CAT, DOG, FISH}
	/*
	 * enum : 열거형
	 * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
	 * 2. 작성방법 : enum열거형명{상수1,상수2 .. 상수n}
	 * 3. 용도 : 제한된 상수값만을 사용하고자 할 때
	 * 4. 접근방법 : static처럼 열거형명.상수
	 * 5. 특징 : switch(변수/수식)에서 변수타입으로 enum을 사용할 수 있다.
	 * 			ordinal()메서드를 이용해서 순서값을 얻을 수 있다.
	 * 			ordinal()메서드는 0부터 시작한다.
	 */

	
	private Animal kind;
	private String name;
	
	public _01_Enum() {}
	public _01_Enum(Animal kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public void setKind(Animal kind) {
		this.kind = kind;
	}
	public Animal getKind() {
		return kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
