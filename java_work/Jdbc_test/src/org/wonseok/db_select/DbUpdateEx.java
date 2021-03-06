package org.wonseok.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.wonseok.Test_jdbc;

public class DbUpdateEx {
	public static Connection conn = Test_jdbc.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "UPDATE MEMBERS SET NAME=?, EMAIL=?, PHONE=? " + "WHERE NO=?";
	int no = 41;

	public static void test(String name, String email, String phone) {
//		String name = "최";
//		String email = "원@석";
//		String phone = "010-199";
		int no = 36;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			pstmt.setInt(4, no);
			int cnt = pstmt.executeUpdate();
			if(cnt >0)
				System.out.println("수정 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
