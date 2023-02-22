package org.student;

import org.department.Department;

public class Student extends Department 
{

		public void studentName(String name)
		{
			System.out.println("Student name is "+name);
		}
		public void studentDept(String dept)
		{
			System.out.println("Student department is "+dept);
		}
		public void studentId(int id) 
		{
			System.out.println("Student id is "+id);
		}
		public static void main(String[] args)
		{
			Student std=new Student();
			std.collegeName("anna university");
			std.collegeCode(31249087);
			std.collegeRank(100);
			std.deptName("Mech");
			std.studentName("selva");
			std.studentDept("Mechanical");
			std.studentId(2017111080);

		}



}
