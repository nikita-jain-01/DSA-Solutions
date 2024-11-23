// https://leetcode.com/problems/valid-palindrome/

package dsa.preparation.recursion.striver;

public class CheckIfStringIsPalindromeOrNot {
    public boolean isPalindrome1(String s) {
        String finalString="";
        return recursionPalindrome(0, s.length()-1, s);
    }

    public boolean recursionPalindrome(int start, int end, String s) {
        Character first, sec;
        if(start>end)
            return true;
        if((s.charAt(start)>='a' && s.charAt(start)<='z') || (s.charAt(start)>='A' && s.charAt(start)<='Z') || (s.charAt(start)>='0' && s.charAt(start)<='9'))
            first=Character.toLowerCase(s.charAt(start));
        else
            return recursionPalindrome(start+1, end, s);

        if((s.charAt(end)>='a' && s.charAt(end)<='z') || (s.charAt(end)>='A' && s.charAt(end)<='Z') || (s.charAt(end)>='0' && s.charAt(end)<='9'))
            sec=Character.toLowerCase(s.charAt(end));
        else
            return recursionPalindrome(start, end-1, s);

        if(first!=sec)
            return false;
        else
            return recursionPalindrome(start+1, end-1, s);
    }

    // or
    public boolean isPalindrome2(String s) {
        String finalString="";
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
                finalString=finalString+""+s.charAt(i);
        }
        return checkPalindrome(finalString, 0, finalString.length()-1);
    }

    public boolean checkPalindrome(String finalString, int start, int end) {
        if(start>end)
            return true;
        if(Character.toLowerCase(finalString.charAt(start))!=Character.toLowerCase(finalString.charAt(end))) {
            System.out.println("start="+start+" end="+end);
            return false;
        }
        else if(Character.toLowerCase(finalString.charAt(start))==Character.toLowerCase(finalString.charAt(end)))
            return checkPalindrome(finalString, start+1, end-1);
        else
            return true;
    }
}
