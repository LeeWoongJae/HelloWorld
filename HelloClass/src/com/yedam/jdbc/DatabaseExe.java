package com.yedam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. DriverManager
 * 2. connection
 * 3. preparedStatement
 * 4. execute
 * 5. ResultSet
 * 6. 출력
 */
public class DatabaseExe {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String password = "tiger";
		String sql = "insert into product(p_code , p_name , p_price) values(202 , '치토스', 1000)";
		
		try {
			// 사용중인 라이브러리 확인
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, password);
			conn.setAutoCommit(false);// 자동 커밋 불가능하게 막기
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("연결된 드라이버가 없습니다. 확인해주세요.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			if(r > 0) {
				conn.commit();
				System.out.println(r+"건 등록이 되었습니다.");
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
		}
		
		sql = "delete from product where p_code=202";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			if(r > 0) {
				conn.commit();
				System.out.println(r+"건 삭제 되었습니다.");
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
		}
		
		//statement 객체
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select p_code, p_name, p_price from product");
			
			System.out.println("상품코드   상품이름       가격");
			System.out.println("---------------------------------");
			while(rs.next()) {
				
				System.out.println(rs.getInt("p_code") + //
						"   " + rs.getString("p_name") + //
						"   " + rs.getInt("p_price")
						);
			}// end of while
			System.out.println("---------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	
	}// end of main
}
