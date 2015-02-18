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
		
		selection = selection.toLowerCase();
		switch (selection) {
			case ("factorial"):
				Factorial factorial = new Factorial();
			
				System.out.println(factorial.displayProblem());
				
				int input = Integer.parseInt(scanner.next());
				System.out.println(factorial.displaySolution(input));
				break;
			default:
				System.out.println("Please select a supported example.");
				break;
		}
		
		scanner.close();
	}
}
