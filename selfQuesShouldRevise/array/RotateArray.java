// Leet Code - https://leetcode.com/problems/rotate-array/

package dsa.preparation.selfQuesShouldRevise.array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] ar=new int[k];
        if(k>nums.length)
            return;
        for(int i=nums.length-1,j=0;j<k;j++) {
            ar[j]=nums[i];
            i--;
        }
        for(int i=nums.length-1-k;i>=0;i--) {
            nums[i+k]=nums[i];
        }
        for(int i=k-1;i>=0;i--){
            nums[i]=ar[k-i-1];
        }
    }
}
