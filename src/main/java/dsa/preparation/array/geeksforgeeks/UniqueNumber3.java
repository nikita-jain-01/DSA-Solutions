package dsa.preparation.array.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumber3 {
    public int getSingle(int[] arr) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> i:hashmap.entrySet()) {
            if(i.getValue()==1)
                return i.getKey();
        }
        return 0;
    }
}
