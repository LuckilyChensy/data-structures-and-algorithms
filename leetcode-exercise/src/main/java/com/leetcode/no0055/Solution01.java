package com.leetcode.no0055;

/**
 * 动态规划解法
 */
public class Solution01 {

    public boolean canJump(int[] nums) {

        // 存在型问题的常用定义, 目的是记录每一个位置的可行性
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;

        for(int i = 1; i < nums.length; i++){
            dp[i] = false;
            for(int j = 0; j < i;j++){
                if(dp[j] && nums[j]+j>=i){
                    dp[i]  = true;
                }
            }
        }

        return dp[nums.length - 1];

    }

}
