// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&company=Amazon&sortBy=submissions
package dsa.preparation.array.geeksforgeeks;

import java.util.ArrayList;

public class IndexesOfSubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int sum=0, k=-1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            sum=0;
            for(int j=i; j<arr.length; j++) {
                sum=sum+arr[j];
                if(sum==target) {
                    result.add(i+1);
                    result.add(j+1);
                    k=1;
                    break;
                } else if(sum>target)
                    break;
            }
            if(k==1)
                break;
        }
        if(k!=1)
            result.add(-1);
        return result;
    }
}
