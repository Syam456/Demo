package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;
import com.start.student.StudentDao;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit the app");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				System.out.println("Enter Student Fullname: ");
				String name=br.readLine();
				
				System.out.println("Enter Student phone number: ");
				String phone=br.readLine();
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				
				Student st=new Student(name,phone,city);
				System.out.println(st);
				
				boolean answer =StudentDao.addStudentToDB(st);
				if(answer) {
					System.out.println("student added sucessfully");
				}else {
					System.out.println("There is some problem");
				}
		
				

			} else if (choice == 2) {
				
				System.out.println("Enter student Id to delete");
				int studentId=Integer.parseInt(br.readLine());
				boolean answer=StudentDao.deleteStudent(studentId);
				
				if(answer) {
					System.out.println("student delet sucessfully");
				}
				else {
					System.out.println("some problem here");
				}
				

			} else if (choice == 3) {
				
				StudentDao.getAllStudents();

			} else if (choice == 4) {
			} else {
				
			}
			System.out.println("Thanks for using");
			
		}
	}
}
