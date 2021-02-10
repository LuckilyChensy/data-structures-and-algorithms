package com.leetcode.no0674;

public class Solution01 {

    public int findLengthOfLCIS(int[] nums) {
        // 处理边界情况
        if(nums == null || nums.length == 0){
            return 0;
        }

        int result = 1;

        // 状态方程 表达截止目前坐标, 出现的最长子序列是多少
        int[] dp = new int[nums.length];

        dp[0] = 1;

        for(int i = 0; i < nums.length-1; i++){

            if(nums[i+1] > nums[i]){
                dp[i+1] = dp[i] + 1;
            }

            if(dp[i+1] > result){ result = dp[i] + 1; }
        }

        return result;
    }
}
