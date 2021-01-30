package com.leetcode.no0136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution03 {

    public int singleNumber(int[] nums) {
        Set<Integer> dup = new HashSet<Integer>();
        for(int num:nums){
            if(!dup.add(num)){
                dup.remove(num);
            }
        }
        return dup.isEmpty() ? -1 : dup.iterator().next();
    }

}
