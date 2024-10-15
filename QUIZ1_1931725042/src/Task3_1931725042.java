import java.util.Scanner;

public class Task3_1931725042 {

	public static void main(String[] args) {
		double[][] matrix = new double[3][4];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3x4 matrix:");
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++) 
				matrix[row][col] = input.nextDouble();
		sumRow(matrix);
	}

	public static void sumRow(double[][] a) {
        double sumRow = 0;  
		for(int i = 0; i < 3; i++){  
            for(int j = 0; j < 4; j++){  
              sumRow = sumRow + a[i][j];  
            }  
            System.out.println("Sum of row " + (i+1) +" is: " + sumRow);
            sumRow = 0;
        }
	}
}