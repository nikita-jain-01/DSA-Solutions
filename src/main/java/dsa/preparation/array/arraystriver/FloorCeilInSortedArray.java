// https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401?leftPanelTabValue=PROBLEM

package dsa.preparation.array.arraystriver;

public class FloorCeilInSortedArray {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int low=0, high=n-1, mid, min=-1, max=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(a[mid]==x)
                return new int[]{a[mid],a[mid]};
            else if(a[mid]<x) {
                min=a[mid];
                low=mid+1;
            } else {
                max=a[mid];
                high=mid-1;
            }
        }
        return new int[]{min, max};
    }
}
