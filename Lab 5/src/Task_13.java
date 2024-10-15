import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {
        double[][] m = new double[3][3];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 3x3 matrix: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        
        System.out.println(isMarkovMatrix(m) ? "It is a Markov matrix" : "It is NOT a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;

            for (int i = 0; i < m.length; i++) {
                double num = m[i][j];
                if (num < 0) return false;
                sum += num;
            }
            if (sum != 1) return false;
        }

        return true;
    }
}
