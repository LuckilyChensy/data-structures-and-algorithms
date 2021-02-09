package com.leetcode.no0062;

public class Solution01 {

    public int uniquePaths(int m, int n) {

        int[][] dp =  new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // 注意； 只有单行，单列的情况下，路劲本质上也只有一条
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        // 注意索引没有和实际业务含义一一对应时的写法
        return dp[m-1][n-1];
    }

}
