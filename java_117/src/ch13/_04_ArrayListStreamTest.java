package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//477
public class _04_ArrayListStreamTest {
	   /*
	    * p473 스트림이란?
	    *   여러 자료의 처리에 대한 기능을 구현해 놓은 클래스가 스트림(Stream)이다.
	    *   스트림을 활용하면 배열, 컬렉션 등의 자료를 일관성있게 처리할 수 있다.
	    *   자료에 따라 기능을 각각 새로 구현하는 것이 아니라 처리해야 하는 자료가 무엇인지와 상관없이
	    *   같은 방식으로 메서드를 호출할 수 있기 때문이다. 즉 자료를 추상화했다고 표현한다.
	    * 
	    * p 478 스트림(stream) 특징
	    * - 자료의 대상과 관계없이 동일한 연산을 수행
	    *    . 배열, 컬렉션을 대상으로 동일한 연산을 수행함
	    *    . 일관성있는 연산으로 자료의 처리를 쉽고 간단하게 함
	    *    
	    *  - 한번 생성하고 사용한 스트림은 재사용할 수 없음
	    *    . 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
	    *    . 다른 연산을 위해서는 새로운 스트림을 생성함
	    *    
	    *  - 스트림 연산은 기존 자료를 변경하지 않음
	    *    . 자료에 대한 스트림을 생성하면 별도의 메모리 공간을 사용하므로 기존 자료를 변경하지 않음
	    *    
	    *  - 스트림 연산은 중간 연ㄴ산과 최종 연산으로 구분됨
	    *    . 스트림에 대한 중간 연산은 여러개 적용될 수 있지만, 최종연산은 마지막에 한번만 적용됨
	    *    . 최종연산이 호출되어야 중간연산의 결과가 모두 적용됨. 이른 '지연 연산'이라 함 
	    *    
	    *  - 스트림 연산 - 중간 연산
	    *   . 중간연산 - filter(), map()
	    *     조건에 맞는 요소를 추출(filter())하거나 요소를 변환함(map())
	    *     filter() - 조건에 넣고 그 조건에 맞는 참인 경우에만 추출
	    *     map() - 클래스가 가진 자료 중 이름만 출력하는 경우 사용
	    *     
	    *   - 스트림 연산 - 최종 연산
	    *    . 스트림의 자료를 소모하면서 연산을 수행
	    *    . 최종 연산 후에 스트림은 더이상 다른 연산을 적용할 수 없음
	    *    . forEach() : 요소를 하나씩 꺼내옴
	    *    . count() : 요소의 개수
	    *    . sum() : 요소의 합  
	    *    
	    */
	      
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tom");
		sList.add("Ed");
		sList.add("Jack");
		
		Stream<String> st = sList.stream();
		st.forEach(s->System.out.print(s+" "));
		System.out.println();
	
		sList.stream().sorted().forEach(s->System.out.println(s));
	}

}
