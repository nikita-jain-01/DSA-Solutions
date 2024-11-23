package dsa.preparation.array.arraystriver;

// optimal solution - TC - O(n)
public class LeftRotateArrayByOnePlace {
    public void rotate(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
            nums[i-1]=nums[i];
        nums[nums.length-1]=temp;
    }
}
