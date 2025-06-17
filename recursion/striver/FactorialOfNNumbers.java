// https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

package dsa.preparation.recursion.striver;

import java.util.ArrayList;

public class FactorialOfNNumbers {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> arrayList=new ArrayList<>();
        return factorial(n, 1, 1, arrayList);
    }

    static ArrayList<Long> factorial(long n, long res, long start, ArrayList<Long> arrayList) {
        if(res*start>n)
            return arrayList;
        res=res*start;
        arrayList.add(res);
        return factorial(n, res, start+1, arrayList);
    }
}
