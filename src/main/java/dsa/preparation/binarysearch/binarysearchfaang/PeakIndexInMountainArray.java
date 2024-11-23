// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// https://leetcode.com/problems/find-peak-element/

package dsa.preparation.binarysearch.binarysearchfaang;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0, high=arr.length-1;
        int mid=0;
        while(low<high) {
            mid=(low+high)/2;
            if(arr[mid]>arr[mid+1])
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
}
