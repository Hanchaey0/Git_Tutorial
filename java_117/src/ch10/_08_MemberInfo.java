package ch10;

public class _08_MemberInfo {
	//멤버변수
	private String name;
	private int age;

	public _08_MemberInfo() {}
	public _08_MemberInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	//정상일 때 호출
	public void showMemberInfo() {
		System.out.println("이름 : "+name+"\n나이 : "+age);
	}
}
