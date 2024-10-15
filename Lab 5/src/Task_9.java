import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3x4 matrix:");
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++) 
				matrix[row][col] = input.nextDouble();

		for (int col = 0; col < matrix[0].length; col++) {	
			System.out.println("Sum of the elements at column " + col + 
				" is " + sumColumn(matrix, col));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];		
		}
		return sum;
	}
}