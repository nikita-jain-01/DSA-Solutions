// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

package dsa.preparation.binarysearch.binarysearchfaang;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1, mid, pivot=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(mid<high && nums[mid]>nums[mid+1])
                pivot = mid;
            if(mid>low && nums[mid]<nums[mid-1])
                pivot = mid-1;
            if(nums[low]>=nums[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println(pivot);
        if(pivot==-1)
            return binarySearch(nums, target, 0, nums.length-1);
        if(nums[pivot]==target)
            return pivot;
        else if(target>=nums[0])
            return binarySearch(nums, target, 0, pivot-1);
        else
            return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {
        int mid;

        while(low <= high) {
            mid=(low+high)/2;
            if(target>nums[mid])
                low=mid+1;
            else if(target==nums[mid])
                return mid;
            else
                high=mid-1;
        }
        return -1;
    }
}
