/* Author: Anup Khadka
 * Description: This program provides both recursive and iterative functions
 * to calculate fibonacci number of an integer 
 */

#include <stdio.h>

int fibRecursion(int n) 
{
    if(n <= 1) {
        return n;
    } 
    return fibRecursion(n-1) + fibRecursion(n-2);
}

int fibOptimized(int n) 
{
    int a, b, fib, i;

    if(n <= 1) {
        return n;
    }
    a = 0;
    b = 1;
    fib = b;

    for(i = 2; i <= n; i++) {
        fib = a + b;
        a = b;
        b = fib;
    }
    return fib;
}

int main(int argc, char **argv) 
{
    int arrToTest[] = {0,1,2,3,4,5,6,7,8,9,10};
    int count = sizeof(arrToTest)/sizeof(arrToTest[0]);
    int i; 

    for(i = 0; i < count; i++) {
        printf("fib(%d) recursion: %d\n", arrToTest[i], fibRecursion(arrToTest[i]));
        printf("fib(%d) optimized iteration: %d\n", arrToTest[i], fibOptimized(arrToTest[i]));
    }
}
