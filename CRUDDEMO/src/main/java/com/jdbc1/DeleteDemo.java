package com.jdbc1;
import java.sql.*;

public class DeleteDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection con= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhdb1","root","Shubham@$1233");
			 
			 Statement st = con.createStatement();
			 
			 int result = st.executeUpdate("delete from emp where EmpID = 3");
			 
			 System.out.println(result + " Records deleted..");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
	

}
