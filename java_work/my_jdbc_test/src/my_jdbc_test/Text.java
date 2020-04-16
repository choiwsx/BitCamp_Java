package my_jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Text {

	public Text() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이브 검색 성공!");
			
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e)
		{
			System.out.println("JDBC 연결 실패");
		}
		
	}
}
