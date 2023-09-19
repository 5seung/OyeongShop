package com.sesac.oyeongshop;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.Test;

public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con = 
				DriverManager.getConnection(
                // Oracle19 버전인 경우 => "jdbc:oracle:thin:@localhost:1521:orcl"
                // Oracle11 버전인 경우 => "jdbc:oracle:thin:@localhost:1521:XE"
						"jdbc:oracle:thin:@localhost:1521:XE",
						"oyeong",
						"oyeong")){
			System.out.println(con);
			int executeSql = doInsert(con);
			System.out.println("총 "+executeSql+"행 실행했습니다.");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	private int doInsert(Connection con) {

		//INSERT INTO 테이블명(컬럼) VALUES(값);
		final String insertSql	= "INSERT INTO tbl_USER (user_id, pwd, name, use_state, authority, JOIN_DATE)"
								+ "VALUES(?, ?, ?, ?, ?, sysdate)";

		try {
			PreparedStatement pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "test3");//Idx
			pstmt.setString(2, "test");//Name
			pstmt.setString(3, "tester");//InputDay
			pstmt.setString(4, "Y");//InputDay
			pstmt.setString(5, "구매자");//InputDay
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
			return 0;
		}

	}//doInsert
}