// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package dsa.preparation.binarysearch.binarysearchfaang;

public class FindSmallestLetterGreaterThanTarget{
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0, high=letters.length-1;
        int mid;
        while(low<=high) {
            mid=(low+high)/2;
            if(letters[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return letters[low%letters.length];
    }
}