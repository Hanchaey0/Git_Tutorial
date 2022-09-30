package test;

public class _18_Worker { 
	private int id;      // 101
	private String name; // "홍길동"
	private String email;   // "hong@naver.com"
	// 생성자

	public _18_Worker (int id,String name,String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	// 멤버메서드   
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String geteamil(){
		return email;
	}

	@Override
	public String toString(){
		return "id = "+id+", name = "+name+", email = "+email;

	}   

}
