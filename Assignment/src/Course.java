/*Name: Md. Rifat Ahmed
ID: 1931725042
Sec: 12
Semester: Summer 2020
*/

import java.util.Arrays;

public class Course {
	private String name;
	private int code;
	private Student[] listOfStudents;
	private Faculty faculty;
	
	public Course() {
	}

	public Course(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public Course(String name, int code, Student[] listOfStudents, Faculty faculty) {
		this.name = name;
		this.code = code;
		this.listOfStudents = listOfStudents;
		this.faculty = faculty;
	}
	
	public Student[] getListOfStudents() {
		return listOfStudents;
	}
	
	public void setListOfStudents(Student[] listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCode() {
		return code;
	}
	
	@Override
	public String toString() {
		return "Course: Name=" + name + ", Code=" + code + ", ListOfStudents=" + Arrays.toString(listOfStudents)
				+ ", Faculty Details=" + faculty;
	}
	
}
