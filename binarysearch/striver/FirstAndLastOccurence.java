// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package dsa.preparation.binarysearch.striver;

public class FirstAndLastOccurence {
    public int searchNo(int[] nums, int left, int right, int target, boolean side) {
        int mid, ans=-1;
        while(left<=right) {
            mid=(left+right)/2;
            if(nums[mid]>target)
                right=mid-1;
            else if(nums[mid]<target)
                left=mid+1;
            else {
                ans = mid;
                if(side)
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int first, second;
        first = searchNo(nums, 0, nums.length-1, target, true);
        second = searchNo(nums, 0, nums.length-1, target, false);
        return new int[]{first, second};
    }
}
