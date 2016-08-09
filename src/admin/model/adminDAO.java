package admin.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class adminDAO {

	private static SqlMapClient sqlMapper;
	adminDTO admin;

	static {		
		try {
			Reader reader = Resources.getResourceAsReader("sql/sqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public adminDTO getAdmin() {return admin;}
	public void setAdmin(adminDTO admin) {this.admin = admin;}
	
	public static boolean adminInsert(adminDTO paramClass) {
		try {
			sqlMapper.insert("insertAdmin",paramClass);
			System.out.println("insertAdmin 실행완료");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertAdmin 실행실패");
			return false;
		}
		
	}
	public static List<adminDTO> adminSelectAll() {
		System.out.println("check2>");

		try {
			System.out.println("실행됨?");
			return sqlMapper.queryForList("adminSelectAll");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("아니안됨 ㅎ");
			e.printStackTrace();
			return null;

		}
		
		
	}
	public static adminDTO adminSelectOne(int pNum) {
		
		try {
			return (adminDTO) sqlMapper.queryForObject("adminSelectOne", pNum);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}
		
	}
	public static void adminUpdateReadHit(int qNum) {
		try {
			System.out.println("readHit sql");
			sqlMapper.update("adminUpdateReadHit",qNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static adminDTO adminLastNo() {
		try {
			System.out.println("adminLastNo sql");
			return (adminDTO)sqlMapper.queryForObject("adminLastNo");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	
	}
	public static boolean adminUpdateFile(adminDTO paramClass) {
		try {
			System.out.println("adminUpdateFile sql");
			sqlMapper.update("adminUpdateFile", paramClass);
			return true;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public static void adminEdit(adminDTO paramClass) {
		try {
			System.out.println("adminEdit sql");
			sqlMapper.update("adminEdit",paramClass);
		} catch (SQLException e) {
			System.out.println("adminEdit sql error");
			e.printStackTrace();
		}
		
	}
	public static void adminDelete(int pNum) {
		
		try {
			System.out.println("adminDelete sql");
			sqlMapper.delete("adminDelete", pNum);
		} catch (SQLException e) {
			System.out.println("adminEdit sql error");
			e.printStackTrace();
		}
		
	}


}
