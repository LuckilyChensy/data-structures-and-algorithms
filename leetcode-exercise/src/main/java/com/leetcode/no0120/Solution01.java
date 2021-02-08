package com.leetcode.no0120;

import java.util.List;

public class Solution01 {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size(); // 行数
        int[][] dp = new int[n][n];

        dp[0][0] = triangle.get(0).get(0);

        for(int i = 1; i < n; i++){

            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);

            for(int j = 1; j < i; ++j){
                dp[i][j] = Math.min(dp[i-1][j-1],dp[i-1][j]) + triangle.get(i).get(j);
            }

        }

        int min = dp[n-1][0];

        for(int i = 1; i < n; i++){
            min = Math.min(min,dp[n-1][i]);
        }

        return min;
    }
}
