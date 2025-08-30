// https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1

import java.util.*;
public class MedianInRowWiseSortedArray {
    public int median(int[][] mat) {
        // code here
        int k=0;
        int[] arr=new int[mat.length*mat[0].length];
        for(int[] array:mat) {
            for(int j=0;j<array.length;j++) {
                arr[k]=array[j];
                k++;
            }
        }
        Arrays.sort(arr);
        return arr[(arr.length)/2];
    }
}
