// https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1
package array.geeksforgeeks;

public class BitonicPoint {
    public int findMaximum(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}