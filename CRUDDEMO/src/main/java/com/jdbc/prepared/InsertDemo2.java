package com.jdbc.prepared;
import java.sql.*;
import java.util.*;
public class InsertDemo2 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample1","root","Shubham@$1233");
		
		PreparedStatement ps = con.prepareStatement("insert into emp1 values (?,?,?)");
		System.out.println("Enter id :");
		int id = sc.nextInt();
		
		System.out.println("Enter Name :");
		String name = sc.next();
		
		System.out.println("Enter Salary :");
		int sal = sc.nextInt();
		
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, sal);
		
		int result = ps.executeUpdate();
		
		System.out.println(result + " Recrd updated..");
		
		con.close();
		sc.close();

	}

}
