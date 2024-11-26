package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main4 {
	private static List<Student> studentList;
	private static Scanner sc;
	public static void main(String[] args) {
		System.out.println("************************Student Management System***************************");
		System.out.println("**************Wellcome********************");

		//creating student object
		studentList=new ArrayList<Student>();
		sc =new Scanner(System.in);
		while(true) {
			System.out.println("Select an Option...");
			System.out.println("1.	Register a Student");
			System.out.println("2.	Find a Student with StudentID");
			System.out.println("3.  List all Student Information");
			System.out.println("4.  List all Student Information By Sorted Order");
			System.out.println("5 	Exit");

			int option=sc.nextInt();
			switch(option) {
			case 1: enrolledStudent(sc);
			break;
			case 2:findStudentByID(sc);
			break;
			case 3:printAllStudentData();
			break;

			case 4:sortByName(sc);
			break;

			case 5:exit();
			break;

			default:System.out.println("Invalid option selected..Enter between 1 to 5");


			}

		}


	}



	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("Good Bye!!!!");
		System.exit(0);
	}



	private static void sortByName(Scanner sc2) {
		// TODO Auto-generated method stub

	}



	private static void printAllStudentData() {
		// TODO Auto-generated method stub
		if (studentList.size()>0) {


			System.out.println("-------Print all Student Data-----------");
			for (Student student : studentList) {
				student.printStudentInformation();
			}
		}
			else {
				System.err.println("No Student Record Found");
			}
			System.out.println("--------------------------------------------------------");
		}



		private static void findStudentByID(Scanner sc2) {
			// TODO Auto-generated method stub
			Student studentFound=null;
			System.out.println("Enter the StudentID");
			String studentid=sc2.next();
			try {
				studentFound=	studentList.stream().filter(student->student.getStudentid().
						equalsIgnoreCase(studentid)).findFirst().orElseThrow(()->new RuntimeException("Student Not Found"));
			} catch (RuntimeException e) {
				// TODO Auto-generated catch block
				System.out.println("Student with ID "+studentid+"	not found!");
			}	
			studentFound.printStudentInformation();
		}



		private static void enrolledStudent(Scanner sc2) {
			// TODO Auto-generated method stub
			System.out.println("Enter the Student Name");
			String studentName = sc2.next();

			System.out.println("Enter the Student Age");
			int studentAge = sc2.nextInt();

			System.out.println("Enter the Student StudentID");
			String studentID = sc2.next();

			Student newStudent=new Student(studentName, studentAge, studentID);
			studentList.add(newStudent);
			while(true) {
				System.out.println("Enter the course to be enrolled!!!...Type Done to exit");

				String courseName = sc2.next();
				if (courseName.equalsIgnoreCase("done")) {
					break;//exit from the loop

				}
				newStudent.enrollCourse(courseName);
				System.out.println("Enrolled to the course");
			}

			newStudent.printStudentInformation();




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
			printAllStudentData();


		}
	}
