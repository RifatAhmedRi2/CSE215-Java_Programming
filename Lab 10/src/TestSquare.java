import java.util.Scanner;

public class TestSquare {
	public static void main(String[] args) {
		GeometricObject[] square = new GeometricObject[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < square.length; i++) {
			System.out.println("Enter the Side of the Square " + (i+1) + ":");
			double side = input.nextDouble();
			square[i] = new Square(side);
			System.out.println("The Area is: " + square[i].getArea());
			((Square)square[i]).howToColor();
			System.out.println("");
		}
		input.close();
		
	}
}
