// https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401?leftPanelTabValue=PROBLEM
package dsa.preparation.binarysearch.striver;

public class FloorOrCeilInSortedArray {
    public static int[] getFloorAndCeil(int[] nums, int n, int x) {
        int left=0, right=n-1, mid, floor=-1, ceil=-1;
        while(left<=right) {
            mid=(left+right)/2;
            if(nums[mid]==x) {
                return new int[]{nums[mid], nums[mid]};
            }
            else if(nums[mid]>x) {
                ceil=nums[mid];
                right=mid-1;
            } else {
                floor=nums[mid];
                left=mid+1;
            }
        }
        return new int[] {floor, ceil};
    }
}
