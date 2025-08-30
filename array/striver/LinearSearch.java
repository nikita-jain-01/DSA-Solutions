// https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win

package array.striver;

// OPTIMAL solution - TC - O(N)
public class LinearSearch {
    public static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==K)
                return 1;
        }
        return -1;
    }
}
