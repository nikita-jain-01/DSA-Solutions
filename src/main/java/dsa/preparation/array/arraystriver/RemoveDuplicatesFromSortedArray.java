// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
package dsa.preparation.array.arraystriver;

// BRUTE FORCE solution - take a set and insert every element in that set
// by default set will allow only unique elements, and the we'll set 
// those unique elements in array
// TC - O(N logN) for insert and O(N) for setting into array
// SC - O(N) because every element in array can be unique
//
// OPTIMAL solution
// TC - O(N)
// SC - O(1)
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        for (j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
