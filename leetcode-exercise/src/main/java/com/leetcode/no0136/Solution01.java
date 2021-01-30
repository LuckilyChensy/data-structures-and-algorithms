package com.leetcode.no0136;

public class Solution01 {

    public int singleNumber(int[] nums) {
        int single = 0;
        for(int num:nums){
            single ^= num;
        }
        return single;
    }

}
