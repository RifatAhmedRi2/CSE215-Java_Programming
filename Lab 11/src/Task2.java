import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Invoke getArray method
		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index Out of Bounds");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}