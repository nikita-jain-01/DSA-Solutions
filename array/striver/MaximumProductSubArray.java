// https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
package array.striver;

public class MaximumProductSubArray {
    public int maxProduct(int[] arr) {
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            sum=1;
            for(int j=i; j<arr.length; j++) {
                sum=sum*arr[j];
                if(max<sum) {
                    max=sum;
                }
            }
        }
        return max;
    }
}
