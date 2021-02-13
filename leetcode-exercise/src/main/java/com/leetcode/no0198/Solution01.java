package com.leetcode.no0198;

public class Solution01 {

    public int rob(int[] nums){

        if(nums == null || nums.length == 0){
            return 0;
        }

        int length = nums.length;
        int[] dp = new int[length + 1];

        for(int i = 2; i <= length; i++){
            dp[i] = Math.max(dp[i-2]+nums[i-1],dp[i-1]);
        }

        return nums[length];

    }


}
