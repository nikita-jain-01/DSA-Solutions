// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

package dsa.preparation.basicmath.striver;

public class ArmstrongNumber {
    static String armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(temp!=0) {
            int x=temp%10;
            sum=sum+(x*x*x);
            temp=temp/10;
        }
        if(sum==n)
            return "true";
        else
            return "false";
    }
}
