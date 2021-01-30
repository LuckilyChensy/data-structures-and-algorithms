package com.leetcode.no0268;

import java.util.HashSet;
import java.util.Set;

public class Solution05 {

    public int missingNumber(int[] nums){

        Set<Integer> set = new HashSet<Integer>();

        for(int v: nums){
            set.add(v);
        }

        int n = nums.length;

        for(int num = 0; num <= n; num++){
            if(!set.contains(num)){
                return num;
            }
        }

        return -1;

    }

}
