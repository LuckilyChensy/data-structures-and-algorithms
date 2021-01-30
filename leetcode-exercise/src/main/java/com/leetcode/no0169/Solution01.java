package com.leetcode.no0169;

import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public int majorityElement(int[] nums) {

        Map<Integer,Integer> countMap = countsNums(nums);

        Map.Entry<Integer,Integer> majorityEntry = null;
        for(Map.Entry<Integer,Integer>entry :countMap.entrySet()){
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    private Map<Integer,Integer> countsNums(int[] nums){

        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();

        for(Integer num:nums){
            if(!countMap.containsKey(num)){
                countMap.put(num,1);
            }else{
                countMap.put(num,countMap.get(num)+1);
            }
        }

        return countMap;
    }

}
