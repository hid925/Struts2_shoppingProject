package user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import user.model.userDAO;
import user.model.userDTO;

public class loginAction extends ActionSupport implements ModelDriven<userDTO> {
	private userDTO user = new userDTO();
	private Map session;
	
	@Override
	public String execute() throws Exception {
		String userId = user.getId();
		System.out.println(user.getId());
		
		
		String userPwd = user.getPassword();
		System.out.println(user.getPassword());
		user = userDAO.confirmLogin(user);
		System.out.println("11");
		if(user==null){
			return SUCCESS;
		}else{
			String pwd = user.getPassword();
			System.out.println(userPwd);
			System.out.println(user.getPassword());

			String id = user.getId();
			System.out.println(userId);
			System.out.println(user.getId());
			
			if(id.equals(userId)&&pwd.equals(userPwd)){
				System.out.println("로그인 성공");
				session = ActionContext.getContext().getSession();
				session.put("user", user);
				return SUCCESS;
			}else{
				System.out.println("로그인 실패");

				this.addActionMessage("Login Failed");
				return SUCCESS;
			}
		}
	}
	
	public String logout() throws Exception{
		System.out.println("check1>>>");
		session = ActionContext.getContext().getSession();
		System.out.println("check2>>>"+session);
		session.remove("user");
		System.out.println("check3>>>"+session);
		ActionContext.getContext().setSession(session);
		System.out.println("check4>>>");
		return SUCCESS;
		}
	
	public String form() throws Exception{return SUCCESS;}

	
	public userDTO getUser() {
		return user;
	}

	public void setUser(userDTO user) {
		this.user = user;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public userDTO getModel() {
		return user;
	}
	
	
	
	
}
