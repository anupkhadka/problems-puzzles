/*
 * Project Euler Problem 1
 * Multiple of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.  
 * Find the sum of all the multiples of 3 or 5 below 1000. 
 */

public class P1 {
    public static void main(String args[]) {
        int answer, i, n;
        long start, end;
    
        start = System.currentTimeMillis();
        n = 1000;
        answer = 0; 
        
        for(i = 3; i < n; i++) {
            if(i%3 == 0 || i%5 == 0) {
                //the number is a multiple of 3 or 5
                answer += i; 	
            }
        } 	
        
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ answer);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
