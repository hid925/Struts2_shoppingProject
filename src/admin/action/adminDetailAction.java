package admin.action;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class adminDetailAction extends ActionSupport {

	private adminDTO resultClass;
	
	private int pNum;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("디테일 글 가져오기");
		
		System.out.println("글번호는?"+getpNum());
		resultClass = adminDAO.adminSelectOne(getpNum());

		System.out.println("리드힛 증가");
		adminDAO.adminUpdateReadHit(getpNum());

		return SUCCESS;
	}


	public adminDTO getResultClass() {
		return resultClass;
	}

	public void setResultClass(adminDTO resultClass) {
		this.resultClass = resultClass;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	

}
