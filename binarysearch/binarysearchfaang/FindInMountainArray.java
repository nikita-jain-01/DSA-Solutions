// https://leetcode.com/problems/find-in-mountain-array/

package dsa.preparation.binarysearch.binarysearchfaang;
// converted MountainArray interface into array
public class FindInMountainArray {
    public int findInMountainArray(int target, int[] mountainArr) {
        int low=0, high=mountainArr.length-1;
        int mid;
        while(low<high) {
            mid=(low+high)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
                high=mid;
            else
                low=mid+1;
        }
        int ans = binarySearch(mountainArr, target, low, true);
        if(ans!=-1)
            return ans;
        else
            return binarySearch(mountainArr, target, low, false);
    }

    public int binarySearch(int[] mountainArr, int target, int peak, boolean fh) {
        int low, high, ans=-1, mid;
        if(fh) {
            low=0;
            high=peak;
        } else {
            low=peak;
            high=mountainArr.length-1;
        }
        while(low<=high) {
            mid=(low+high)/2;
            if(fh) {
                if(mountainArr[mid]>target)
                    high=mid-1;
                else if(mountainArr[mid]==target)
                    return mid;
                else
                    low=mid+1;
            } else {
                if(mountainArr[mid]<target)
                    high=mid-1;
                else if(mountainArr[mid]==target)
                    return mid;
                else
                    low=mid+1;
            }
        }
        return ans;
    }
}
