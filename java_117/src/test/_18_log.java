package test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class _18_log {
	public static void main(String[] args) {


		Map<String, String> map = new HashMap <String, String>();
		map.put("hong","hong1234");
		map.put("park" ,"park1234");
		map.put("kim","kim1234");
		map.put("son","son1234");
		map.put("lee","lee1234");

		Iterator <String> i = map.keySet().iterator();
		while(i.hasNext()){
			String key = i.next();
			String value = map.get(key);
			System.out.println("key = "+key+", value = "+value); //.toString 생략 되어 있다.
		}

		for(Map.Entry<String,String>str : map.entrySet()){
			String key = str.getKey();
			String value = str.getValue();
			System.out.println("key = "+key+", value = "+value); //.toString 생략 되어 있다.
		}
		Scanner sc = new Scanner(System.in);
		//sc.next위치 틀림 containsKey,Value참조변수값 틀림 중괄호 위치 틀림
		do{
			System.out.println("Id를 입력하세요 : ");
			String id = sc.next();
			if(id.equals("q")||id.equals("Q")){
				break;
			}else if(map.containsKey(id)){
				System.out.println("비밀번호를 입력하세요.");
				String password = sc.next();
				if(map.containsValue(password)){
					System.out.println("로그인 성공!");
				}else{
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}while(true);
				System.out.println();
				System.out.println("로그인 종료");
				sc.close();
			}
		}

