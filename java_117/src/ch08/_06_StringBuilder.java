package ch08;

public class _06_StringBuilder {
	// p373
	/*
	 *  StringBuffer와 StringBuilder는 내부에 변경 가능한(final이 아닌) char[]를 변수로 가지고 있다. 
	 *  문자열 변경시 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않는다.
	 *  따라서 문자열을 연결하거나 변경할 경우 두 클래스 중 하나를 사용한다.
	 *  StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만, StringBuilder클래스는 보장되지 않는다.
	 */
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : "+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 bufffer 메모리 주소 : "+System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" proframming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : "+ System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : "+System.identityHashCode(javaStr));
	}	
}
