package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	//instance variables
	private	String name=null;
	private	int age=0;
	private	String studentid=null;
	private	List<String> courses=null;

	//constructor
	public Student(String name, int age, String studentid) {
		super();
		if (validateAge(age)&& validateName(name)&& validateStudentID(studentid)) {
			this.name = name;
			this.age = age;
			this.studentid = studentid;
			//initialization of courses
			courses=new ArrayList<String>();
		}

	}


	public void enrollCourse(String course) {
		if (validateCourseName(course)) {
			if (!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student is enrolled to " + course + "succssfully");

			} else {
				System.out.println("Student is already enrolled to " + course);
			}
		}

	}

	public void printStudentInformation() {
		System.out.println("==============Student Information===================");
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student ID: "+studentid);
		System.out.println("Courses Enrolled: "+courses);

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentid=" + studentid + ", courses=" + courses + "]";
	}

	//Validation method
	public boolean validateAge(int age) {
		if (age>=19 && age <= 35) {
			return true;
		}
		else {
			System.out.println("Age is not valid");
			return false;
		}
	}

	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";   
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = pattern.matcher(name);
		if (nameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Name is not valid"+"Please enter alphabets only");
			return false;
		}


	}

	public boolean validateStudentID(String studentid) {
		String studentidRegex = "S-[0-9]+$";//S-123
		Pattern pattern = Pattern.compile(studentidRegex);
		Matcher studentidMatcher = pattern.matcher(studentid);

		if (studentidMatcher.matches()) {
			return true;
		} else {
			System.err.println("Student ID is not valid" + "Please enter S-123 format");
			return false;
		}

	}

	public boolean validateCourseName(String course) {
		if (course.equals("Java") || course.equals("Python") || course.equals("C") || course.equals("C++") || course.equals("Data Science") ||
				course.equals("Machine Learning") || course.equals("Deep Learning") || course.equals("Artificial Intelligence")) {
			return true;
		} else {
			System.err.println("Course name is not valid" + "Please select valid course name from the list of courses");
			return false;
		}
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getStudentid() {
		return studentid;
	}
	
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
}
