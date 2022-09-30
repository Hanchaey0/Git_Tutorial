package spring.mvc.pj_117_csg.dto;

public class SoldviewDTO {
	
	public String pdName;
	public int totalMoney;
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		totalMoney = totalMoney;
	}
	@Override
	public String toString() {
		return "SoldviewDTO [pdName=" + pdName  + ", TotalMoney=" + totalMoney + "]";
	}
	
	
}
