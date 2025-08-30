// https://leetcode.com/problems/subarray-sum-equals-k/
package array.striver;

public class CountSubArrayWithGivenSum {
    // TC - O(N^2)
    public int subarraySum(int[] arr, int target) {
        int sum;
        int result=0;
        for(int i=0; i<arr.length; i++) {
            sum=0;
            for(int j=i; j<arr.length; j++) {
                sum=sum+arr[j];
                if(sum==target) {
                    result++;
                }
            }
        }
        return result;
    }
}