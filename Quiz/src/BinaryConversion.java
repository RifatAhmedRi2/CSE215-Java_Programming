import java.util.Scanner;

public class BinaryConversion {
	public static void main (String args[]) {
    int decimal, position, binary=0;
    
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Decimal number: ");
	decimal = input.nextInt();

    position=1;
    
    for(; decimal>0; decimal /= 2) {
    	binary += (decimal%2)*position;
    	position = position*10;
    }
    
    System.out.println("In Binary number systen the number is: " + binary);
    }
}
