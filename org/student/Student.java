package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Name : Ramya");
	}
	
	public void studentDept() {
	System.out.println("Information Technology");
	}
	
	public void studentId() {
	System.out.println("100354");

	}

	public static void main(String[] args) {
		Student info=new Student();
		info.collegeCode();
		info.collegeName();
		info.collegeRank();
		info.deptName();
		info.studentName();
		info.studentId();
		info.studentDept();
	}

}
