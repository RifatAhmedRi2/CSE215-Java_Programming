import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int limit  = 9;
	for(int i = 1; i <= limit; i++)
	{
		for(int j = limit - i; j >= 0; j--)
		{
			System.out.print(" " + "  ");
		}
		for(int line = 1; line < i; line++)
		{
			System.out.print(line + "  ");
		}
		for(int line = i; line >= 1; line--)
		{
			System.out.print(line + "  ");
		}
		System.out.println();
	}
}
}
