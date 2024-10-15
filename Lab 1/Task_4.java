  
/*
1.10 Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
*/


public class Task_4 {

	public static void main(String[] args) {
		double kilometer = 14;
		double time = 45.30;
		// convert kilometer to miles
		double miles = kilometer / 1.6;
		// convert time
		double mph = time /60;
		// find average speed
		double averageSpeed = miles / mph;
		System.out.print(" A runner who has ran " + kilometer + " kilometers in " + time + " has an average speed of " + averageSpeed);
	}

}