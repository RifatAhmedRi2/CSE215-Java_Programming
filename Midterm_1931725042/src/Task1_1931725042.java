import java.util.Scanner;

public class Task1_1931725042 {
	public static void main(String[] args) {
        double sum = 0.0, n, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = input.nextInt();
        
        for (i = 1; i <= n; i++) {
        	sum = sum + 1/i;
        }
        System.out.println("Summation: " + sum);
	}
}
