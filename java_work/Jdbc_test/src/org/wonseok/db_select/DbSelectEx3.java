package org.wonseok.db_select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.wonseok.Test_jdbc;

class Member2 {
	int no;
	String name;
	String email;
	String phone;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Member2(int no, String name, String email, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member2 [no=" + no + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}

public class DbSelectEx3 {
	public static void main(String[] args) {
		Connection conn = Test_jdbc.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM MEMBERS";
		ArrayList<Member2> list = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			list = new ArrayList<Member2>();
			while (rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Member2 dto = new Member2(no, name, email, phone);
				list.add(dto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(Member2 m : list)
			System.out.println(m);

	}
}
