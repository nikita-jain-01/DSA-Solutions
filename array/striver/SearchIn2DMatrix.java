// Question - https://leetcode.com/problems/search-a-2d-matrix/solutions/
//
// Video Lecture - https://www.youtube.com/watch?v=JXU4Akft7yk

public class SearchIn2DMatrix {

// BRUTE FORCE SOLUTION - O(n*m) means take two loops one for row and one for column and then find element one by one

    public boolean searchMatrixBrute(int[][] matrix, int target) {
        for(int[] array:matrix) {
            if(array[0]>target)
                break;
            for(int j=0;j<array.length;j++) {
                if(array[j]==target)
                    return true;
            }
        }
        return false;
    }

// BETTER SOLUTION - O(M+N)
// In below solution, instead of linear search we should apply binary search. So, from this time complexity will be O(N)+log(M)
    public boolean searchMatrix(int[][] matrix, int target) {
        int i;
        if (matrix[0].length > 0 && matrix[0][0] > target) {
            return false;
        } else if (matrix[0].length > 0 && matrix[0][0] == target) {
            return true;
        }
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i].length > 0 && matrix[i][0] > target) {
                i--;
                break;
            } else if (matrix[i].length > 0 && matrix[i][0] == target) {
                return true;
            }
        }
        if (i == matrix.length) {
            i--;
        }
        if (matrix.length > 0 && matrix[i].length > 0) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // OPTIMAL SOLUTION - TC - O(lg(m*n))
    // We're supposing it as 1D array and used binary search
    public boolean optimalSearchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        int i, j, mid;
        while (left <= right) {
            System.out.println(".....");
            mid = left + (right - left) / 2;
            i = mid / n;
            j = mid % n;
            if (matrix[i][j] < target) {
                left = mid + 1;
            } else if (matrix[i][j] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
