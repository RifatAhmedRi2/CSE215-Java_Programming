public class Task_4 {

    public static void main(String[] args) {

        int[] primeNumbers = new int[50];
        int index = 0;

        for (int i = 2; index < 50; i++) {
            if (isPrime(i)) {
                primeNumbers[index] = i;
                index++;
            }
        }
        
        printArray(primeNumbers);
    }

    public static boolean isPrime(int number) {
    	
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
            	return false;
        }
        return true;
    }

    public static void printArray(int[] array) {
    	
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10d ", array[i]);
            if ((i + 1) % 10 == 0)
            	System.out.println("");
        }
    }
    
}