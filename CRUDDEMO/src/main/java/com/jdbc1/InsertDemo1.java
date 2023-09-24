package com.jdbc1;
import java.sql.*;

public class InsertDemo1 {

	public static void main(String[] args) throws Exception {
		
		Connection con = null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubhdb1","root","Shubham@$1233");
			
			Statement st = con.createStatement();
			
			int result = st.executeUpdate("insert into emp values (6,'Leela',120000)");
			
			System.out.println(result + " Record Inserted ");
					
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
	

}
