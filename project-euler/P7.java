/*
 * Project Euler Problem 7 
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

import java.lang.Integer;

public class P7 {

    /* check to see if the int value is a prime number or not */
    public static boolean isPrime(int num) {

        if(num == 2)	return true;
        else if(num <= 1 || num % 2 == 0) {
            //any number <= 1 is not prime
            //even numbers are not prime
            return false;
        }		
    
        for(int i = 3; i * i <= num; i+=2) {
            if(num % i == 0) {
                return false;
            }		
        }
        return true;
    }

    public static void main(String args[]) {
        int i, primeCount = 0;
        long start, end;
    
        start = System.currentTimeMillis();

        for(i = 2; i <= Integer.MAX_VALUE; i++) {
            if(isPrime(i))	
                primeCount++;

            if(primeCount == 10001)	break;	
        }
        
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ i);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
