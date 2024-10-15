/*Name: Md. Rifat Ahmed
ID: 1931725042
Sec: 12
Semester: Summer 2020
*/

import java.time.LocalDateTime;
import java.util.*;

public class ClassManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int studentId, facultyId, code, date, month, year, hour, minute;
		String studentName, studentAddress, facultyName, facultyAddress, designation, courseName;
		
		//Course Object
        System.out.print("Enter the Course Name: ");
        courseName = input.nextLine();   
		
		System.out.print("Enter the Course Code: ");
        code = input.nextInt();
		
        Course course = new Course(courseName, code);
        System.out.println(course.toString()); 
    	System.out.println("Course object created successfully.");
    	System.out.printf("\n");
    	input.nextLine();
    	
    	
    	//Faculty Object
    	System.out.print("Enter the Facultys Name: ");
    	facultyName = input.nextLine();
        
        System.out.print("Enter the Facultys ID no: ");
        facultyId = input.nextInt();
        
        System.out.println("Enter the Date of Birth of the Faculty ~");
        System.out.print("Birth Year: ");
        year = input.nextInt();
    	input.nextLine();
        System.out.print("Birth Month: ");
        month = input.nextInt();
    	input.nextLine();
        System.out.print("Birth Date: ");
        date = input.nextInt();
    	input.nextLine();
        System.out.print("Birth Hour: ");
        hour = input.nextInt();
    	input.nextLine();
        System.out.print("Birth Minute: ");
        minute = input.nextInt();
    	input.nextLine();
        LocalDateTime dateOfBirth = LocalDateTime.of(year, month, date, hour, minute);
        
        System.out.print("Enter the Adress of the Faculty: ");
        facultyAddress = input.nextLine();
        
        System.out.print("Enter the Designation of the Faculty: ");
		designation = input.nextLine();
        
        Faculty faculty = new Faculty(facultyName, facultyId, dateOfBirth, facultyAddress, designation);
    	System.out.println(faculty.toString());
    	System.out.println("Faculty object created successfully.");
    	input.nextLine();
    	
    	
    	//Student Object
    	System.out.print("Enter the total number of Students for a Course: ");
    	int numberOfStudents = input.nextInt();
    	input.nextLine();
    	Student[] studentList = new Student[numberOfStudents];
    	
    	for(int i = 0; i < numberOfStudents; i++) {
    		System.out.println("Enter the information about Student No. "+ (i+1) + ": ");
    		
    		System.out.print("Enter the Students Name: ");
    		studentName = input.nextLine();

    		System.out.print("Enter the Students Id: ");
    		studentId = input.nextInt();
        	input.nextLine();
        	
    		System.out.println("Enter the Date of Birth of the Student ~");
    		System.out.print("Birth Year: ");
    		year = input.nextInt();
    		input.nextLine();
    		System.out.print("Birth Month: ");
    		month = input.nextInt();
    		input.nextLine();
    		System.out.print("Birth Date: ");
    		date = input.nextInt();
    		input.nextLine();
    		System.out.print("Birth Hour: ");
    		hour = input.nextInt();
    		input.nextLine();
            System.out.print("Birth Minute: ");
            minute = input.nextInt();
            input.nextLine();
		    LocalDateTime studentsDateOfBirth = LocalDateTime.of(year, month, date, hour, minute);
            
		    System.out.print("Enter the Adress of the Student: ");
            studentAddress = input.nextLine();
            System.out.printf("\n");	
            
            studentList[i] = new Student(studentName, studentId, studentsDateOfBirth, studentAddress);
    	}
    	
        course.setListOfStudents(studentList);
        
        course.setFaculty(faculty);
        
    	System.out.println(course.toString());
    	System.out.println("Everything is successfully created.");	
    	input.close();
	}
}
