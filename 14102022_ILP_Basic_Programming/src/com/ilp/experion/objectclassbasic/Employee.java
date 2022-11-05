package com.ilp.experion.objectclassbasic;

public class Employee {
	
	String employeeName = "Indeevar";
	int employeeAge = 23;
	char employeeGender = 'M';
	double employeeCgpa = 8.5;

	public void displayEmployeeDetails() {
		System.out.println("*****************  Welcome to ILP Program **************************");
		System.out.println("Name" + "	 " + "Age" + "	 " + "Gender" + "	 " + "CGPA");
		System.out.println(employeeName + "	 " + employeeAge + "	 " + employeeGender + "	 " + employeeCgpa);

	}
	
	
}
