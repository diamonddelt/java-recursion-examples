package recursionpkg;

import java.util.*;

public class Driver {

	// credit goes to codingbat.com for allowing me to practice these examples
	public static void main(String[] args) {
		
		List<String> recursionExamples = Arrays.asList(
				"factorial"
				);
		
		System.out.println("Please select the recursion example you wish to test:");
		
		Scanner scanner = new Scanner(System.in);
		String selection = scanner.nextLine();
		
		switch (selection) {
			case "factorial":
			
			default:
				System.out.println("Please select a supported example.");
		}
		
	}

}
