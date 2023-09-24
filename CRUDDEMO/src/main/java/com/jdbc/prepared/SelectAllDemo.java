package com.jdbc.prepared;
import java.sql.*;

public class SelectAllDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample1","root","Shubham@$1233");
		
		PreparedStatement ps = con.prepareStatement("select * from emp1");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int sal = rs.getInt("sal");
			
			System.out.println(id +" "+name+" "+sal);
		}
		

	}

}
