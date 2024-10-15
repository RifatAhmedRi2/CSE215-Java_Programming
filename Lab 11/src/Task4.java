import java.io.*;
import java.util.*;

public class Task4 {
	public static void main(String[] args) throws Exception {
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage: java Filename");
			System.exit(1);
		}
		
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		int characters = 0;
		int words = 0;
		int lines = 0;

		Scanner in = new Scanner(file);
		
		while(in.hasNext()) {
            String line = in.nextLine();
            
            String[] wordArray = line.split(" ");         

            characters += line.length();
            lines += 1;
            words += wordArray.length;
        }

		System.out.println("File " + file.getName() + " has");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}