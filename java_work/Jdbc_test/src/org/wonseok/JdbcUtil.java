package org.wonseok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	
	
	
	public JdbcUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
			
		try {
			
			//드라이버 불러오기
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");

			//커넥션 객체 얻어오기
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn => " + conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		}catch(SQLException E)
		{
			System.out.println("JDBC 연결 실패");
		}
	}


}
