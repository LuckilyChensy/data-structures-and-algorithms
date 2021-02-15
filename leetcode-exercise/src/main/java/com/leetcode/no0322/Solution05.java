package com.leetcode.no0322;

public class Solution05 {

    public static int coinChange(int[] coins, int amount) {

        // 根据题目的要求,不需要处理边界条件

        int[] dp = new int[amount+1];
        dp[0] = 0;

        for(int i = 1; i <= amount; i++){

            dp[i] = Integer.MAX_VALUE;

            for(int j = 0 ; j < coins.length && i >= coins[j]; j++){
                dp[i] = Math.min(dp[i],dp[i-coins[j]+1]);
            }

        }

        return dp[amount] == Integer.MAX_VALUE?-1:dp[amount];

    }

}
