package cart.model;

public class cartDTO {
	
	int cPnum;
	int cAmount;
	String cOrderer;
	String cPname;
	int cPprice;
	
	public String getcPname() {
		return cPname;
	}
	public void setcPname(String cPname) {
		this.cPname = cPname;
	}
	public int getcPprice() {
		return cPprice;
	}
	public void setcPprice(int cPprice) {
		this.cPprice = cPprice;
	}
	public int getcPnum() {
		return cPnum;
	}
	public void setcPnum(int cPnum) {
		this.cPnum = cPnum;
	}
	public int getcAmount() {
		return cAmount;
	}
	public void setcAmount(int cAmount) {
		this.cAmount = cAmount;
	}
	public String getcOrderer() {
		return cOrderer;
	}
	public void setcOrderer(String cOrderer) {
		this.cOrderer = cOrderer;
	}
	
	
	
}
