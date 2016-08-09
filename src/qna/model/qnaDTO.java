package qna.model;

import java.util.Date;
/*columr°ª 6°³*/
public class qnaDTO {
	private int qnaNum;
	private int pRecNum; 
	private String qnaTitle;
	private String qnaName;
	private String qnaContents;
	private Date qnaDate;
	
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

}
