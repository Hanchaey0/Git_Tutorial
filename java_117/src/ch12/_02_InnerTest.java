package ch12;
//453p 
public class _02_InnerTest {
		public static void main(String[] args) {
			_02_OutClass out = new _02_OutClass();
			System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
			out.usingClass();

}
}
