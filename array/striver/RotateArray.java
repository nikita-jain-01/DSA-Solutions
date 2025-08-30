// https://leetcode.com/problems/rotate-array/
package array.striver;

public class RotateArray {
    // Tc - O(N)
    // Sc - O(1)
    public void rotate1(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        System.out.println("----");
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end) {
        int temp;
        while(start<end) {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    // Tc - O(N)
    // Sc - O(K)
    public void rotate2(int[] nums, int k) {
        int j=0;
        k=k%nums.length;
        int[] arr=new int[k];
        for(int i=nums.length-k; i<nums.length;i++) {
            arr[j]=nums[i];
            j++;
        }
        for(int i=nums.length-k-1;i>=0;i--) {
            System.out.println(i + " " + nums[i]);
            nums[i+k]=nums[i];
            System.out.println("first : " + nums[i] + " " + (i+k));
        }
        for(int i=0;i<k;i++) {
            nums[i]=arr[i];
            System.out.println("second : " + nums[i] + " " + (i));
        }
    }

    // Tc - O(N)
    // Sc - O(N)
    public void rotate3(int[] nums, int k) {
        k=k%nums.length;
        int temp;
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
