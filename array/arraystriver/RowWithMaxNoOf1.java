// https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s
//
// VIDEO LECTURE - https://www.youtube.com/watch?v=SCz-1TtYxDI
package dsa.preparation.array.arraystriver;

public class RowWithMaxNoOf1 {

    // BRUTE FORCE - O(N*M)
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = 0, count = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
    }

    // BRUTE FORCE - O(N*M)
    int ifStatementDiffRowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0, count = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count = m - j;
                    break;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
    }

    // OPTIMAL SOlUTION - O(N*log(M))
    int optimalSolutionRowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0, count = 0, index = -1, left, right, mid;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            left = 0;
            right = m - 1;
            while (left <= right) {
                mid = (left + right) / 2;
                if (arr[i][mid] == 1) {
                    count = m - mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
    }
}
