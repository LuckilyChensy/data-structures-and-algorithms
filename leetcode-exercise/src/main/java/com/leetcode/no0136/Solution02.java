package com.leetcode.no0136;

import java.util.HashMap;
import java.util.Map;

public class Solution02 {

    public int singleNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(Integer i:nums){
            Integer count = map.get(i);
            count = count == null?1:count++;
            map.put(i,count);
        }

        for(Integer i:map.keySet()){
            Integer count = map.get(i);
            if(count == 1){
                return i;
            }
        }

        return -1;
    }

}
