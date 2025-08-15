// https://www.geeksforgeeks.org/problems/tywins-war-strategy0527/1

package array.geeksforgeeks;

import java.util.Arrays;

public class TywinWarStrategy {
    public int minSoldiers(int[] arr, int k) {
        int count=0, min=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%k==0)
                arr[i]=(arr[i]%k);
            else
                arr[i]=k-(arr[i]%k);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0)
                count++;
            else {
                min=min+arr[i];
                count++;
            }
            if(count>=(arr.length/2 + arr.length%2))
                break;
        }
        return min;
    }
}
