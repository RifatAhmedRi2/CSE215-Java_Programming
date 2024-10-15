import java.util.Scanner;

public class Quiz {
	   public static void main(String[] args) {
	        Integer[] intArray = {0,1,2,3,4,5,6,7,8,9};
	        Double[] doubleArray={0.0,1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

	        System.out.println("Max integer= " + max(intArray));
	        System.out.println("Max double= " + max(doubleArray));
	    }
	
	public static <E extends Number> E max (E[] list) {
        E max = list[0];
        for (int i = 0; i <= list.length-1; i++) {
            if (list[i+1].doubleValue() > list[i].doubleValue()) {
                max = list[i+1];
            }
        }
        return max;
    }
}
	