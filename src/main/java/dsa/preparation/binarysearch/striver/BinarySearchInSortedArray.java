// https://leetcode.com/problems/binary-search/

package dsa.preparation.binarysearch.striver;

public class BinarySearchInSortedArray {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1, mid;
        while(left<=right) {
            mid=(left+right)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
