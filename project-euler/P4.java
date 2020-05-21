/*
 * Project Euler Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-digit numbers is 9009 = 91 * 99
 *
 * Find the largest palindrome made from the product of two 3-digit numbers
 */

import java.lang.String;

public class P4 {
    
    private static boolean isPalindrome(int num) {
        
        String intStr = String.valueOf(num);
        int i = 0, j = intStr.length() - 1; 

        while( i <= j) {
            if(intStr.charAt(i) != intStr.charAt(j)) 
                break;
            i++; 
            j--;
        }

        return i >= j;

        // An alternative solution is to reverse the string
        // and check to see if the original string and reverse
        // are equal. This is more expensive than previous solution

        //String reverseStr = new StringBuilder(intStr).reverse().toString();
        //return intStr.equals(reverseStr);
    }

    public static void main(String args[]) {
        long start, end;
        int answer = 0, product; 	
    
        start = System.currentTimeMillis();

        for(int i = 999; i >= 100; i--) {
            for(int j = i; j >= 100; j--) {
                product = i * j;
                if(isPalindrome(product)) {
                    if(product > answer) {
                        answer = product;
                    }
                }
            }
        }	
    
        end = System.currentTimeMillis();

        System.out.println("Answer    : "+ answer);	
        System.out.println("Time (ms) : "+ (end-start));	
    }
}
