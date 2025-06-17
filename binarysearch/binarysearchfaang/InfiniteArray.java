package dsa.preparation.binarysearch.binarysearchfaang;

public class InfiniteArray {
    public int search(int[] nums, int target) {
        int start=0, end=1;
        while(target>nums[end]) {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums, target, start, end);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target){
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return -1;
    }
}
