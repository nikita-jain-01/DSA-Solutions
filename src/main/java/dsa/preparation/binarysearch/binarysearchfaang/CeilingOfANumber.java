// https://leetcode.com/problems/search-insert-position/
package dsa.preparation.binarysearch.binarysearchfaang;

public class CeilingOfANumber {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        if(target>nums[nums.length-1])
            return -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1; 
            }else if (nums[mid] == target) {
                return mid; 
            }else {
                high = mid - 1;
            }
        }
        return low;
    }
}
