package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexes = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            int currentValue = nums[i];
            int numberNeeded = target - currentValue;
            if(indexes.containsKey(numberNeeded)){
              return new int[]{indexes.get(numberNeeded),i};
            }else{
                indexes.put(currentValue,i);
            }
        }

    return null;
    }
}
