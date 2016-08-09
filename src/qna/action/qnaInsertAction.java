package qna.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import admin.model.adminDAO;
import admin.model.adminDTO;
import qna.model.qnaDAO;
import qna.model.qnaDTO;

public class qnaInsertAction extends ActionSupport{
	
	private qnaDTO qna;
	private adminDTO admin;
	
	private int qnaNum;
	private int pRecNum; 
	private String qnaTitle;
	private String qnaName;
	private String qnaContents;
	private Date qnaDate;

	public String form() throws Exception {
		admin = new adminDTO();
		System.out.println(getpRecNum());
		admin.setpNum(getpRecNum());
		System.out.println(admin.getpNum());
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		qna = new qnaDTO();
		qna.setpRecNum(getpRecNum());
		qna.setQnaTitle(getQnaTitle());
		qna.setQnaName(getQnaName());
		qna.setQnaContents(getQnaContents());

		qnaDAO.qnaInsert(qna);
		return SUCCESS;
	}
	
	public qnaDTO getQna() {
		return qna;
	}

	public void setQna(qnaDTO qna) {
		this.qna = qna;
	}

	public int getQnaNum() {
		return qnaNum;
	}

	public void setQnaNum(int qnaNum) {
		this.qnaNum = qnaNum;
	}

	public int getpRecNum() {
		return pRecNum;
	}

	public void setpRecNum(int pRecNum) {
		this.pRecNum = pRecNum;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaName() {
		return qnaName;
	}

	public void setQnaName(String qnaName) {
		this.qnaName = qnaName;
	}

	public String getQnaContents() {
		return qnaContents;
	}

	public void setQnaContents(String qnaContents) {
		this.qnaContents = qnaContents;
	}

	public Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public adminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(adminDTO admin) {
		this.admin = admin;
	}

}
