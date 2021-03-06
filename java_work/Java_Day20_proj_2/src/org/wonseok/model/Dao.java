package org.wonseok.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {
	private String pathname = "src/org/wonseok/resource/students.json";
	private FileReader reader;
	private FileWriter writer;
	public static Connection conn = JdbcUtil.getConnection();
	public static Statement stmt = null;
	public static PreparedStatement pstmt;
	public static ResultSet rs = null;
	public static int getNo;
	public static void setConn(Connection conn)
	{
		Dao.conn = conn;
	}

	private JSONObject getJsonObject() {
		File dataFile = new File(pathname);

		try {
			reader = new FileReader(dataFile);
			if (reader == null) {
				System.out.println("읽어 들일 파일이 없습니다!");
				return null;
			}
			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Member> search(Member dto) {
		ArrayList<Member> list = null;
		
		try {
			if(conn.isClosed())
				conn = JdbcUtil.getConnection();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM MEMBERS WHERE NAME='"+dto.getName()+"' ");
			
			list = new ArrayList<Member>();
			while(rs.next())
			{
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Member newMem = new Member(no, name, email, phone);
				list.add(newMem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	public ArrayList<Member> selectAll() {

		ArrayList<Member> list = null;
		try {
			if(conn.isClosed())
				conn = JdbcUtil.getConnection();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM MEMBERS");
			list = new ArrayList<Member>();
			while(rs.next())
			{
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Member dto = new Member(no, name, email, phone);
				list.add(dto);
				getNo = no;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void selectAll(int click) {

		ArrayList<Member> list = null;
		try {
			if(conn.isClosed())
				conn = JdbcUtil.getConnection();
			
			stmt = conn.createStatement();
			pstmt = conn.prepareStatement("DELETE FROM MEMBERS WHERE NO=?");
			rs = stmt.executeQuery("SELECT * FROM MEMBERS");
			list = new ArrayList<Member>();
			int cnt = 0;
			while(rs.next())
			{
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				Member dto = new Member(no, name, email, phone);
				list.add(dto);
				getNo = no;
				if(cnt==click){
					System.out.println("삭제"+cnt);
					System.out.println(no);
					pstmt.setInt(1, no);
					pstmt.executeUpdate();
//					return no;
				}
				cnt++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void insert(Member dto) {
		conn = JdbcUtil.getConnection();
		int no = getNo;
		String name = dto.getName();
		String email = dto.getEmail();
		String phone = dto.getPhone();
		try {
			pstmt = conn.prepareStatement("INSERT INTO MEMBERS(NAME, EMAIL, PHONE) VALUES(?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			int cnt = pstmt.executeUpdate();
			if(cnt>0)
				System.out.println("입력성공");
			else
				System.out.println("입력실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
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

	public void remove(int temp, boolean check) {
		try {
			if(conn.isClosed())
				conn = JdbcUtil.getConnection();
			if (check) {
				pstmt = conn.prepareStatement("DELETE FROM MEMBERS WHERE NO="+temp+"");
				pstmt.executeUpdate();
			} 
			else {
				selectAll(temp);
				
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	

	}

//	public void remove(int selectedRow, int rowCount) {
//		JSONObject jsonObject = getJsonObject();
//		if (jsonObject == null) {
//			System.out.println("처리 할 데이터가 없습니다.");
//			return;
//		}
//
//		JSONArray jsonArray = jsonObject.getJSONArray("studentArr");
//		Vector<Vector> vector = new Vector<>();
//
//		while(rowCount>0)
//		{
//			jsonArray.remove(selectedRow);
//			rowCount--;
//		}
//
//		File file = new File(pathname);
//		int seq = jsonObject.getInt("seq");
//		JSONObject newObj = new JSONObject();
//		newObj.put("studentArr", jsonArray);
//		newObj.put("seq", seq);
//
//		try {
//			writer = new FileWriter(file);
//			writer.write(newObj.toString(2));
//			JOptionPane.showMessageDialog(null, "삭제 성공.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (reader != null)
//					reader.close();
//				if (writer != null)
//					writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}

}
