// https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
package dsa.preparation.array.arraystriver;

public class MaximumProductSubArray {
    int maxProduct(int[] arr) {
        int sum=1;
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
