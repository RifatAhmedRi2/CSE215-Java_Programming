/*Name: Md. Rifat Ahmed
ID: 1931725042
Sec: 12
Semester: Summer 2020
*/

import java.time.LocalDateTime;
import java.util.Arrays;

public class Faculty {
	private String name;
	private int id;
	private LocalDateTime dateOfBirth;
	private String address;
	private String designation;
	private String[] courseList;
	
	public Faculty() {
	}
	
	public Faculty(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Faculty(String name, int id, LocalDateTime dateOfBirth, String address, String designation) {
		this.name = name;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.designation = designation;
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
	
	public String getDesignation() {
		return designation;
	}
	
	public String[] getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {
		return "Faculty: Name=" + name + ", Id=" + id + ", DateOfBirth=" + dateOfBirth + ", Address=" + address
				+ ", Designation=" + designation + ", CourseList=" + Arrays.toString(courseList);
	}
	
}
