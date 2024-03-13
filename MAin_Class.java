package com.vijay.Factory_Design_Pattern;

public class MAin_Class {
	public static void main(String[] args) {
//		Employee emp = new AndroidDeveloper();
//		int salary = emp.salary();
//		System.out.println("salary : "+salary);
//		Employee emp1 = new WebDeveloper();
//		int salary2 = emp1.salary();
//		System.out.println("salary : "+salary2);
//		
		Employee employee = Employee_Factory.geteEmployee("AndroidDeveloper");
		int salary = employee.salary();
		System.out.println("salary : "+salary);
		Employee employee2 = Employee_Factory.geteEmployee("WebDeveloper");
		int salary2 = employee2.salary();
		System.out.println("salary : "+salary2);
	}
}
