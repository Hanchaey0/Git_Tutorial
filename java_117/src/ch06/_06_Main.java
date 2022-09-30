package ch06;

public class _06_Main{
	public static void main(String[] args) {
		/*         * 다형성 :          
		 *         하나의 부모 참조변수로부터 여러타입의 자식 객체을 참조할 수 있는것.  
		 *        즉 부모타입의 참조변수로 자식타입의 객체를 다룰수 있는 것이 다형성.       
		 *        상속이 전제조건이다.        
		 *               
		 * - 장점 : 모든 클래스를 부모 자료형 하나로 쉽게 관리한다. 코드가 간결해진다.        
		 *        특히 매개변수를 부모 자료형 하나로 관리하면 코드가 간결해진다.        
		 *        상위 클래스에서 공통부분의 메서드를 제공하고, 하위클래스에서 추가 메소드를 구현하면 코드양도 줄어들고 유지보수도 간편하다.             
		 *        
		 * - 문법 : 부모타입 참조변수 = new 자식타입();        
		 *         큰 타입             = 작은 타입        
		 *                
		 *         부모타입의 멤버갯수가 자식타입의 멤버갯수보다 적으므로 왼쪽에 부모타입이 와야 한다.       
		 *         다형성을 적용했을지라도 오버라이딩시 자식메서드가 호출된다.       
		 *         (@Override 어노테이션을 생략해도 마찬가지다.)        
		 *                 
		 * - 부모 참조변수로 접근시, 부모타입 클래스의 멤버가 힙메모리에 생성된 객체에 존재해야 한다.        
		 *   자식객체에만 존재하는 멤버에 접근(예. readBook() ) 하기 위해서 다운캐스팅(다운 형변환)한다.        
		 *   상위클래스로 형변환시 묵시적으로 형변환이 되지만, 하위클래스로 형변환 할 때는 명시적으로 형변환한다.        
		 *   즉 상위클래스로 형 변환되었던 하위클래스를 다시 원래 자료형으로 형변환 하는것을 다운캐스팅이라고 한다.       
		 *         
		 * - 다운캐스팅 : 작은타입 = (작은타입)큰타입;   // 부모가 큰 타입, 자식이 작은 타입       
		 *                
		 * - 가상메서드 원리에 따라 move() 메서드는 힙메모리에 존재하는 실제 인스턴스의 메서드이다.        
		 *    오버라이딩시 자식 메서드가 호출된다.        
		 *        
		 *  - if (부모참조변수 instanceof 자식클래스) {  // 부모참조변수가 자식클래스의 인스턴스인지를  확인        
		 *     자식클래스 참조변수 = (자식클래스)부모참조변수;        
		 *     참조변수.멤버메서드();        
		 *    }       
		 *           
		 *    Animal animal = new Human();       
		 *    if(animal instanceof Human) {        
		 *        Human human = (Human) animal;       
		 *        human.readbook();       
		 *    }        
		 */


		//자식 갯수만큼 인스턴스를 생성해야 한다. (클래스 만 개면 인스턴스 만개를 생성해야 한다. 그러나, 부모타입으로 받기만 하면 한 번에 가능.)
		//_06_Animal b1 = new _06_Animal();
		//b1.move();

		//_06_Human b2 = new _06_Human();
		//b2.move();

		//_06_Tiger b3 = new _06_Tiger();
		//b3.move();

		//다형성 적용
		//System.out.println(" === 다형성 적용 === ");
		//부모클래스 참조변수 = new 자식클래스(); 
		// _06_Animal b4 = new _06_Human();
		//b4.move();


		//_06_Animal b5 = new _06_Tiger();
		//b5.move();

		//이렇게하면 위랑 똑같음.

		//매개변수를 통한 다형성 적용
		
		System.out.println(" === 매개변수를 통한 다형성 적용 === ");
		moveAnimal(new _06_Human()); // _06_Animal animal = new _06_Human();
		System.out.println();
		moveAnimal(new _06_Tiger()); // _06_Animal animal = new _06_Tiger(); 부모클래스 참조변수 = new 자식클래스
		System.out.println();
		moveAnimal(new _06_Eagle());


	} //main

	//	public static void moveAnimal1(_06_Human human) {
	//	human.move();
	//}
	//public static void moveAnimal2(_06_Animal tiger) {
	//tiger.move();
	//}
	//-->위와 같이 하면 100개 호출하려면 100개 만들어야함. 하나로 가능.
	public static void moveAnimal(_06_Animal animal) {
		animal.move();

		//if체크
		if(animal instanceof _06_Human) {
			_06_Human human=(_06_Human)animal; //작은타입 참조변수 = (작은타입)큰타입; 부모가 큰 타입, 자식이 작은 타입. 
			//다운 캐스팅
			human.readBook();//타이거 안에 있는 리드북을 가져오기위해 animal에 휴먼타입으로 형변환을 해 주었다.
		}
		if(animal instanceof _06_Tiger) {
			_06_Tiger tiger=(_06_Tiger)animal; //작은타입 참조변수 = (작은타입)큰타입; 부모가 큰 타입, 자식이 작은 타입. 
			tiger.hunting();
			//다운 캐스팅
		}
		if(animal instanceof _06_Eagle) {
			_06_Eagle eagle =(_06_Eagle)animal;
			eagle.flying();
		}
	}
}