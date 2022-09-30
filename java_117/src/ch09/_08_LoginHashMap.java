package ch09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class _08_LoginHashMap {
	public static void main(String[] args) {

		/*[시험]
		 * 1. id, pwd 5건을 hashtable에 저장(); 해시맵의 정보를 저장해두는 곳
		 * 2. 콘솔로부터 id, pwd를 입력 받는다(로그인을 위해)
		 * 		1과 2를 비교해서
		 * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
		 * 	   아이디가 있으면 비밀번호와 비교해서 일치시"로그인 성공" 출력
		 * 					불일치시 "비밀번호 불일치" 출력
		 * 4.Q나q를 입력시 종료 : exit, break; return써도됨....
		 * 
		 * key		value
		 * id		password
		 * "park"	"park1234"
		 * "kim"	"lim1234"
		 * "lee"	"lee1234"
		 * "son"	"son1234"
		 * "choi"	"choi1234"
		 * 
		 */

		Map<String, String> map = new HashMap <String, String>();
		map.put("park", "park1234");
		map.put("kim", "lim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("choi", "choi1234");

		System.out.println("방법 1");
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) { //다음 key가 있으면
			String key = iterator.next(); //가져와서 key에 담아
			String value = map.get(key); //key가져와서 멤버 정보로 대입
			System.out.println("key = "+key+", value = "+value); //.toString 생략 되어 있다.
		}
		System.out.println("방법 2");
		for(Map.Entry<String, String> str : map.entrySet()) {
			String key = str.getKey();
			String value = str.getValue();
			System.out.println("key = "+key+", value = "+value);
		}
		//스캐너 선언
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("ID를 입력하세요 : ");
			String id = sc.next();
			if(id.equals("q")||id.equals("Q")) {
				break;
			}else if(map.containsKey(id)){ //아이디 일치
				System.out.println("패스워드 입력하세요");
				String password = sc.next();
				if(map.containsValue(password))  { //map.get(id) =>key로 값을가져오기
					System.out.println("로그인 성공!");
				}else {
					System.out.println("비밀번호 불일치");
				}
			}else{
				System.out.println("ID불일치");
			}	
		}while(true);
		System.out.println();
		System.out.println("로그인 종료");
		sc.close();
	}
}






