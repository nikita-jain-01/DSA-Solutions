// https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times

package dsa.preparation.recursion.striver;

public class PrintNameNTimes {
    void printGfg(int N) {
        if(N<=0)
            return;
        printGfg(N-1);
        System.out.print("GFG ");
    }
}
