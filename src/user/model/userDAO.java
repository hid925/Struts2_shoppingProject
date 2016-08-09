package user.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class userDAO {
	private static SqlMapClient sqlMapper;
	userDTO user;
	
	public userDTO getUser() {
		return user;
	}
	public void setUser(userDTO user) {
		this.user = user;
	}
	
	static {		
		try {
			Reader reader = Resources.getResourceAsReader("sql/sqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean userInsert(userDTO user) {
		try {
			System.out.println("eee");
			sqlMapper.insert("insertUser",user);
			System.out.println("e222");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static userDTO confirmLogin(userDTO user) {
		userDTO result;
		try {
			System.out.println("1234");
			result=(userDTO)sqlMapper.queryForObject("selectUserById", user.getId());
			System.out.println("5678");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}

}
