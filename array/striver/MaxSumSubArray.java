// https://leetcode.com/problems/maximum-subarray/submissions/1669273594/

public class MaxSumSubArray {
    public MaxSumSubArray() {}

    // brute force approach - O(N^2)
    public int maxSubArrayBrute(int[] nums) {
        int max=Integer.MIN_VALUE, sum;
        for(int i=0;i<nums.length;i++) {
            sum=0;
            for(int j=i;j<nums.length;j++) {
                sum+=nums[j];
                if(sum>max)
                    max=sum;
            }
        }
        return max;
    }

    // optimize approach - O(N)
    public int maxSubArrayOptimize(int[] nums) {
        int max=nums[0], sum=nums[0];
        for(int i=1;i<nums.length;i++) {
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}



// public class Main {
//     public static void main(String[] args) {
//         MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
//         int[] nums={2, 3, -8, 7, -1, 2, 3};
//         System.out.println(maxSumSubArray.maxSubArrayOptimize(nums));
//     }
// }