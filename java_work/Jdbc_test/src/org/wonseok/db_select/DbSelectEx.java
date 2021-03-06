package org.wonseok.db_select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.wonseok.Test_jdbc;

public class DbSelectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = Test_jdbc.getConnection();

		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBERS";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.printf("%d %s %s %s\n",no,name,email,phone);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
