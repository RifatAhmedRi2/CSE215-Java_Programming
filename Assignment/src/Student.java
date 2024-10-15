/*Name: Md. Rifat Ahmed
ID: 1931725042
Sec: 12
Semester: Summer 2020
*/

import java.time.LocalDateTime;

public class Student {
	private String name;
	private int id;
	private LocalDateTime dateOfBirth;
	private String address;
	private double cgpa;

	public Student() {
	}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Student(String name, int id, LocalDateTime dateOfBirth, String address) {
		this.name = name;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student: Name=" + name + ", Id=" + id + ", DateOfBirth=" + dateOfBirth + ", Address=" + address
				+ ", Cgpa=" + cgpa;
	}
	
}
