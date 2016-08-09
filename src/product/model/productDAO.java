package product.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import admin.model.adminDAO;
import admin.model.adminDTO;

public class productDAO {

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

	
	public static List<adminDTO> adminSelectOuter() {
		try {
			System.out.println("selectOuter sql");	
			return sqlMapper.queryForList("adminSelectOuter");
		}catch (SQLException e) {
			System.out.println("selectOuter sql error");	
			e.printStackTrace();
			return null;
		}
	}	
	
		public static List<adminDTO> adminSelectTop() {
			try {
				System.out.println("selectTop sql");	
				return sqlMapper.queryForList("adminSelectTop");
			} catch (SQLException e) {
				System.out.println("selectTop sql error");	
				e.printStackTrace();
				return null;
			}
		}
		
		public static List<adminDTO> adminSelectBottom() {
			try {
				System.out.println("selectBottom sql");					
				return sqlMapper.queryForList("adminSelectBottom");
			} catch (SQLException e) {
				System.out.println("selectBottom sql error");									
				e.printStackTrace();
				return null;
			}
		}
		
		public static List<adminDTO> adminSelectAcc() {
			try {
				System.out.println("selectAcc sql");					
				return sqlMapper.queryForList("adminSelectAcc");
			} catch (SQLException e) {
				System.out.println("selectAcc sql error");					
				e.printStackTrace();
				return null;
			}
		}			
}

