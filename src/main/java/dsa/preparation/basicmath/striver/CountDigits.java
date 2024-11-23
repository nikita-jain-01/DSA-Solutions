// https://www.geeksforgeeks.org/problems/count-digits5716/1

package dsa.preparation.basicmath.striver;

public class CountDigits {
    static int evenlyDivides(int N){
        int temp=N, max=0;
        while(temp!=0) {
            int x=temp%10;
            if(x!=0 && N%x==0)
                max++;
            temp=temp/10;
        }
        return max;
    }
}
