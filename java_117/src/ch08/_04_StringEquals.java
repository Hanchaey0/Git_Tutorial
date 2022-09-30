package ch08;

public class _04_StringEquals {
	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
/*물리적 동일(주소 동일) : 1000 1000   .. 100, 이상원  => Object의 equals() : 주소값 비교 => 물리적 동일 :  "==", 오버라이드 안된 equals()
논리적 동일(값 동일)    : 2000          ... 100, 이상원  => 오버라이드         :  값 비교 => 논리적 동일(값 동일) :  오버라이드된 equals()
 */


/*
false
true
false
true
 */