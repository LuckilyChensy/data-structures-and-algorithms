package com.leetcode.no0217;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for(Integer num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;

    }

}

