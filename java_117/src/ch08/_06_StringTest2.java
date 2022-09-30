package ch08;

public class _06_StringTest2 {
	public static void main(String[] args) {


		// 371
		// value 변수 : private final char[] value => final이므로 한번 생성된 문자열은 변경되지 않는다.
		// 따라서 값이 변경되거나 추가시 새로운 문자열이 생성된다.
		String javaStr = new String("java");
		String androidStr = new String("android");

		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(javaStr));

		javaStr = javaStr.concat (androidStr);

		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javaStr));

	}
}