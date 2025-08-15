// https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

package dsa.preparation.array.arraystriver;

// BRUTE solution - Sort array then start a loop from n-2 to 0 and 
// find second largest element . TC - O(N logN)

// BETTER solution - first start a loop and find largest element
// then after getting that start a loop to find second largest element
// TC - O(2N)

//OPTIMAL solution - TC - O(N)
public class SecondLargestElement {
    public int print2largest(int arr[], int n) {
        int max=arr[0],secondMax=-1;
        for(int i=0;i<n;i++) {
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
            if(max>arr[i] && secondMax<arr[i])
                secondMax=arr[i];
        }
        return secondMax;
    }
}
