package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	private static List<Student> studentList;
	public static void main(String[] args) {
		System.out.println("************************Student Management System***************************");
		System.out.println("**************Wellcome********************");
		studentList=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name.....");
		String name = sc.next();
		System.out.println("You have entered the name "+name);
		
		//read integer from console/terminal
		System.out.println("Enter Student Age.....");
		int age=sc.nextInt();
		System.out.println("The Student age is "+age);
		
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
