package user.action;

import com.opensymphony.xwork2.ActionSupport;


import user.model.userDAO;
import user.model.userDTO;

public class joinAction extends ActionSupport{
	
	private userDTO resultClass;
	
	private String id;
	private String password;
	private String pwdQuestion;
	private String pwdAnswer;
	private String name;
	private String address;
	private String postcode;
	private String address1;
	private String address2;
	private String phone;
	private String phone1;
	private String phone2;
	private String phone3;
	private String email;
	private String email1;
	private String email2;
	

	
	public String form() throws Exception
	{return SUCCESS;}
	
	@Override
	public String execute() throws Exception {
		resultClass = new userDTO();
		
		address1 = getAddress1();
		address2 = getAddress2();
		address = address1 + address2;
		
		phone1 = getPhone1();
		phone2 = getPhone2();
		phone3 = getPhone3();
		phone = phone1 + phone2 + phone3;
		
		email1 = getEmail1();
		email2 = getEmail2();
		email = email1 + email2;
		
		resultClass.setId(getId());
		System.out.println(resultClass.getId());
		resultClass.setPassword(getPassword());
		System.out.println(resultClass.getPassword());
		resultClass.setPwdQuestion(getPwdQuestion());
		System.out.println(resultClass.getPwdQuestion());
		resultClass.setPwdAnswer(getPwdAnswer());
		System.out.println(resultClass.getPwdAnswer());
		resultClass.setName(getName());
		System.out.println(resultClass.getName());
		resultClass.setAddress(address);
		System.out.println(resultClass.getAddress());
		resultClass.setPostcode(getPostcode());
		System.out.println(resultClass.getPostcode());
		resultClass.setPhone(phone);
		System.out.println(resultClass.getPhone());
		resultClass.setEmail(email);
		System.out.println(resultClass.getEmail());
		
		userDAO.userInsert(resultClass);
		System.out.print("admin succeeded");
		
		return SUCCESS;
	}
	
	
	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public userDTO getResultClass() {
		return resultClass;
	}

	public void setResultClass(userDTO resultClass) {
		this.resultClass = resultClass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwdQuestion() {
		return pwdQuestion;
	}

	public void setPwdQuestion(String pwdQuestion) {
		this.pwdQuestion = pwdQuestion;
	}

	public String getPwdAnswer() {
		return pwdAnswer;
	}

	public void setPwdAnswer(String pwdAnswer) {
		this.pwdAnswer = pwdAnswer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	
}
