import java.util.*;

public class TestTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the three side: ");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle triangle = new Triangle(side1,side2,side3);
		
		System.out.println("Enter the Color: ");
		String color = input.next();
		triangle.setColor(color);
		
		System.out.println("Enter the Boolean value: ");
		boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		
		System.out.println(triangle);
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Is the triangle filled? " + triangle.isFilled());
		System.out.println(triangle);
	}
}
