import java.io.*;
import java.util.*;

public class Task5 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a File of Scores: ");
		File file = new File(input.nextLine());

		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}

		int count = 0;
		double total = 0;

		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext()) {
			total += inputFile.nextInt();
			count++;
		}

		System.out.println("File: " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
	}
}
