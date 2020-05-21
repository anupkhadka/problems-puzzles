/*
 * Project Euler Problem 5 
 * 2520 is the smallest number that can be divided by each of the
 * numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20? 
 */

public class P5 {
    public static void main(String args[]) {
        long start, end;
        int i, num;

        start = System.currentTimeMillis();
    
        for(num = 1; num <= Integer.MAX_VALUE; num++) {
            for(i = 20; i > 1; i--) {
                if(num % i != 0 )	break;
            }			
            if(i == 1)	break;
        }	
    
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ num);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
