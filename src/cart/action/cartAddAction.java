package cart.action;

import com.opensymphony.xwork2.ActionSupport;

import cart.model.cartDAO;
import cart.model.cartDTO;

public class cartAddAction extends ActionSupport {
	
	private int cPnum;
	private int cAmount;
	private String cOrderer;
	private String cPname;
	private int cPprice;

	private cartDTO cart;

	@Override
	public String execute() throws Exception {
		
		cart = new cartDTO();
		cart.setcPnum(getcPnum());
		cart.setcAmount(getcAmount());
		cart.setcOrderer(getcOrderer());
		cart.setcPname(getcPname());
		cart.setcPprice(getcPprice());
		
/*		System.out.println("cPum "+getcPnum());
		System.out.println("cAmount "+getcAmount());
		System.out.println("cOrderer "+getcOrderer());
		System.out.println("getcPname "+getcPname());
		System.out.println("getcPprice "+getcPprice());
*/		
		cartDAO.cartAdd(cart);
		
		return SUCCESS;
	}

	public String form() throws Exception{
		
		return SUCCESS;
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

	public String getcPname() {
		return cPname;
	}

	public void setcPname(String cPname) {
		this.cPname = cPname;
	}

	public cartDTO getCart() {
		return cart;
	}

	public void setCart(cartDTO cart) {
		this.cart = cart;
	}

	public int getcPprice() {
		return cPprice;
	}

	public void setcPprice(int cPprice) {
		this.cPprice = cPprice;
	}
}
