package ch11;
//551
public class _12_Person {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;
	
	public _12_Person() {}
	
	public _12_Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
	return name+","+job;
	}
	

}
