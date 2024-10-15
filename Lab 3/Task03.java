
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 100; i <= 200; i++)
		{
			if(i % 5 == 0 && i % 6 == 0)
				continue;
			else if(i % 5 == 0 || i % 6 == 0)
			{
				System.out.print(i + " ");
				count++;
			}
			if(count % 10 == 0)
				System.out.println();
		}
	}

}
