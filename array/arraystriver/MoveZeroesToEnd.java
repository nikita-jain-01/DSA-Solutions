// https://leetcode.com/problems/move-zeroes/description/
package dsa.preparation.array.arraystriver;

// BRUTE FORCE solution - First take a temp array and store every non-zero element
// in that array. After that assign every element of that array into nums array
// and when we'll assign every temp array element into nums then we'll assign
// leftover position to 0
// TC - O(2N)
// SC - O(N)
public class MoveZeroesToEnd {

    public void moveZeroes1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        for (int i = 0; i < count; i++) {
            nums[nums.length - i - 1] = 0;
        }
    }

    // or
    public void moveZeroes2(int[] nums) {
        int i=0, j=0;
        for(i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[j]=nums[i];
                j++;
            }
        }
        for(i=j;i<nums.length;i++)
            nums[i]=0;
    }
}
