/*
 * Project Euler Problem 3 
 * The prime factors of 13195 are 5, 7, 13 and 29
 * What is the largest prime factor of the number 600851475143?
 */

public class P3 {

    /* check to see if the long value is a prime number or not */
    public static boolean isPrime(long l) {

        if(l == 2)	return true;
        else if(l <= 1 || l % 2 == 0) {
            //any number <= 1 is not prime
            //even numbers are not prime
            return false;
        }		
    
        for(long i = 3; i * i <= l; i+=2) {
            if(l % i == 0) {
                return false;
            }		
        }
        return true;
    }

    public static void main(String args[]) {
        long i, start, end;
        long l = 600851475143L; 
    
        start = System.currentTimeMillis();
        
        for(i = 3; i <= l; i++) {
            if(isPrime(i) && (l % i == 0)) {	
                if(i == l)
                    break;
                else 
                    l = l / i;
            }
        }
    
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ i);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
