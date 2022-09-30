package ch15_beforPJ;

import java.util.Scanner;

public class _01_PhoneManager {
	static Scanner keybord = new Scanner(System.in);
	
	private static _01_PhoneManager instance = new _01_PhoneManager();
	private _01_PhoneManager() {}
	
	public static _01_PhoneManager getInstance() {
		if(instance == null) {
			instance = new _01_PhoneManager();
		}
		return instance;
	}

	
	public void inputData() {	//데이터를 읽는 메서드
		System.out.print("이름 : ");
		String name = keybord.nextLine();

		System.out.println("전화번호 : ");
		String phoneNumber = keybord.nextLine();

		System.out.println("생년월일 : ");
		String birthday = keybord.nextLine();

		_01_PhoneInfo phoneInfo = new _01_PhoneInfo(name, phoneNumber, birthday);

		System.out.println();
		System.out.println(" === phoneInfo === ");

		phoneInfo.showPhoneInfo();
		System.out.println("=============================");
		System.out.println();

	}
	//2.데이터수정 메뉴2
	public void updateData() {
		
		System.out.println("updateData()");
	}
	//3. 데이터 삭제 메뉴3
	public void deleteData() {
		System.out.println("deleteData");
	}
	//4. 데이터 조회 - 메뉴4
	public void seleteDate() {
		System.out.println("seleteData");
	}
}


