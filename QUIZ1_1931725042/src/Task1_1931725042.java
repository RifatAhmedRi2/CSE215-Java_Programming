import java.util.Scanner;

public class Task1_1931725042 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        int totalSides = input.nextInt();
        
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        
        System.out.println("The Area of the Polygon is: " + area(totalSides, side));
    }

    public static double area(int n, double s) {
        double areaCal =  (n * s * s) / (4 * Math.tan(Math.PI/n));
        return areaCal;
    }
}