package admin.action;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class adminDetailAction extends ActionSupport {

	private adminDTO resultClass;
	
	private int pNum;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("������ �� ��������");
		
		System.out.println("�۹�ȣ��?"+getpNum());
		resultClass = adminDAO.adminSelectOne(getpNum());

		System.out.println("������ ����");
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
