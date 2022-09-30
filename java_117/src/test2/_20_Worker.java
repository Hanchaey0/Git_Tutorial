package test2;

public class _20_Worker{
	private String id;  //"hong1234"
	private String name; // "홍길동"
	private String email;  // "hong@naver.com"

	//생성자
	public _20_Worker(){}
	public _20_Worker(String id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}

	//멤버메서드
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id= id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		
		this.email=email;
	}

	public void showWorkerInfo() { //정상일 때 출력{
	System.out.println("id : "+id+", name : "+name+", email : "+email);
	}
}