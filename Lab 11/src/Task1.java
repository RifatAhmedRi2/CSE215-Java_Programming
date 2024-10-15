import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        while(true) {
            System.out.print("Please enter in 2 integers to get their sum: ");        
            try {
                number1 = input.nextInt();
                number2 = input.nextInt();
                
                break;
            } 
            catch (InputMismatchException ime) {
               System.out.printf("You must enter 2 integers!%n%n");
               input.nextLine(); 
            }
            
        } 
        System.out.printf("The sum is %d%n", (number1+number2));
    }
}