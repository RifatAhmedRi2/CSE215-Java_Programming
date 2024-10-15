import java.util.Scanner;

public class TestOctagon {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of ");
		Octagon octa = new Octagon(input.nextInt());
        System.out.print("Area of Regular Octagon = "  
                          + octa.getArea()); 
    } 
}
