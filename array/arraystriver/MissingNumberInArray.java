// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumberInArray {
    public int missingNumber(int[] nums) {
        int result=-1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=i) {
                result=i;
                break;
            }
        }
        if(result==-1)
            return nums.length;
        return result;
    }
}
