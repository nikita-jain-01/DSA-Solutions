// https://leetcode.com/problems/rotate-array/
package dsa.preparation.array.arraystriver;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp=0;
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            temp=k+i;
            temp=temp%nums.length;
            if(temp<0) {
                temp=0-temp;
            }
            System.out.print(temp);
            arr[temp]=nums[i];
        }
        for(int i=0;i<arr.length;i++) {
            nums[i]=arr[i];
        }
    }
}
