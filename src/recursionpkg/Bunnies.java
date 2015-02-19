package recursionpkg;

public class Bunnies {
	
	/*
	 * bunnyEars method: 
	 * Recursively finds the number of bunny ears for a given
	 * number of bunnies.
	 * 
	 * Terminating case: 
	 * The number of bunnies = 0
	 * 
	 * Iteration: 
	 * One bunny is subtracted at each recursive loop,
	 * and 2 ears are added to the returned total
	 */
	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		else {
			return bunnyEars(bunnies - 1) + 2;
		}
	}
}
