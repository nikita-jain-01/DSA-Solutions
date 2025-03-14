// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
package dsa.preparation.queue;

import java.util.ArrayList;

public class KSizedSubarrayMaximum {
    // Brute Force
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++) {
            max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++) {
                if(max<=arr[j])
                    max=arr[j];
            }
            list.add(max);
        }
        return list;
    }
}
