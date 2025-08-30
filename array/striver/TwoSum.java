// https://leetcode.com/problems/two-sum/submissions/1667431933/

import java.util.HashMap;

public class TwoSum {
    public TwoSum(){}

    // brute force O(N^2)
    public int[] twoSumProblemBrute(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }


    // better O(NlogN)
    // but it will only work for sorted array not unsorted
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            int index = findNumber(i, nums.length, nums, target-nums[i]);
            if(index!=-1)
                return new int[]{i,index};
        }
        return new int[]{0,0};
    }
    public int findNumber(int left, int right, int[] nums, int target) {
        while(left<=right) {
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }



    // optimized O(N) Space O(N)
    public int[] twoSumOptimize(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hashMap.containsKey(nums[i]))
                return new int[]{hashMap.get(nums[i]),i};
            else
                hashMap.put(target-nums[i],i);
        }
        return new int[]{0,0};
    }
}
