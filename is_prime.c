/* Author: Anup Khadka
 * Description: This program tests whether a given number is prime or not
 */

#include <math.h>
#include <stdio.h>

typedef enum {FALSE, TRUE} boolean;

boolean isPrime(int n) 
{
    double sqrtVal;
    int i;

    if(n <= 1) {
        //any number <= 1 is not prime
        return FALSE;
    } else if(n%2 == 0) {
        //the number is an even number, prime numbers can't be even
        return FALSE;
    }
    
    sqrtVal = sqrt(n);

    for(i = 2; i <= sqrtVal; i++) {
        if(n%i == 0) {
            return FALSE;
        }
    }		 
    return TRUE;
}

int main(int argc, char *argv[]) 
{
    int i;
    int primes[] = {17, 19, 31};
    int primesCount = sizeof(primes)/sizeof(primes[0]);
    int nonPrimes[] = {-1, 0, 1, 9};
    int nonPrimesCount = sizeof(nonPrimes)/sizeof(nonPrimes[0]);
    
    printf("\nTesting prime numbers array. All should be prime\n");
    for(i = 0; i < primesCount; i++) {
        if(isPrime(primes[i])) {
            printf("%d is prime        - good!\n", primes[i]);
        } else {
            printf("%d is not prime    - bad!\n", primes[i]);
        }
    }
    
    printf("\nTesting non-prime numbers array. None should be prime\n");
    for(i = 0; i < nonPrimesCount; i++) {
        if(isPrime(nonPrimes[i])) {
            printf("%d is prime        - bad!\n", nonPrimes[i]);
        } else {
            printf("%d is not prime    - good!\n", nonPrimes[i]);
        }
    }
}
