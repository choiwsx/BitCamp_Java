package org.wonseok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_jdbc {

	
	
	
	public Test_jdbc() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		try {
			//드라이버 불러오기
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");

			//커넥션 객체 얻어오기
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		}catch(SQLException E)
		{
			System.out.println("JDBC 연결 실패");
		}
		return null;
	}
	
	public static Connection getConnection(String driver, String url, String user,String password) {
		try {
			//드라이버 불러오기
			Class.forName(driver);
			System.out.println("드라이버 검색 성공!");

			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		}catch(SQLException E)
		{
			System.out.println("JDBC 연결 실패");
		}
		return null;
	}
}
