// https://leetcode.com/problems/binary-search/

// OPTIMAL SOLUTION
public class BinarySearchToFindXInSortedArray {

    // iterative
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // not tested
    // recursive
    public int recursiceSearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return recursiceSearch(nums, low, mid - 1, target);
        } else {
            return recursiceSearch(nums, mid + 1, high, target);
        }
    }
}
