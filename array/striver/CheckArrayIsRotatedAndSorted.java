// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

// optimal solution
public class CheckArrayIsRotatedAndSorted {
    public boolean check(int[] nums) {
        int count=0;
        if(nums[0]<nums[nums.length-1])
            count++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
                count++;
            if(count>1)
                return false;
        }
        return true;
    }
}
