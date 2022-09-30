package test;

public class _18_Main {
	public static void main(String[] args) {
	_18_WorkerkHashMap map = new _18_WorkerkHashMap();
	_18_Worker hong = new _18_Worker(101 ,"홍길동", "hong@naver.com");
	_18_Worker kim = new _18_Worker(102, "김태희", "kim@naver.com");
	_18_Worker park = new _18_Worker(103, "박명수", "park@naver.com");
	_18_Worker you = new _18_Worker(104, "유느님", "you@naver.com");
	_18_Worker kim2 = new _18_Worker(105, "김현무", "kim@naver.com");
	map.addWorker(hong);
	map.addWorker(kim);
	map.addWorker(park);
	map.addWorker(you);
	map.addWorker(kim2);
	map.printAllWorker();
	//추가 방법 틀림
	map.removeWorker(park.getId());
	map.printAllWorker();
}

}
