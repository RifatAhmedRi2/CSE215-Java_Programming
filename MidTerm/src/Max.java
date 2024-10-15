import java.util.Scanner;
 
public class Max {
	public static void main(String[] args) {
		final int MAXIMUM_NUMBER_OF_SCORES = 100;
		int[] scores = new int[MAXIMUM_NUMBER_OF_SCORES];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Scores also enter a Negative number at the End to signify End of Input: ");
		int sum=0, totalInput = 0, average;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			
			if (scores[i] > 0) {
				sum = sum + scores[i];
				totalInput++;
			} else
				break;
		}
		
		average = sum/totalInput;
		
		int aboveOrEqual=0, below=0;
		
		for (int i = 0; i < totalInput; i++) {
			if(scores[i] >= average)
				aboveOrEqual++;
			else
				below++;
		}
		
		System.out.println("Average: " + average);
		System.out.println("Scores Above or Equal to the Average: " + aboveOrEqual);
		System.out.println("Scores Below the Average: " + below);
		input.close();
	}
}