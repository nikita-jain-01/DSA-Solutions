// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

package dsa.preparation.binarysearch.binarysearchfaang;

public class SearchInRotatedSortedArrayII_Duplicates {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // Check if we found the target
            if (nums[mid] == target) {
                return true;
            }
            // Handle duplicates: Move the pointers inward while they are equal
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            // If left side is sorted
            else if (nums[low] <= nums[mid]) {
                // Check if the target is within the sorted left side
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right side is sorted
            else {
                // Check if the target is within the sorted right side
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
