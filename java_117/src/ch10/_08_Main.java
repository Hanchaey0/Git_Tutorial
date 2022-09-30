package ch10;

import java.util.Scanner;

public class _08_Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" === 정상 종료 === ");


		_08_MemberInfo in = new _08_MemberInfo();

		try {
			readMemberInfo();
			in.showMemberInfo();
		}catch(_08_InvalidNameException b) {
			System.out.println(b.getMessage());
		}catch(_08_InvalidAgeException c) {
			System.out.println(c.getMessage());
		}finally {
			System.out.println(" ==== finally ==== ");
			sc.close();
		}

	}		
	// readMemerInfo()호출, 예외처리, 정상이면 showMemberInfo


	public static _08_MemberInfo readMemberInfo() throws _08_InvalidNameException, _08_InvalidAgeException{ 
		String name = readName();
		int age = readAge();

		return new _08_MemberInfo(name, age);
	}


	//두 메서드 호출




	public static String readName() throws _08_InvalidNameException{ 	
		System.out.println("이름을 입력하세요 : ");
		//강제예외 발생 :  이름은 2자 이상이어야합니다showwrongName호출 
		String name = sc.next();
		if(name.length()<2) {
			_08_InvalidNameException i = new _08_InvalidNameException();
			i.setWrongName(name);
			i.showWrongName();
			throw new _08_InvalidNameException("이름은 2자 이상이어야합니다.");
		}else {
			return name;
		}
	}


	public static int readAge() throws _08_InvalidAgeException {
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age<2) {
			_08_InvalidAgeException a = new _08_InvalidAgeException();
			a.setWrongAge(age);
			a.showWrongAge();

			throw new _08_InvalidAgeException("나이는 0살 이상이어야합니다.");
		}else {
			return age;
			//나이는 0이상이어야하바니다.
		}
	}
}
