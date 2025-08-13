// https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

    public MajorityElement(){}

    // brute force approach O(N^2)
    public int majorityElementBrute(int[] nums) {
        int count,max=0,result=-1;
        if(nums.length==0)
            return -1;
        else if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length-1;i++) {
            count=1;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>=max) {
                max=count;
                result=nums[i];
            }
        }
        return result;
    }

    // better approach O(NlogN)
    public int majorityElementBetter(int[] nums) {
        int count=1,max=0,result=-1;
        Arrays.sort(nums);
        if(nums.length==0)
            return -1;
        else if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1])
                count++;
            else
                count=1;
            if(count>=max) {
                max=count;
                result=nums[i];
            }
        }
        return result;
    }

    // optimize approach TC - O(N), SC - O(N)
    public int majorityElementOptimize(int[] nums) {
        int max=-1,result=-1;
        HashMap<Integer,Integer> occurence = new HashMap<>();
        if(nums.length==1)
            return nums[0];
        for(int i=0; i<nums.length;i++) {
            if(occurence.containsKey(nums[i])) {
                occurence.put(nums[i],occurence.get(nums[i])+1);
                if(occurence.get(nums[i])>=max) {
                    max=occurence.get(nums[i]);
                    result=nums[i];
                }
            } else {
                occurence.put(nums[i],1);
            }
        }
        return result;
    }
}


// public class Main {
//     public static void main(String[] args) {
//         MajorityElement majorityElement = new MajorityElement();
//         int[] nums={2,2,1,1,1,2,2};
//         System.out.println(majorityElement.majorityElementBetter(nums));
//     }
// }