package ch15_beforPJ;

//DTO(Data Transfer Object):데이터 전송 객체
public class _01_PhoneInfo {
	
	//멤버변수
	private String name;
	private String phoneNumber;
	private String birthday;
	
	//디폴트 생성자
	public _01_PhoneInfo() {}
	//매개변수 생성자
	public _01_PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday =birthday;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday() {
		return birthday;
	}
	public void showPhoneInfo() {
		System.out.println("name : "+name +", phoneNumber : "+ phoneNumber+", birthday : "+birthday );
	}
	
}
