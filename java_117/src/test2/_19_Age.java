package test2;

public class _19_Age {

	private int age;
	
	public void setAge(int age) throws _19_AgeException{
		if(age<0||age>100){
			throw new _19_AgeException("잘못된 나이입니다.");
		}
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
}


