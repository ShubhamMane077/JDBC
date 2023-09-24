package com.jdbc1;
import java.sql.*;
public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhdb1","root","Shubham@$1233");
			
			Statement st = con.createStatement();
			
			int result = st.executeUpdate("update emp set EmpName = 'Seema' where EmpID = 3");
			
			System.out.println(result + "Record Updated");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
	
}
