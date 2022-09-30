package ch15_beforPJ;

import java.util.Scanner;

public class _01_Main {
	public static void main(String[] args) {
		
		_01_PhoneManager com1 = _01_PhoneManager.getInstance();
		//1 데이터입력 메뉴1
		Scanner keybord = new Scanner(System.in);
		_01_ManuViewer sh = new _01_ManuViewer();

		int choice;

		while(true) {
			sh.showMenu();
			choice = keybord.nextInt();
			keybord.nextLine();

			switch(choice) {
			case 1 : 
				com1.inputData();
				break;
			case 2 : 
				com1.updateData();
				break;
			case 3 :
				com1.deleteData();
				break;
			case 4 :
				com1.seleteDate();
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다");
				keybord.close();
				return;
			}
		}


	}
}
