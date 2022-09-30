package ch12;

public class _01_CompanyMain {
	public static void main(String[] args) {
		//setter를 통해 값 전달 및 출력(단 싱클톤 패턴을 이용해 접근)
		
		_01_Company com1 = _01_Company.getInstance();
		_01_Company com2 = _01_Company.getInstance();
		
		com1.setAddress("벚꽃로20길");
		com1.setCompanyName("집");
		com1.setTelNo("01096224146");
		com1.printInfo();
	
		com2.setAddress("서울..");
		com2.setCompanyName("아직 모르겠음");
		com2.setTelNo("48912313");
		com2.printInfo();
		//com1.printInfo()를여기에 쓰면 덮어씌여서 바뀐다.
	}

}
