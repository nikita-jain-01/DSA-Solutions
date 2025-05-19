// https://leetcode.com/problems/sort-colors/
// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&sortBy=submissions

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
    public void sort012(int[] arr) {
        int start=0, end=arr.length-1, count=0, i=0;
        while(i<arr.length) {
            if(arr[i]==0) {
                arr[start]=0;
                start++;
                i++;
            } else if(arr[i]==1) {
                count++;
                i++;
            } else if(arr[i]==2 && end>i) {
                arr[i]=arr[end];
                arr[end]=2;
                end--;
            } else {
                i++;
            }
        }
        for(i=1;i<=count;i++) {
            arr[start]=1;
            start++;
        }
    }
    
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

    // TC - O(N), SC - O(1)
    // Optimal Solution using Linear Search
    public void optimal2SortColors(int[] nums) {
        int start=0, med=-1, end=nums.length-1,i=0;
        while(i<nums.length) {
            if(nums[i]==0) {
                if(nums[start]==1 && med!=-1) {
                    nums[start]=0;
                    start++;
                    nums[med]=1;
                    med++;
                } else {
                    nums[start]=0;
                    start++;
                }
            } else if(nums[i]==1) {
                if(med==-1)
                    med=start;
                nums[med]=1;
                med++;
            } else if(end>i && nums[i]==2) {
                if(nums[end]==2)
                    end--;
                nums[i]=nums[end];
                nums[end]=2;
                end--;
                i--;
            }
            i++;
        }
    }

    public void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
