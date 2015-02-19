package recursionpkg;

public class Factorial {
	
	/*
	 * factorial method: 
	 * Recursively finds the factorial of a given number
	 * 
	 * Terminating case: 
	 * The number input is = 1 (factorials less than 1 are not handled here)
	 * 
	 * Iteration: 
	 * One number is subtracted from the given input number,
	 * and that resulting number is multiplied by itself
	 */
	private int factorial(int n) {
		if (n == 1) {
			return n;
		}
		else if (n < 1) {
			throw new IllegalArgumentException("Please enter a whole number greater than or equal to 1");
		}
		else {
			// assume the recursive result produces a correct value
			// and change what it returns to get the answer you need
			return n * (factorial(n - 1));
		}
	}
}
