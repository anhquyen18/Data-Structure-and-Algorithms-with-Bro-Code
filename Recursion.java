
public class Recursion {
	
	// recursion = When a thing is defined in terms of itself
	//			   Apply the result of procedure, to a procedure.
	//			   A recursive method calls itself. Can be a substitute for iteration.
	//			   Divide a problem into sub-problems of the same type as the original.
	//			   Commonly used with advanced sorting algorithms and navigating trees.
	
	//			   Advantages:
	//			   easier to read/write
	//			   easier to debug
	
	//			   Disadvantages
	//			   sometimes slower
	//			   uses more memory
	
	public static void main(String[] args) {
		
		System.out.println(factorial(3));
		System.out.println(power(2, 8));
	}

	private static int power(int i, int j) {
		if (j == 1) {
			return i;
		}
		return i * power(i, j - 1);
	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		return i*factorial(i-1);
	}

	private static void walk(int steps) {
		if (steps < 1) {
			return;
		}
		System.out.println("You take a step!");
		walk(steps-1);
		
	}

}
