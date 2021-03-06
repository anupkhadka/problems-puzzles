/** 
 * This class provides a recursive solution to finding 
 * fibonacci number of an integer
 */

public class FibonacciRecursive {

	int fib(int n) {
		if(n <= 1) {
			return n;
		}	
		return fib(n-1) + fib(n-2);
	}	

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		int [] arrToTest = {0,1,2,3,4,5,6,7,8,9,10};
		FibonacciRecursive driver = new FibonacciRecursive();
		int i, length = arrToTest.length;
		
		for(i = 0; i < length; i++) {
			System.out.println("fib("+arrToTest[i]+")"+" = "+driver.fib(arrToTest[i]));
		}
	}
} 
