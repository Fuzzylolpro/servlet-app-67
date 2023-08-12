package com.tms.exeption;

import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target)  {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length;i++){
            map.put(nums[i],i );
        }
        for (int i = 0; i< nums.length;i++){
            int reqNumber = target - nums[i];
            if(map.containsKey(reqNumber) && map.get(reqNumber) !=i){
                return new int[]{ i,map.get(reqNumber)};
            }
        }
        return nums;
    }
}

