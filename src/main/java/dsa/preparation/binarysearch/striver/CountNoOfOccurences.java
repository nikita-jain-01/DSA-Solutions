// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence
package dsa.preparation.binarysearch.striver;

// We can find first and last index and find out how many occurences it has
public class CountNoOfOccurences {
    int countFreq(int[] arr, int target) {
        return count(arr, 0, arr.length-1, target);
    }

    public int count(int[] arr, int left, int right, int target) {
        if(left>right)
            return 0;
        int mid=(left+right)/2;
        if(arr[mid]>target)
            return count(arr, left, mid-1, target);
        else if(arr[mid]<target)
            return count(arr, mid+1, right, target);
        else
            return 1+count(arr, mid+1, right, target)+count(arr, left, mid-1, target);
    }
}
