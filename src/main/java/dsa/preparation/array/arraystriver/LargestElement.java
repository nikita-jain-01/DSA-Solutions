// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

package dsa.preparation.array.arraystriver;

//BRUTE solution - sort array then return last element
// TC - O(N logN)


//optimal solution
// TC - O(N)
public class LargestElement {
    public int largest(int arr[], int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<=arr[i])
            max=arr[i];
        }
        return max;
    }
}
