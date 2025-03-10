// https://leetcode.com/problems/sort-colors/

package dsa.preparation.array.arraystriver;

import java.util.ArrayList;

public class SortAnArrayOf0_1_2 {

    // BRUTE FORCE SOLUTION
    // TC - O(NlogN), SC - O(N)
    public void sortColors(int[] nums) {
        sortArray(nums, 0, nums.length-1);
    }

    public void sortArray(int[] nums, int low, int high) {
        if(low==high)
            return;
        int mid=(low+high)/2;
        sortArray(nums, low, mid);
        sortArray(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int l=low, r=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(l<=mid && r<=high) {
            if(nums[l]<=nums[r]) {
                temp.add(nums[l]);
                l++;
            }
            else {
                temp.add(nums[r]);
                r++;
            }
        }
        while(l<=mid) {
            temp.add(nums[l]);
            l++;
        }
        while(r<=high) {
            temp.add(nums[r]);
            r++;
        }
        for(int i=low; i<=high; i++) {
            nums[i]=temp.get(i-low);
        }
    }

    // BETTER SOLUTION -
    // TC - O(N), SC - O(1)
    // Count 0, 1 and 2 and set them in array count wise, as we already know we have only 0, 1 and 2
    
    // OPTIMAL SOLUTION (Using Binary Search) -
    // TC - O(N), SC - O(1)
    public void optimalSortColors(int[] arr) {
        int low =0, mid=0, high=arr.length-1;
        while(mid<=high && low<=mid) {
            if(arr[mid]==0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if(arr[mid]==1)
                mid++;
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
