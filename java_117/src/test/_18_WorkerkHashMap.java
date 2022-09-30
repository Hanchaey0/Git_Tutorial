package test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _18_WorkerkHashMap {

//위치 중괄호 다 틀림................
	
	// 디폴트 생성자에서 HashMap 생성
	Map<Integer,_18_Worker> map;
	public _18_WorkerkHashMap(){
		map = new HashMap<Integer,_18_Worker>();

	}
	// Worker추가
	public void addWorker(_18_Worker wk) {
		map.put(wk.getId(), wk);
	}
	// Worker삭제 : 103번 삭제
	public void removeWorker(int id) {
		// 없으면 존재안함 출력
		if(map.containsKey(id)){
			map.remove(id);
			return;
		}
		System.out.println(id+"존재 안함");
	}
	public void printAllWorker() {
		Iterator <Integer> i = map.keySet().iterator();
		while(i.hasNext()){
			int key = i.next();
			_18_Worker value = map.get(key);
			System.out.println(value);
		}
		for(Map.Entry<Integer,_18_Worker>str:map.entrySet()){
			int key = str.getKey();
			_18_Worker value = str.getValue();
			System.out.println("key = "+key+", value =: "+value);
		}
		System.out.println();
	}
}