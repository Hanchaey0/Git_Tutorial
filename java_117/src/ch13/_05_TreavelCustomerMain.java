package ch13;

import java.util.ArrayList;
import java.util.List;

public class _05_TreavelCustomerMain {
//482
	
	public static void main(String[] args) {
		_05_TreavelCustomer cus1 = new _05_TreavelCustomer("이순신", 40, 100);
		_05_TreavelCustomer cus2 = new _05_TreavelCustomer("김유신", 20, 100);
		_05_TreavelCustomer cus3 = new _05_TreavelCustomer("홍길동", 13, 50);
		List<_05_TreavelCustomer> cus = new ArrayList<>();
		cus.add(cus1);
		cus.add(cus2);
		cus.add(cus3);
		System.out.println(" == 고객 명단 추가된 순서대로 출력 ==");
		cus.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = cus.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은 : "+total + "입니다.");
		
		System.out.println(" == 20세 이상 고객 명단 정렬하여 출력 == ");
		cus.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
