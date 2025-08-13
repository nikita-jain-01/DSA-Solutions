// https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

package dsa.preparation.selfQuesShouldRevise.sorting;

public class SelectionSort {

    // TC - O(N2), SC - O(1)
    void selectionSort(int arr[], int n)
    {
        int index=0, temp=0;
        //code here
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min) {
                    min=arr[j];
                    index=j;
                }
            }
            if(min<arr[i]){
                temp=arr[i];
                arr[i]=min;
                arr[index]=temp;
            }
        }
    }
}
