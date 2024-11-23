// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

package dsa.preparation.recursion.striver;

public class SumOfFirstNNumbers {
    long sumOfSeries(long n) {
        if(n<=0)
            return 0;
        return (n*n*n)+sumOfSeries(n-1);
    }
}
