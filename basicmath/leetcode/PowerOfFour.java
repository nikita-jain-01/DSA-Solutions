// https://leetcode.com/problems/power-of-four/?envType=daily-question&envId=2025-08-15

public class PowerOfFour {
    // TC - O(log[base4]n)
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n==0 || n%4!=0) 
            return false;
        while(n%4==0) {
            n=n/4;
            if(n==1)
                return true;
        }
        return false;
    }
}
