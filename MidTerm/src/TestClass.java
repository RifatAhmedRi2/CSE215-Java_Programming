import java.util.Scanner;

public class TestClass {
	Scanner input = new Scanner(System.in);
	
	String[] petName = new String[50];
	String[] petType = new String[50];
	
	System.out.println("Enter the Pets name: ");
	for (int i = 0; i < petName.length; i++) {
		petName[i] = input.nextLine();
	}
	
	System.out.println("Enter Type ('c' for cat and 'd' for dog):" );
	for (int i = 0; i < petType.length; i++) {
		petType[i] = input.nextLine();
	}
}
