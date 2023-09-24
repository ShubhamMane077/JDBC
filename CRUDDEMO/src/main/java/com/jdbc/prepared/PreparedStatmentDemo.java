package com.jdbc.prepared;
import java.sql.*;

public class PreparedStatmentDemo {

	public static void main(String[] args) throws Exception{
		
		Connection con = null ;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample1","root","Shubham@$1233");
			
			//Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("insert into emp1 values (?,?,?)");
			
			ps.setInt(1, 101);
			ps.setString(2, "Shubh");
			ps.setInt(3, 1000);
			
			int result = ps.executeUpdate();
			
			
			System.out.println(result +" Record Inserted....");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		
		
	}

}
