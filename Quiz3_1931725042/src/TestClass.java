import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your NSU ID:");
		String nsuID = input.next();
		int[] x = new int[Character.getNumericValue(nsuID.charAt(4))];
		
		Car[] car = new Car[x.length];
		Bicycle[] bicycle = new Bicycle[x.length];

		for (int i = 0; i < x.length; i++) {
			System.out.print("Enter the Color of the Car: ");
			String color = input.next();
			System.out.print("Enter the Model of the Car:");
			int model = input.nextInt();
			System.out.print("Enter the ID Number of the Car: ");
			String iDnumber = input.next();
			Car myCar = new Car(color, model, iDnumber);
			car[i] = myCar;
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print("Enter the Color of the Bicycle: ");
			String color = input.next();
			System.out.print("Enter the Model of the Bicycle:");
			int model = input.nextInt();
			System.out.print("Enter the ID Number of the Bicycle: ");
			String iDnumber = input.next();
			Bicycle myBicycle = new Bicycle(color, model, iDnumber);
			bicycle[i] = myBicycle;
		}

		for (int i = 0; i < x.length-1; i++) {
			System.out.println(car[i].equals(car[i + 1]));
			car[i].wheels();	
		}

		for (int i = 0; i < x.length-1; i++) {
			System.out.println(bicycle[i].equals(bicycle[i + 1]));
			bicycle[i].wheels();
		}

	}
}
