package com.leetcode.no0560;

import java.util.HashMap;
import java.util.Map;

public class Solution02 {

    public int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length == 0){ return 0; }

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int num:nums){
            sum += num;
            count += map.getOrDefault(sum-k,0);
            int sumCount = map.getOrDefault(sum,0);
            map.put(sum,sumCount+1);
        }

        return count;
    }

}