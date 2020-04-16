package my_jdbc_test;

import java.sql.Connection;

import org.wonseok.JdbcUtil;
import org.wonseok.Test_jdbc;

public class MyJdbc {


	public static void main(String[] args) {
		Connection conn = Test_jdbc.getConnection();
		System.out.println(conn);
	}
}
