/*
 * Project Euler Problem 9 
 */

public class P9 {

    public static void main(String args[]) {
        int product = 0;
        long start, end;
    
        start = System.currentTimeMillis();

        for(int a = 1; a < (1000 / 3); a++) {
            for(int b = 1; b < (1000 / 2); b++) {
                int c = 1000 - a - b;
                if((a*a + b*b) == (c*c)) {
                    product = a * b * c;
                    break;
                } 
            } 
        }
        
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ product);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
