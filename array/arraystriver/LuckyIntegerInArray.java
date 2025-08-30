// https://leetcode.com/problems/find-lucky-integer-in-an-array/?envType=daily-question&envId=2025-07-05

import java.util.Arrays;

public class LuckyIntegerInArray {
    public int findLucky(int[] arr) {
        int res=-1,count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==arr[i+1])
                count++;
            else {
                if(arr[i]==count)
                    res=arr[i];
                count=1;
            }
        }
        if(arr[arr.length-1]==count)
            res=arr[arr.length-1];
        return res;
    }
}
