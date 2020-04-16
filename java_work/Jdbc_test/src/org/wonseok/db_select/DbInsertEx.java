package org.wonseok.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.wonseok.Test_jdbc;

public class DbInsertEx {
	public static Connection conn =  Test_jdbc.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "INSERT INTO MEMBERS(name,email,phone) VALUES(?,?,?)";
	
	
	
	// dao 역할
	public static void insert(String name, String email, String phone) {
//		String name = "TEST1";
//		String email = "test1@shop.com";
//		String phone = "010-5555-5555";	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			int cnt = pstmt.executeUpdate();
			if(cnt>0)
			{
				System.out.println("입력성공");
			}else
			{
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally
		{
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// Controller 역할
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성명 입력: ");
		String name = scan.next();
		System.out.print("이메일 입력: ");
		String email = scan.next();
		System.out.print("번호 입력: ");
		String phone = scan.next();
		insert(name,email,phone);
		System.out.println("입.력.성.공");
		DbSelectEx2.main(null);
	}
}
