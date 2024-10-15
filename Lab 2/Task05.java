
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user = (int)(Math.random() * 3);
		int computer = (int)(Math.random() * 3);
		
		if(user == computer)
			System.out.println("It is a draw");
		else if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1))
			System.out.println("You won");
	}

}
