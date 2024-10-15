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