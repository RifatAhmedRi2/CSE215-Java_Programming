import java.util.Scanner;

public class Task2_1931725042 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix = new double[row][column];

        System.out.println("Enter the array below: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                matrix[i][j] = input.nextDouble();

        int[] location = locateSmallest(matrix);
        System.out.printf("The Index location of the smallest element is at (%d, %d)\n", location[0], location[1]);
    }

    public static int[] locateSmallest(double[][] a) {

        int[] location = new int[] { 0, 0 };
        double smallest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < smallest) {
                    location[0] = i;
                    location[1] = j;
                    smallest = a[i][j];
                }
            }
        }
        return location;
    }
}