// https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-n-to-1-without-loop

package dsa.preparation.recursion.striver;

public class PrintNTo1 {
    void printNos(int N) {
        if(N<=0)
            return ;
        System.out.print(N+" ");
        printNos(N-1);
    }
}
