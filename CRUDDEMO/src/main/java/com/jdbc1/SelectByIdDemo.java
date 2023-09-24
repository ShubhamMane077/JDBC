package com.jdbc1;
import java.sql.*;
import java.util.*;

public class SelectByIdDemo {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Id here..");
		int i = sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample1","root","Shubham@$1233");

		Statement st = con.createStatement();
		
		st.executeQuery("select * from emp where id = ");
		
		
	}

}
