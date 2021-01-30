package com.leetcode.no0053;

public class Solution01 {

    public int maxSubArray(int[] nums) {

        int max =  Integer.MIN_VALUE;;
        int cur = 0;

        for(int i = 0; i < nums.length; ++i){
            cur = cur <= 0? nums[i]:(cur + nums[i]);
            max = Math.max(max,cur);
        }

        return max;

    }

}
