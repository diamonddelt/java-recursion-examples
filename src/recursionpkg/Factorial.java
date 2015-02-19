package recursionpkg;

public class Factorial {
	
	private int factorial(int n) {
		if (n == 1) {
			// define terminal case i.e. where the recursion will stop
			return n;
		}
		else {
			// assume the recursive result produces a correct value
			// and change what it returns to get the answer you need
			return n * (factorial(n - 1));
		}
	}
}
