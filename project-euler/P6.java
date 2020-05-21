/*
 * Project Euler Problem 6 
 */

public class P6 {
    public static void main(String args[]) {
        long start, end;
        int sumOfSquares = 0; 
        int squareOfSum = 0;
    
        start = System.currentTimeMillis();
        
        for(int i = 1; i <= 100; i++) {
            sumOfSquares += i * i; 
            squareOfSum += i; 
        }  
        squareOfSum *= squareOfSum;
    
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ (squareOfSum - sumOfSquares));	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
