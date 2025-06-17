// https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation

package dsa.preparation.binarysearch.binarysearchfaang;

import java.util.List;

public class FindOutHowManyTimesAnArrayBeenSorted {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low=0, high=arr.size()-1;
        while(low<high) {
            int mid=(low+high)/2;
            if(arr.get(mid)>arr.get(mid+1))
                return (mid+1);
            if(mid>0 && arr.get(mid)<arr.get(mid-1))
                return mid;
            if(arr.get(low)>arr.get(mid))
                high=mid-1;
            else
                low=mid+1;
        }
        return 0;
    }
}
