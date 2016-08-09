package admin.action;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class adminWriteAction extends ActionSupport {

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
	private Date pWdate;
	private int pReadHit=0;

	private File[] uploads;
	private String[] uploadsFileName;
	private String[] uploadsContentType;
	private String fileUploadPath = "C:/uploadFile/";

	private adminDTO resultClass;
	private adminDTO paramClass;
 
	
	public String form() throws Exception{
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
/*		System.out.println(admin.getpNum()); 	
		System.out.println(admin.getpName());
		System.out.println(admin.getpPrice());
		System.out.println(admin.getpColor());
		System.out.println(admin.getpSize());
		System.out.println(admin.getpInnerContent());
		System.out.println(admin.getpOuterContent());
		System.out.println(admin.getpAmount());
		System.out.println(admin.getpCategory());
		System.out.println(admin.getpWdate());
		System.out.println(admin.getpAuthor());
*/	
	
		paramClass = new adminDTO();
		resultClass = new adminDTO();
		
		paramClass.setpName(getpName());
		paramClass.setpPrice(getpPrice());
		paramClass.setpColor(getpColor());
		paramClass.setpSize(getpSize());
		paramClass.setpInnerContent(getpInnerContent());
		paramClass.setpOuterContent(getpOuterContent());
		paramClass.setpAmount(getpAmount());
		paramClass.setpCategory(getpCategory());
		paramClass.setpAuthor(getpAuthor()); //session���� ���� ����
		
		adminDAO.adminInsert(paramClass);
		
		if(uploads.length == 0){
			return SUCCESS;
		}else{
			for(int i=0; i<uploads.length;i++){
				System.out.println("���ε� ���� ���� "+uploads.length);
				if(getUploads()[i] != null){
					System.out.println("uploads part"+i+"��°");
					
					resultClass = (adminDTO)adminDAO.adminLastNo(); //������ �� �Խù� ��ȣ
					String file_name = "file_" + resultClass.getpNum() ; // �����̸� ����
					
					String file_ext = getUploadsFileName()[i].substring( //������ Ȯ���� ¥��..? ��?
							getUploadsFileName()[i].lastIndexOf('.')+1,
							getUploadsFileName()[i].length());
		
					File destFile = new File(fileUploadPath + file_name+"_"+ i + "." + file_ext );//������ ����� ��� + �̸�����
					FileUtils.copyFile(getUploads()[i], destFile); // ���� ����
				
					if(i==0){
						System.out.println("1��°");
						paramClass.setpNum(resultClass.getpNum());// ���� �� �Խù� ��ȣ�� �Ķ�Ŭ������ ����
						paramClass.setpOrgFile1(getUploadsFileName()[i]); //�������� �����̸� �����ͼ� �Ķ��� ����
						paramClass.setpFileName1(file_name+"_"+ i + "." + file_ext); //���� �̸��� �Ķ��� ����
						
					}if(i==1){
						System.out.println("2��°");
						paramClass.setpNum(resultClass.getpNum());// ���� �� �Խù� ��ȣ�� �Ķ�Ŭ������ ����
						paramClass.setpOrgFile2(getUploadsFileName()[i]); //�������� �����̸� �����ͼ� �Ķ��� ����
						paramClass.setpFileName2(file_name+"_"+ i + "." + file_ext); //���� �̸��� �Ķ��� ����
					}if(i==2){
						System.out.println("3��°");
						paramClass.setpNum(resultClass.getpNum());// ���� �� �Խù� ��ȣ�� �Ķ�Ŭ������ ����
						paramClass.setpOrgFile3(getUploadsFileName()[i]); //�������� �����̸� �����ͼ� �Ķ��� ����
						paramClass.setpFileName3(file_name+"_"+ i + "." + file_ext); //���� �̸��� �Ķ��� ����
					}	
				}	
			}
			adminDAO.adminUpdateFile(paramClass); //���� ������ ��� ����
			
			return SUCCESS;
		}
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

	public String getFileUploadPath() {
		return fileUploadPath;
	}

	public void setFileUploadPath(String fileUploadPath) {
		this.fileUploadPath = fileUploadPath;
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

	public Date getpWdate() {
		return pWdate;
	}

	public void setpWdate(Date pWdate) {
		this.pWdate = pWdate;
	}

	public int getpReadHit() {
		return pReadHit;
	}

	public void setpReadHit(int pReadHit) {
		this.pReadHit = pReadHit;
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

}