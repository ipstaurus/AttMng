package custom.dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import custom.dto.CustomDTO;

public class CustomDAO {
	private static SqlMapClient sqlmap;

	static {
		try {
			String xmlPath = "/custom/dao/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(xmlPath);
			sqlmap = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			System.out.println("SqlMapConfig Parsing Error()" + e.getMessage());
		}
	}

	// 테이블 전체 데이터
	public static ArrayList<CustomDTO> selectAllData() throws SQLException {
		return (ArrayList<CustomDTO>) sqlmap.queryForList("selectAllData");
	}
}
