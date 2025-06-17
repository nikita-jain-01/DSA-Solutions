// https://leetcode.com/problems/max-consecutive-ones/description/
package dsa.preparation.array.arraystriver;

// OPTIMAL solution
// TC - O(N)
// SC - O(1)
public class MaxConsecutiveOne {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, temp = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        if (max < count) {
            max = count;
        }
        return max;
    }
}
