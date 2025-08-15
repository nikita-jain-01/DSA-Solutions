// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

package array.geeksforgeeks;
import java.util.ArrayList;

public class NextGreaterElement {
    // O(N^2) Time Complexity
    public ArrayList<Integer> nextLargerElement1(int[] arr) {
        int j, i, k;
        ArrayList<Integer> maxList=new ArrayList<>();
        for(i=0;i<arr.length-1;i++) {
            k=0;
            for(j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    maxList.add(arr[j]);
                    k=1;
                    break;
                }
            }
            if(k!=1)
                maxList.add(-1);
        }
        if(i==arr.length-1)
            maxList.add(-1);
        return maxList;
    }

    // O(N) Time complexity
    public ArrayList<Integer> nextLargerElement2(int[] arr) {
        int j=0, i=0;
        ArrayList<Integer> maxList=new ArrayList<>();
        while(j!=arr.length-1) {
            i++;
            if(arr[j]<arr[i]) {
                maxList.add(arr[i]);
                j++;
                i=j;
            } else {
                if(i==arr.length-1) {
                    maxList.add(-1);
                    j++;
                    i=j;
                }
            }
        }
        if(j==arr.length-1)
            maxList.add(-1);
        return maxList;
    }

}
