package admin.action;

import java.io.File;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class adminEditAction extends ActionSupport {

	private	int pNum;
	private	String pName;
	private	int pPrice;
	private	String pColor;
	private	String pSize;
	private	String pInnerContent;
	private	String pOuterContent;
	private String pAuthor;
	private	int pAmount;
	private String pCategory;

	private File[] uploads;
	private String[] uploadsFileName;
	private String[] uploadsContentType;
	private String fileUploadPath = "C:/uploadFile/";

	private adminDTO paramClass;
	private adminDTO resultClass;

	public String adminEdit() throws Exception {
		
		paramClass = new adminDTO();
		
		paramClass.setpNum(getpNum());
		paramClass.setpName(getpName());
		paramClass.setpPrice(getpPrice());
		paramClass.setpColor(getpColor());
		paramClass.setpSize(getpSize());
		paramClass.setpInnerContent(getpInnerContent());
		paramClass.setpOuterContent(getpOuterContent());
		paramClass.setpAmount(getpAmount());
		paramClass.setpCategory(getpCategory());
		
		adminDAO.adminEdit(paramClass);
		return SUCCESS;
	}
	
	
	public String adminDelete() throws Exception{
		
		adminDAO.adminDelete(pNum);
		return SUCCESS;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("수정할 글번호"+getpNum());
		resultClass = adminDAO.adminSelectOne(getpNum());
		
		return SUCCESS;
	}


	public adminDTO getResultClass() {
		return resultClass;
	}


	public void setResultClass(adminDTO resultClass) {
		this.resultClass = resultClass;
	}


	public adminDTO getParamClass() {
		return paramClass;
	}


	public void setParamClass(adminDTO paramClass) {
		this.paramClass = paramClass;
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


	public String getpAuthor() {
		return pAuthor;
	}


	public void setpAuthor(String pAuthor) {
		this.pAuthor = pAuthor;
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


	public File[] getUploads() {
		return uploads;
	}


	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}


	public String[] getUploadsFileName() {
		return uploadsFileName;
	}


	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}


	public String[] getUploadsContentType() {
		return uploadsContentType;
	}


	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}


	public String getFileUploadPath() {
		return fileUploadPath;
	}


	public void setFileUploadPath(String fileUploadPath) {
		this.fileUploadPath = fileUploadPath;
	}


}
