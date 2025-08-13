// https://leetcode.com/problems/split-array-largest-sum/

package dsa.preparation.binarysearch.binarysearchfaang;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int low=0, high=0;
        for(int i=0;i<nums.length;i++) {
            low=Math.max(low, nums[i]);
            high=high+nums[i];
        }
        while(low<high) {
            int mid=(low+high)/2;
            int sum=0, count=1;
            for(int num:nums) {
                if(sum+num>mid) {
                    sum=num;
                    count++;
                } else {
                    sum=sum+num;
                }
            }
            if(count>k)
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }
}
