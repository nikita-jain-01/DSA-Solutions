// https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort

package dsa.preparation.selfQuesShouldRevise.sorting;

public class BubbleSort {

    // TC - O(N2), SC - O(1)
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
