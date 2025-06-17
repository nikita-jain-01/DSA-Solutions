// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package dsa.preparation.binarysearch.binarysearchfaang;

public class FindFirstAndLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        return new int[]{start,end};
    }

    public int search(int[] nums, int target, boolean firstCheck) {
        int low=0, high=nums.length-1;
        int mid, ans=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(target<nums[mid])
                high=mid-1;
            else if(target>nums[mid])
                low=mid+1;
            else {
                ans=mid;
                if(firstCheck)
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return ans;
    }
}
