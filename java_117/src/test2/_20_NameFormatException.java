package test2;

public class _20_NameFormatException  extends Exception {
	String wrongname;

	public _20_NameFormatException(){}
	public _20_NameFormatException(String message){
		super(message);
	}

	public void setWrongname(String wrongname){
		if(wrongname.length()<2){
			System.out.println("잘못된 이름입니다.");
		}else{
		}
		this.wrongname =wrongname;
	}

	public String getWrongname(){
		return wrongname;
	}

	public void showWrongName(){ 
		System.out.println(wrongname+"은 잘못된 이름입니다.");
	}
}


