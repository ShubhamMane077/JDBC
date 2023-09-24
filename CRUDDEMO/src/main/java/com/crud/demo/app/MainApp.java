package com.crud.demo.app;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Insert operation");
		System.out.println("Press 2 for Select All");
		System.out.println("Press 3 for Select by Id ");
		System.out.println("Press 4 for Update operation");
		System.out.println("Press 5 for Delete by Id ");


		int choice=0;
		try {
			System.out.println("Enter Your Choice..");
			choice = sc.nextInt();
			if(choice<0)
				sc.close();
				throw new CustomException();

		}catch (CustomException e1) {
			if(choice<0)
				System.err.println("Invalid inpute. Please enter a positive integer.");
		}catch(java.util.InputMismatchException e  ) {
			System.err.println("Invalid inpute. Please enter a valid integer.");
		}

		switch(choice) {

		case 1 : 
			System.out.println("Enter Id here..");
			int id = sc.nextInt();
			System.out.println("Enter Name here..");
			String name = sc.next();
			System.out.println("Enter Salary here..");
			
			int sal = sc.nextInt();
			Opretations.insert(id, name, sal);
			break;
		case 2 :
//			System.out.println("Id"+"   "+"Name"+"       "+"Salary");
			Opretations.selectAll();
			break;
		case 3 : 
			System.out.println("Enter Id here..");
			int selectId =sc.nextInt();
			Opretations.selectById(selectId);
			break;
		case 4 :
			System.out.println("Enter Id here..");
			int updateId = sc.nextInt();
			System.out.println("Enter Updated Salary here..");
			int updateSal = sc.nextInt();
			Opretations.update(updateId, updateSal);
			break;
		case 5 :
			System.out.println("Enter Id here..");
			int deleteId = sc.nextInt();
			Opretations.deleteById(deleteId);
			break;
		}
		sc.close();
	}

}
