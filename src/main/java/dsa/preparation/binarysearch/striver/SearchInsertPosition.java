// https://leetcode.com/problems/search-insert-position/description/
package dsa.preparation.binarysearch.striver;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left=0, right=nums.length-1, mid, ans=nums.length;
        while(left<=right) {
            mid=(left+right)/2;
            if(nums[mid]<target)
                left=mid+1;
            else {
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}
