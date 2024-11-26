package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	private static List<Student> studentList;
	public static void main(String[] args) {
		System.out.println("************************Student Management System***************************");
		System.out.println("**************Wellcome********************");
		
		//creating student object
		studentList=new ArrayList<Student>();
		
		Student student1=new Student("John Cena", 22, "S-101");
		student1.enrollCourse("Java");
		student1.enrollCourse("Python");
		student1.enrollCourse("C++");
		student1.enrollCourse("C");

		
		Student student2=new Student("Roman Reigns", 25, "S-102");
		student2.enrollCourse("Java");
	
		
		Student student3=new Student("Seth Rollins", 30, "S-103");
		student3.enrollCourse("Java");
		student3.enrollCourse("Python");
		
		Student student4=new Student("Dean Ambrose", 28, "S-104");
		
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
	
		
		Student result = findStudentByID("S-101");
		System.out.println(result);
		sortByName();
		
	
	}



	public static Student findStudentByID(String studentid) {
		// TODO Auto-generated method stub
	Student result=null;
	try {
		result=	studentList.stream().filter(s->s.getStudentid().
				equalsIgnoreCase(studentid)).findFirst().orElseThrow(()->new RuntimeException("Student Not Found"));
	} catch (RuntimeException e) {
		// TODO Auto-generated catch block
		System.out.println("Student with ID "+studentid+"	not found!");
	}	
	 return result;	
	}
	
	public static void sortByName() {
		// TODO Auto-generated method stub
		Comparator<Student> studentNamecomparator = (o1,o2)->o1.getName().compareTo(o2.getName());
		
		Collections.sort(studentList, studentNamecomparator);
		System.out.println("Students are sorted by Name"+studentList);
	
		
	}
}
