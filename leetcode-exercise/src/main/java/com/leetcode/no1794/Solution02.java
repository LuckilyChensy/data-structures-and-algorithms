package com.leetcode.no1794;

public class Solution02 {

    public int cuttingRope(int n) {

        // 遍历各段不同的跨越间距对结果的影响
        int[] dp = new int[n+1];

        dp[2] = 1;

        for(int i = 3; i <= n; i++){
            for(int j = 1; j <= i-2;j++){
                dp[i] = Math.max(Math.max(dp[i-j],i-j)*j,dp[i]);
            }
        }

        return dp[n];
    }

}

