package com.jdbc.prepared;
import java.sql.*;
import java.util.*;
public class SelectByIdDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Id here..");
		int i = sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample1","root","Shubham@$1233");
		
		PreparedStatement ps = con.prepareStatement("select * from emp1 where id = ?");
		ps.setInt(1, i);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt("id") +" "+ rs.getString("name") +" "+ rs.getInt("sal"));
			
		} else {
			System.out.println("No records Found..!");
		}
//		
//		int id = ;
//		String name = ;
//		int sal = ;
		
		
		con.close();
		sc.close();
	}

}
