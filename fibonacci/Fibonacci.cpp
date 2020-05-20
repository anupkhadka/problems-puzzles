/* 
 * This program provides both recursive and iterative functions 
 * to calculate fibonacci number of an integer 
 */

#include <iostream>
using namespace std;

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

int main(int argc, char *argv) 
{
    int arrToTest[] = {0,1,2,3,4,5,6,7,8,9,10};
    int count = sizeof(arrToTest)/sizeof(arrToTest[0]);
    int i; 

    for(i = 0; i < count; i++) {
        cout<<"fib("<<arrToTest[i]<<") recursion: "<<fibRecursion(arrToTest[i])<<endl;
        cout<<"fib("<<arrToTest[i]<<") optimized iteration: "<<fibOptimized(arrToTest[i])<<endl;
    }
}
