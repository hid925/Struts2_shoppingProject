package product.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import admin.model.adminDTO;
import product.model.productDAO;

public class productListAction extends ActionSupport{
	private adminDTO admin = new adminDTO();
	private List<adminDTO> list = new ArrayList<adminDTO>();	
	
	@Override
	public String execute() throws Exception {
	
		return SUCCESS;
	}

	
	public String outer() throws Exception{
		System.out.println("Outer sql");
		list = productDAO.adminSelectOuter();
		System.out.println(list.size());
		if(list == null){
			System.out.println("Outer from DB error");
		}
		return SUCCESS;
	}
	
	public String top() throws Exception{
		System.out.println("top sql");
		list = productDAO.adminSelectTop();
		System.out.println(list.size());
		if(list == null){
			System.out.println("top from DB error");
		}
		return SUCCESS;
	}
	
	public String bottom() throws Exception{
		System.out.println("bottom sql");
		list = productDAO.adminSelectBottom();
		System.out.println(list.size());
		if(list == null){
			System.out.println("bottom from DB error");
		}
		return SUCCESS;
	}
	
	public String acc() throws Exception{
		System.out.println("acc sql");
		list = productDAO.adminSelectAcc();
		System.out.println(list.size());
		if(list == null){
			System.out.println("acc from DB error");
		}
		return SUCCESS;
	}
	
	
	
	public adminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(adminDTO admin) {
		this.admin = admin;
	}

	public List<adminDTO> getList() {
		return list;
	}

	public void setList(List<adminDTO> list) {
		this.list = list;
	}


}
