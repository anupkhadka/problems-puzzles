/** 
 * This class provides an iterative solution to finding 
 * fibonacci number of an integer
 */

public class FibonacciIterative {

    int fib(int n) {
        int a,b, fibVal, i;

        if(n <= 1) {
            return n;
        }
        a = 0; 
        b = 1;
        fibVal = b;

        for(i = 2; i <= n; i++) {
            fibVal = a + b;
            a = b;
            b = fibVal;
        }
        return fibVal;
    }	

    /**
     * @param args
     */
    public static void main(String [] args) {
        int [] arrToTest = {0,1,2,3,4,5,6,7,8,9,10};
        FibonacciIterative driver = new FibonacciIterative();
        int i, length = arrToTest.length;
        
        for(i = 0; i < length; i++) {
            System.out.println("fib("+arrToTest[i]+")"+" = "+driver.fib(arrToTest[i]));
        }
    }
} 
