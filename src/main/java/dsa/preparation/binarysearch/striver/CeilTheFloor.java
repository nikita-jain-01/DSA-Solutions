// https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
package dsa.preparation.binarysearch.striver;

import java.util.Arrays;

public class CeilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int floor = floorAndCeil(arr, x, "floor");
        int ceil = floorAndCeil(arr, x, "ceil");
        return new int[]{floor, ceil};
    }

    public int floorAndCeil(int[] arr, int target, String func) {
        int left=0, right = arr.length-1, mid, ans=-1;
        while(left<=right) {
            mid=(left+right)/2;
            if(arr[mid]<target) {
                if(func.equals("floor"))
                    ans=arr[mid];
                left=mid+1;
            }
            else if(arr[mid]>target) {
                if(func.equals("ceil"))
                    ans=arr[mid];
                right=mid-1;
            }
            else {
                return arr[mid];
            }
        }
        return ans;
    }
}
