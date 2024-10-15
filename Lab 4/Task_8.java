/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example,
convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
*/

import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();

		convertMillis(millis);
	}

	 public static void convertMillis(long millis) {
		 
		  long totalSeconds = millis / 1000;
		  long currentSecond = totalSeconds % 60;
		  long totalMinutes = totalSeconds / 60;
		  long currentMinute = totalMinutes % 60;
		  long totalHours = totalMinutes / 60;
		 
		  System.out.print(totalHours + ":" + currentMinute + ":" + currentSecond);
		 }
}


///////////////////// USING STRING ///////////////////////

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();

		System.out.println("Hours:Minutes:Seconds - " + convertMillis(millis));
	}

	 public static String convertMillis(long millis) {
		 
		  long totalSeconds = millis / 1000;
		  long currentSecond = totalSeconds % 60;
		  long totalMinutes = totalSeconds / 60;
		  long currentMinute = totalMinutes % 60;
		  long totalHours = totalMinutes / 60;
		 
		  return totalHours + ":" + currentMinute + ":" + currentSecond;
		 }
}