package cart.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDTO;
import cart.model.cartDAO;
import cart.model.cartDTO;

public class cartViewAction extends ActionSupport {

	private String userId;
	
	private List<cartDTO> cList = new ArrayList<cartDTO>();

	@Override
	public String execute() throws Exception {
		
		System.out.println(getUserId());
		
		cList = cartDAO.cartSelectbyID(getUserId());
		
		System.out.println(cList.size());
		
/*		for(int i=0; i<cList.size(); i++){
			System.out.println("cList¿ë");
			System.out.println(cList.get(i).getcPname());
			System.out.println(cList.get(i).getcPnum());
			System.out.println(cList.get(i).getcPprice());
			System.out.println(cList.get(i).getcOrderer());
			System.out.println(cList.get(i).getcAmount());
		}*/
		
		return SUCCESS;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<cartDTO> getcList() {
		return cList;
	}

	public void setcList(List<cartDTO> cList) {
		this.cList = cList;
	}



}
