// https://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

package dsa.preparation.selfQuesShouldRevise.sorting;

import java.util.ArrayList;

public class MergeSort {

    // TC - O(NlogN), SC - O(N)
    void merge(int arr[], int l, int m, int r)
    {
        int left=l;
        int right=m+1;
        ArrayList<Integer> temp=new ArrayList<>();

        while(left<=m && right<=r) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=m) {
            temp.add(arr[left]);
            left++;
        }
        while(right<=r) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
