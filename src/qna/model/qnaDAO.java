package qna.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class qnaDAO {
	private static SqlMapClient sqlMapper;
	qnaDTO qna;
	
	static {		
		try {
			Reader reader = Resources.getResourceAsReader("sql/sqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<qnaDTO> qnaList(int temp) {
		try {
			System.out.println("ListQna ����Ϸ�");	
			return sqlMapper.queryForList("qnaList", temp);
		}catch (SQLException e) {
			System.out.println("qnalist ����");	
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean qnaInsert(qnaDTO qna) {
		try {
			sqlMapper.insert("insertQna",qna);
			System.out.println("insertQna ����Ϸ�");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertQna �������");
			return false;
		}
	}
	public qnaDTO getQna() {return qna;}
	public void setQna(qnaDTO qna) {this.qna = qna;}

}




