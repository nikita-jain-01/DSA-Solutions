package dsa.preparation.binarysearch.striver;

public class FloorOfANumber {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        if(target<nums[0])
            return -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    // or
    static int findFloor(int[] arr, int k) {
        int left=0, right=arr.length-1, mid, ans=-1;
        while(left<=right) {
            mid=(left+right)/2;
            if(arr[mid]>k)
                right=mid-1;
            else {
                ans = mid;
                left=mid+1;
            }
        }
        return ans;
    }
}
