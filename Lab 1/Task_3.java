
/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
*/

import java.lang.Math;
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 5.5;
		final double PI = 3.14;
		
		double perimeter = 2 * radius * PI;
		double area = radius * radius * Math.PI;
		
		System.out.printf("The perimeter of the circle is %.2f and the area is %.2f",perimeter, area);
	}

}
