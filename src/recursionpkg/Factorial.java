package recursionpkg;

public class Factorial {
	
	private String solutionResults;
	
	// displays initial recursion problem
	public String displayProblem() {
		String problem = 
			"Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... \n" + 
			"1. Compute the result recursively (without loops). \n" +
			"factorial(1) → 1\n" + 
			"factorial(2) → 2\n" +
			"factorial(3) → 6\n";
		return problem;
	}
	
	public String displaySolution(int n) {
		solutionResults += "Generating output from factorial recursion based on input: " + n + "\n";
		// execute factorial recursion
		factorial(n);

		return solutionResults;
	}
	
	private int factorial(int n) {
		if (n == 1) {
			// define terminal case i.e. where the recursion will stop
			solutionResults += "Returning " + n + "because termial case was encountered.\n";
			return n;
		}
		else {
			// assume the recursive result produces a correct value
			// and change what it returns to get the answer you need
			solutionResults += "Returning " + n + ".\n";
			return n * (factorial(n - 1));
		}
	}
}
