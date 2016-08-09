package qna.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import admin.model.adminDTO;
import qna.model.qnaDAO;
import qna.model.qnaDTO;

public class qnaListAction extends ActionSupport{
	private List<qnaDTO> list = new ArrayList<qnaDTO>();	
	
	private int pRecNum;

	@Override
	public String execute() throws Exception {
		System.out.println("qnaList sql");
		list = qnaDAO.qnaList(getpRecNum());
		System.out.println("qnaList Å©±â:"+list.size());
		
		for(int i=0; i<list.size() ; i++){
			System.out.println(list.get(i).getQnaNum());
		}
		
		if(list == null){
			System.out.println("qnaList from DB error");
		}
		return SUCCESS;
	}
	
	
	public List<qnaDTO> getList() {
		return list;
	}

	public void setList(List<qnaDTO> list) {
		this.list = list;
	}

	public int getpRecNum() {
		return pRecNum;
	}


	public void setpRecNum(int pRecNum) {
		this.pRecNum = pRecNum;
	}

	
}
