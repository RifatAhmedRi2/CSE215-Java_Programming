
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = (int)(Math.random() * 7);
		System.out.println(day);
		switch(day)
		{
			case 0: System.out.print("Today is Sunday ");
					break;
			case 1: System.out.print("Today is Monday ");
					break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: System.out.print("Today is Thursday ");
					break;
			default: System.out.println("Invalid output");
					break;
		}
		
		int elapse = 2000;
		
		int futureday = (day + elapse) % 7;
		
		switch(futureday)
		{
		case 0: System.out.print("and the future day is Sunday");
				break;
		case 1: System.out.print("and the future day is Monday");
				break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: System.out.print("and the future day is Thursday");
				break;
		default:System.out.println("Invalid output");
				break;
		}
	}
}
