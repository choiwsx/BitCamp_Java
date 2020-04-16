package org.wonseok.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.wonseok.Test_jdbc;

public class DbDeleteEx {
	public static Connection conn = Test_jdbc.getConnection();
	public static PreparedStatement pstmt = null;
	public static String sql = "DELETE FROM MEMBERS WHERE NO=?";

	public static void delete(int no) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			int cnt = pstmt.executeUpdate();
			if(cnt>0)
			{
				System.out.println("삭제 완료!");
			}
			else
			{
				System.out.println("삭제 실패!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public static void main(String[] args) {
		DbSelectEx2.main(null);
		System.out.print("몇번을 삭제할까요? ");
		Scanner scan = new Scanner(System.in);
		delete(scan.nextInt());
		conn = Test_jdbc.getConnection();
		DbSelectEx2.conn = conn;
		DbSelectEx2.main(null);
		
		
		
	}
}
