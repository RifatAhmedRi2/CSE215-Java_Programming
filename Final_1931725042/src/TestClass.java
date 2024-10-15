import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your NSU ID:");
		String nsuID = input.next();
		int[] x = new int[Character.getNumericValue(nsuID.charAt(4))];
		
		System.out.print("To create Rhombus Enter 1 & to create Trapezoid Enter 2: ");
		int type = input.nextInt();
		
		if(type == 1) {
			Rhombus[] rhombus = new Rhombus[x.length];
			
			for (int i = 0; i < x.length; i++) {
				System.out.print("Enter the Side of the Rhombus: ");
				double side = input.nextDouble();
				System.out.print("Enter the Height of the Rhombus:");
				double height = input.nextDouble();
				System.out.print("Enter the Color of the Rhombus: ");
				String color = input.next();
				System.out.print("Is the Rhombus filled? (true/false): ");
				boolean filled = input.nextBoolean();
				Rhombus myrhombus = new Rhombus(side, height, color, filled);
				rhombus[i] = myrhombus;
			}
			
			for (int i = 0; i < x.length-1; i++) {
				System.out.println(rhombus[i].toString());
			}
		}
		
		if (type == 2) {
			Trapezoid[] trapezoid = new Trapezoid[x.length];
			
			for (int i = 0; i < x.length; i++) {
				System.out.print("Enter the Side A of the Trapezoid: ");
				double sideA = input.nextDouble();
				System.out.print("Enter the Side B of the Trapezoid: ");
				double sideB = input.nextDouble();
				System.out.print("Enter the Height of the Trapezoid:");
				double height = input.nextDouble();
				System.out.print("Enter the Color of the Trapezoid: ");
				String color = input.next();
				System.out.print("Is the Trapezoid filled? (true/false): ");
				boolean filled = input.nextBoolean();
				Trapezoid mytrapezoid = new Trapezoid(sideA, sideB, height, color, filled);
				trapezoid[i] = mytrapezoid;
			}
			
			for (int i = 0; i < x.length-1; i++) {
				System.out.println(trapezoid[i].toString());
			}
		}
		
	}
}
