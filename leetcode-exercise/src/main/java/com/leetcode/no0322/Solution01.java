package com.leetcode.no0322;

public class Solution01 {

    public int coinChange(int[] coins, int amount) {

        // amount+1 的目的是让索引与实际表示的值对应
        int[] dp = new int[amount+1];

        // 初始化值
        dp[0] = 0;

        // 计算每个状态对应的硬币数, 记得为了对应, 索引与实际含义对应上
        for(int i = 1; i <= amount; i++){

            // 初始化为最大值, 这样第一次比较时就能初始化第一个值
            dp[i] = Integer.MAX_VALUE;

            for(int j = 0; j < coins.length; j++){
                // 当前余额不小于当前的银币值 && 前一状态不能是无穷大 && 上一状态在不同银币值的加持下对应的硬币数不同,下一状态保留最小值
                // i >= coins[j] 也可以表示下标 不能小于 0
                if(i >= coins[j] && dp[i - coins[j]]!=Integer.MAX_VALUE && dp[i - coins[j]]+1 < dp[i]){
                    dp[i] = dp[i-coins[j]] + 1;
                }
            }
        }

        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }

    }

}
