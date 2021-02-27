package com.leetcode.no1811;

public class Solution01 {

    public int cuttingRope(int n) {

        int[] dp = new int[n+1];
        if(n<=3){ return n-1; }

        dp[1] = 1;


        for(int i = 2; i <=n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i],Math.max(j,(i-j)*dp[j]));
            }
        }

        return dp[n];

    }

}
