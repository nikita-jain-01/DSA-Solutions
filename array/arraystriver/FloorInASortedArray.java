// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array

public class FloorInASortedArray {
    static int findFloor(long arr[], int n, long x) {
        int low=0, high=n-1, mid;
        int ans=-1;
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]<x) {
                if(ans<mid)
                    ans=mid;
                low=mid+1;
            } else if(arr[mid]==x)
                return mid;
            else
                high=mid-1;
        }
        return ans;
    }
}
