// https://leetcode.com/problems/power-of-three/?envType=daily-question&envId=2025-08-13

public class PowerThree {
    public boolean isPowerOfThree(int n) {
        int mul=1;
        if(n==1)
            return true;
        if(n%3!=0)
            return false;
        if(n>3)
            n=n/3;
        for(int i=1;;i++) {
            mul=mul*3;
            if(mul==n)
                return true;
            else if(mul>n)
                return false;
        }
    }
}