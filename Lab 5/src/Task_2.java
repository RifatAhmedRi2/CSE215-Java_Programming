import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		int[] arr = new int[101];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		int n;
		
		while((n = input.nextInt()) != 0) {
			arr[n]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				System.out.println(i + " occurs " + arr[i] +
					" time" + (arr[i] > 1 ? "s" : ""));
		}
	}
}
