// https://leetcode.com/problems/palindrome-number/

package dsa.preparation.basicmath.striver;

public class CheckPalindrome {
    public boolean isPalindrome(int x) {
        int temp=x, sec=0;
        if(x<0)
            return false;
        while(temp!=0) {
            sec=sec*10+(temp%10);
            temp=temp/10;
        }
        if(x!=sec)
            return false;
        return true;
    }
}
