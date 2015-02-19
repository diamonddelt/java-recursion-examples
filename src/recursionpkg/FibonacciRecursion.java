package recursionpkg;

public class FibonacciRecursion {

	/*
	 * fibonacci method: 
	 * The fibonacci sequence is a famous bit of mathematics, 
	 * and it happens to have a recursive definition. 
	 * The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
	 * Each subsequent value is the sum of the previous two values, 
	 * so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
	 *  
	 * Terminating cases: 
	 * The number input is 0, in which case the return is 0 (first number in fib sequence)
	 * The number input is 1, in which case the return is 1 (second number in fib sequence)
	 * 
	 * Iteration: 
	 * Since we are not computing a total of all of the previous values,
	 * there is no need to iterate like in Factorial.java or Bunnies.java.
	 * 
	 * All I need to do is add the previous two numbers in the sequence.
	 */
	public int fibonacci(int n) {
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
		
	}
}
