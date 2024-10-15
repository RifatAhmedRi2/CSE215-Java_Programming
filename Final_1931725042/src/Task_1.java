import java.io.*;

public class Task_1 {

	public static void main(String[] args) {
		int n = 625;
		
		double summation = SumSeries(n);
		
		System.out.println(summation);
	}
	
	public static double SumSeries(int n) {
		double sum = 0;
		double step;
		for(int i=2; i <= n; i++) {
			step = 1/Math.sqrt(i);
			sum += step;
		}
		return sum;
	}
	
}