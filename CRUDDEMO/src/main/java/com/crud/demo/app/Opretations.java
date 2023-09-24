package com.crud.demo.app;
import java.sql.*;

public class Opretations {
	static Connection con = null;
	static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhdb1","root","Shubham@$1233");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static void insert(int id , String name , int sal) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into sample values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, sal);
			
			int result = ps.executeUpdate();
			System.out.println(result + " Record Updated..");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectAll() {
		try {
			PreparedStatement ps = con.prepareStatement("select * from sample");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				
				System.out.println(id +" "+name+" "+sal);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectById(int id) {
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from sample where id = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				
				System.out.println(id1+" "+name+" "+sal);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void update(int id , int newSal) {
		try {
			PreparedStatement ps = con.prepareStatement("update sample set sal=? where id=? ");
			ps.setInt(1, newSal);
			ps.setInt(2, id);
			
			int result = ps.executeUpdate();
			System.out.println(result + " Updated Successfully..");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteById(int id) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from sample where id=?");
			ps.setInt(1, id);
			
			int result = ps.executeUpdate();
			System.out.println(result + " Deleted Successfully..");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
