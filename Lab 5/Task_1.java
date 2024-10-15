
/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is
Here, s is the length of a side. Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area.
*/


import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        int[] array = new int[10];

        for (int i = 0; i < 10; i++)
        	array[i] = input.nextInt();

        System.out.print("Reverse Order: ");
        for (int i = array.length - 1; i >= 0; i--)
        	System.out.print(array[i] + " ");
	}
}