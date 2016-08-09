package admin.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDAO;
import admin.model.adminDTO;
import admin.action.pagingAction;

public class adminListAction extends ActionSupport{
	
	private int currentPage = 1; 
	private int totalCount; 
	private int blockCount = 10; 
	private int blockPage = 5; 
	private String pagingHtml; 
	private pagingAction page; 


	private List<adminDTO> list = new ArrayList<adminDTO>();	
		
	@Override
	public String execute() throws Exception {
		
		System.out.println("check1> list 받아오기 체크");
		list = adminDAO.adminSelectAll();
		if(list == null){
			System.out.println("쿼리 안날라옴 ㅎㅎ");
		}
		
		totalCount = list.size();
		page = new pagingAction(currentPage,totalCount,blockCount,blockPage);
		pagingHtml = page.getPagingHtml().toString();
		
		int lastCount = totalCount;
		
		if(page.getEndCount() < totalCount){
			lastCount = page.getEndCount() + 1;
		}
		
		list = list.subList(page.getStartCount(), lastCount);				

		return SUCCESS;
	}
	

	public List<adminDTO> getList() {
		return list;
	}

	public void setList(List<adminDTO> list) {
		this.list = list;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public int getBlockCount() {
		return blockCount;
	}


	public void setBlockCount(int blockCount) {
		this.blockCount = blockCount;
	}


	public int getBlockPage() {
		return blockPage;
	}


	public void setBlockPage(int blockPage) {
		this.blockPage = blockPage;
	}


	public String getPagingHtml() {
		return pagingHtml;
	}


	public void setPagingHtml(String pagingHtml) {
		this.pagingHtml = pagingHtml;
	}


	public pagingAction getPage() {
		return page;
	}


	public void setPage(pagingAction page) {
		this.page = page;
	}
	
}
