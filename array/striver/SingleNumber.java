import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // TC  - O(N2), SC - O(1)
    public int singleNumberBrute(int[] nums) {
        int i,j,k=0,count=1;
        for(i=0;i<nums.length;i++)
        {
            count=1;
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && i!=j)
                    count++;
            }
            if(count==1)
            {
                k=nums[i];
                break;
            }
        }
        return k;
    }

    // TC - O(nlogn)
    public int singleNumberBetterSol(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1])
                count++;
            else {
                if(count==1)
                    return nums[i];
                count=1;
            }
        }
        return nums[nums.length-1];
    }

    // TC - O(N), SC - O(N) in worst case
    public int singleNumberBetter2(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> occurenceMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            occurenceMap.put(nums[i], occurenceMap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : occurenceMap.entrySet()) {
            if(entry.getValue()==1)
                return entry.getKey();
        }
        return 0;
    }

    // TC - O(N), SC - O(1)
    public int singleNumberOptimised(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++) {
            result^=nums[i];
        }
        return result;
    }
}