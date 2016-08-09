package cart.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class cartDAO {

	private static SqlMapClient sqlMapper;

	static {		
		try {
			Reader reader = Resources.getResourceAsReader("sql/sqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void cartAdd(cartDTO cart) {
		
		try {
			System.out.println("cart add sql");
			sqlMapper.insert("insertCart",cart);
		} catch (SQLException e) {
			System.out.println("cart add sql error");
			e.printStackTrace();
		}
		
			
	}

	public static List<cartDTO> cartSelectbyID(String userId) {
		try {
			System.out.println("cart select by id sql");
			return sqlMapper.queryForList("cartSelectbyID", userId);
			
		} catch (SQLException e) {
			System.out.println("cart select by id sql error");
			e.printStackTrace();
			return null;
		}
		
	}
	
}
