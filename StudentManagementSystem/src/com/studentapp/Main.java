package com.studentapp;

public class Main {

	public static void main(String[] args) {
		System.out.println("************************Student Management System***************************");
		System.out.println("**************Wellcome********************");
		
		//creating student object
		Student student1=new Student("John Cena", 22, "S-101");
		student1.enrollCourse("Java");
		student1.enrollCourse("Python");
		student1.enrollCourse("C++");
		student1.enrollCourse("C");
		student1.printStudentInformation();
		
		Student student2=new Student("Roman Reigns", 25, "S-102");
		student2.enrollCourse("Java");
		student2.printStudentInformation();
		
		Student student3=new Student("Seth Rollins", 30, "S-103");
		student3.enrollCourse("Java");
		student3.enrollCourse("Python");
		student3.printStudentInformation();
	}

}
