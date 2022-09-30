package test2;

import java.util.Scanner;

public class _20_Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		try{ 
			_20_Worker v = readWorkerInfo();
			v.showWorkerInfo();
		}catch(_20_IDFormatException e){
			System.out.println(e.getMessage());
		}catch(_20_NameFormatException b) {
			System.out.println(b.getMessage());
		}finally{
			System.out.println(" ==null== 종료 ==== ");
			sc.close();
		}

	}

	public static _20_Worker readWorkerInfo() throws _20_IDFormatException, _20_NameFormatException{
		String read = readId();
		String read2 = readName();
		String read3 = readEmail();
		

		return new _20_Worker(read, read2, read3);
	}

	public static String readId() throws _20_IDFormatException {
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		
		if(id.equals(null)) {
			_20_IDFormatException id2 = new _20_IDFormatException();
			id2.setWrongid(id);
			id2.showWrongID();
			throw new _20_IDFormatException("ID는 null일 수 없습니다.");
		}else if(id.length()<8||id.length()>20) {
			throw new _20_IDFormatException("ID는 8자 이상, 20자 미만입니다.");
		}else {
			return id;
		}
	}
	public static String readName() throws _20_NameFormatException {
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		if(name.equals(null)) {
		_20_NameFormatException name2 = new _20_NameFormatException();
		name2.setWrongname(name);
		name2.showWrongName();
		throw new _20_NameFormatException("name은 null일 수 없습니다.");
	}else {
		return name;
	}
		
}
	public static String readEmail() {
		_20_Worker wo = new _20_Worker();
		System.out.println("email을 입력하세요.");
		String email = sc.next();
		wo.setEmail(email);
			return email;
		}
	}

