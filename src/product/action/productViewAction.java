package product.action;

import java.io.File;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class productViewAction extends ActionSupport{
	
	private adminDTO resultClass;
	
	private	int pNum;
	private	String pName;
	private	int pPrice;
	private	String pColor;
	private	String pSize;
	private	String pInnerContent;
	private	String pOuterContent;
	private	int pAmount;
	private String pCategory;
	private String pFileName;
	private String pOrgFile;
	private Date pWdate;
	
	@Override
	public String execute() throws Exception {
		resultClass = adminDAO.adminSelectOne(getpNum());	
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

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public String getpColor() {
		return pColor;
	}

	public void setpColor(String pColor) {
		this.pColor = pColor;
	}

	public String getpSize() {
		return pSize;
	}

	public void setpSize(String pSize) {
		this.pSize = pSize;
	}

	public String getpInnerContent() {
		return pInnerContent;
	}

	public void setpInnerContent(String pInnerContent) {
		this.pInnerContent = pInnerContent;
	}

	public String getpOuterContent() {
		return pOuterContent;
	}

	public void setpOuterContent(String pOuterContent) {
		this.pOuterContent = pOuterContent;
	}

	public int getpAmount() {
		return pAmount;
	}

	public void setpAmount(int pAmount) {
		this.pAmount = pAmount;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public String getpFileName() {
		return pFileName;
	}

	public void setpFileName(String pFileName) {
		this.pFileName = pFileName;
	}

	public String getpOrgFile() {
		return pOrgFile;
	}

	public void setpOrgFile(String pOrgFile) {
		this.pOrgFile = pOrgFile;
	}

	public Date getpWdate() {
		return pWdate;
	}

	public void setpWdate(Date pWdate) {
		this.pWdate = pWdate;
	}



}
